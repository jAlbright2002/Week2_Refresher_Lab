package ie.atu.week2_refresher_lab;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> productList = new ArrayList<>();

    public List<Product> getProducts() {
        return productList;
    }

    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }

    public Product updateProduct(Product product, String name, double price) {
        productList.stream().anyMatch(product1 -> {
            if (product1.getId().equals(product.getId())) {
                product.setName(name);
                product.setPrice(price);
            }
            return false;
        });
        return product;
    }

    public void deleteProduct(Long id) {
        productList.stream().anyMatch(product -> {
            if (product.getId().equals(id)) {
                productList.remove(product);
            }
            return false;
        });
    }
}
