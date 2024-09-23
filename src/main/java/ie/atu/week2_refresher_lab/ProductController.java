package ie.atu.week2_refresher_lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {
        //logic to get products
        return;
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product) {
        //logic to add products
        return product;
    }

}
