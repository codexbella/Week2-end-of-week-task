package de.codexbella;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private List<Product> productList;

    public ProductRepo(List<Product> productList) {
        this.productList = productList;
    }

    /*
    public ProductRepo(List<Product> productList) {
        this.productList = productList;
    }
    */

    public String getProductName(int id) {
        List<Product> productList = this.productList;
        for (int i = 0; i < productList.size(); i++) {
            Product currentProduct = productList.get(i);
            if (currentProduct.getProductID() == id) {
                return currentProduct.getName();
            }
        }
        return "Product not part of list.";
    }

    public List<Product> getProductList() {
        return productList;
    }
}
