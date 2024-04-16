package dk.kea.projektgruppe_3_full_stack.Controller;

import dk.kea.projektgruppe_3_full_stack.Model.Product;
import dk.kea.projektgruppe_3_full_stack.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/create")
    public ModelAndView createProduct(Product product, @RequestParam("imageFile") MultipartFile imageFile) {
        productService.addProduct(product);
        return new ModelAndView("redirect:/products");
    }
}
