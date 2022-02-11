package de.codexbella;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {
    /*
    Product testProduct1 = new Product("Tauchsäge", 70010010);
    Product testProduct2 = new Product("Führungsschiene für Tauchsäge", 70010011);
    Product testProduct3 = new Product("Winkelschleifer", 70010020);
    Product testProduct4 = new Product("Multitool", 70010030);
    Product testProduct5 = new Product("Druckluftschrauber", 70010040);
    Product testProduct6 = new Product("Absaugmobil", 70010000);
    */
    @Test
    void shouldReturnASingleProductByID() {
        Product testProduct1 = new Product("Tauchsäge", 70010010);//mache mir ein Produkt aus <name> und <id> des Produkts
        List<Product> testProductList = new ArrayList<>();//mache leere Produktliste
        testProductList.add(testProduct1);//füge testProduct1 zur Produktliste testProductList hinzu
        ProductRepo testProductRepo = new ProductRepo(testProductList);//mache mir ein ProductRepo
        Assertions.assertEquals("Tauchsäge", testProductRepo.getProductName(70010010));
    }
    @Test
    void shouldReturnProductNotInList() {
        Product testProduct1 = new Product("Tauchsäge", 70010010);//mache mir ein Produkt aus <name> und <id> des Produkts
        List<Product> testProductList = new ArrayList<>();//mache leere Produktliste
        testProductList.add(testProduct1);//füge testProduct1 zur Produktliste testProductList hinzu
        ProductRepo testProductRepo = new ProductRepo(testProductList);//mache mir ein ProductRepo
        Assertions.assertEquals("Product not part of list.", testProductRepo.getProductName(70010040));
    }
    /*
    @Test
    void shouldReturnAllProducts() {
    }
    @Test
    void shouldReturnASingleOrderWithID() {
    }
    @Test
    void shouldReturnAllOrders() {
    }
    @Test
    void placingAnOrder() {
    }

     */
}