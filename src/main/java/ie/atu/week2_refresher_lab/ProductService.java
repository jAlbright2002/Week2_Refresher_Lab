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

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void updateProduct(Product product, Long id) {
        //use id to find original and replace
        for (Product product1 : productList) {
            if (product1.getId().equals(id)) {
                product1.setName(product.getName());
                product1.setPrice(product.getPrice());
                break;
            }
        }
    }

    public void deleteProduct(Long id) {
        productList.removeIf(product -> product.getId().equals(id));
    }
}
