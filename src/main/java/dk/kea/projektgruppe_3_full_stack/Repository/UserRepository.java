package dk.kea.projektgruppe_3_full_stack.Repository;

import dk.kea.projektgruppe_3_full_stack.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc
import org.springframework.jdbc.core.JdbcTemplate;


import java.util.List;

public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> getAllUsers() {
        String sql = "SELECT * FROM users";
        return jdbcTemplate.
    }
}
