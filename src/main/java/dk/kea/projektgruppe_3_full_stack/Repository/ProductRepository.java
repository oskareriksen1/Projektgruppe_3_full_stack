package dk.kea.projektgruppe_3_full_stack.Repository;

import dk.kea.projektgruppe_3_full_stack.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProductRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Product> findAll() {
        return jdbcTemplate.query("SELECT * FROM products", new ProductRowMapper());
    }

    public Optional<Product> findById(Long id) {
        return jdbcTemplate.query(
                "SELECT * FROM products WHERE id = ?",
                new Object[]{id},
                new ProductRowMapper()
        ).stream().findFirst();
    }

    public int save(Product product) {
        if (product.getId() == null) {
            return jdbcTemplate.update(
                    "INSERT INTO products (product_name, product_link, price) VALUES (?, ?, ?)",
                    product.getProductName(), product.getProductLink(), product.getPrice()
            );
        } else {
            return jdbcTemplate.update(
                    "UPDATE products SET product_name = ?, product_link = ?, price = ? WHERE id = ?",
                    product.getProductName(), product.getProductLink(), product.getPrice(), product.getId()
            );
        }
    }

    public int deleteById(Long id) {
        return jdbcTemplate.update(
                "DELETE FROM products WHERE id = ?",
                id
        );
    }

    private static class ProductRowMapper implements RowMapper<Product> {
        @Override
        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            Product product = new Product();
            product.setId(rs.getLong("id"));
            product.setProductName(rs.getString("product_name"));
            product.setProductLink(rs.getString("product_link"));
            product.setPrice(rs.getBigDecimal("price"));
            return product;
        }
    }
}
