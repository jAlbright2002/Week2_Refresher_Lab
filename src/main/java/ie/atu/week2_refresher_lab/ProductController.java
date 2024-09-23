package ie.atu.week2_refresher_lab;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService service;

    @Autowired
    ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/get")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @PostMapping("/add")
    public Product addProduct(@Valid @RequestBody Product product) {
        //logic to add products
        service.addProduct(product);
        return product;
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@Valid @RequestBody Product product, @PathVariable Long id) {
        //service logic
        service.updateProduct(product, id);
        return product;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Long id) {
        service.deleteProduct(id);
    }

}
