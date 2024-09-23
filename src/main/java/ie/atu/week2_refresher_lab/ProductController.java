package ie.atu.week2_refresher_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService service;

    @Autowired
    ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product) {
        //logic to add products
        service.addProduct(product);
        return product;
    }

}
