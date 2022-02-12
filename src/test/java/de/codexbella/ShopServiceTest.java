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
    @Test
    void shouldReturnAllProducts() {
        Product testProduct1 = new Product("Tauchsäge", 70010010);
        Product testProduct2 = new Product("Führungsschiene für Tauchsäge", 70010011);
        Product testProduct3 = new Product("Winkelschleifer", 70010020);
        Product testProduct4 = new Product("Multitool", 70010030);
        Product testProduct5 = new Product("Druckluftschrauber", 70010040);
        Product testProduct6 = new Product("Absaugmobil", 70010000);

        List<Product> testProductList = new ArrayList<>();

        testProductList.add(testProduct1);
        testProductList.add(testProduct2);
        testProductList.add(testProduct3);
        testProductList.add(testProduct4);
        testProductList.add(testProduct5);
        testProductList.add(testProduct6);

        ProductRepo testProductRepo = new ProductRepo(testProductList);
        String expected = "[product name: Tauchsäge, product id: 70010010, product name: Führungsschiene für Tauchsäge, product id: 70010011, product name: Winkelschleifer, product id: 70010020, product name: Multitool, product id: 70010030, product name: Druckluftschrauber, product id: 70010040, product name: Absaugmobil, product id: 70010000]";
        Assertions.assertEquals(expected, testProductRepo.getProductList().toString());
    }
    @Test
    void shouldReturnASingleOrderByID() {
        Product testProduct1 = new Product("Tauchsäge", 70010010);
        Product testProduct2 = new Product("Führungsschiene für Tauchsäge", 70010011);
        Product testProduct3 = new Product("Winkelschleifer", 70010020);
        Product testProduct4 = new Product("Multitool", 70010030);
        Product testProduct5 = new Product("Druckluftschrauber", 70010040);
        Product testProduct6 = new Product("Absaugmobil", 70010000);
        Product testProduct7 = new Product("Kompressor", 70010001);

        List<Product> productsForOrder1 = new ArrayList<>();
        productsForOrder1.add(testProduct1);
        productsForOrder1.add(testProduct3);
        productsForOrder1.add(testProduct5);

        List<Product> productsForOrder2 = new ArrayList<>();
        productsForOrder2.add(testProduct4);

        List<Product> productsForOrder3 = new ArrayList<>();
        productsForOrder3.add(testProduct1);
        productsForOrder3.add(testProduct6);

        List<Product> productsForOrder4 = new ArrayList<>();
        productsForOrder4.add(testProduct2);
        productsForOrder4.add(testProduct3);
        productsForOrder4.add(testProduct5);
        productsForOrder4.add(testProduct6);
        productsForOrder4.add(testProduct7);

        Order testOrder1 = new Order(1001, productsForOrder1);
        Order testOrder2 = new Order(1002, productsForOrder2);
        Order testOrder3 = new Order(1003, productsForOrder3);
        Order testOrder4 = new Order(1004, productsForOrder4);

        List<Order> testOrderList = new ArrayList<>();
        testOrderList.add(testOrder1);
        testOrderList.add(testOrder2);
        testOrderList.add(testOrder3);
        testOrderList.add(testOrder4);

        OrderRepo testOrderRepo = new OrderRepo(testOrderList);

        String expected = "Order no. 1002, [product name: Multitool, product id: 70010001]";

        Assertions.assertEquals(expected, testOrderRepo.getOrder(1002).toString());
    }
    /*
    @Test
    void shouldReturnAllOrders() {
        Product testProduct1 = new Product("Tauchsäge", 70010010);
        Product testProduct2 = new Product("Führungsschiene für Tauchsäge", 70010011);
        Product testProduct3 = new Product("Winkelschleifer", 70010020);
        Product testProduct4 = new Product("Multitool", 70010030);
        Product testProduct5 = new Product("Druckluftschrauber", 70010040);
        Product testProduct6 = new Product("Absaugmobil", 70010000);

        List<Product> listOfAllTestProducts = new ArrayList<>();

        listOfAllTestProducts.add(testProduct1);
        listOfAllTestProducts.add(testProduct2);
        listOfAllTestProducts.add(testProduct3);
        listOfAllTestProducts.add(testProduct4);
        listOfAllTestProducts.add(testProduct5);
        listOfAllTestProducts.add(testProduct6);

        ProductRepo testProductRepo = new ProductRepo(listOfAllTestProducts);

        List<Product> productsForOrder1 = new ArrayList<>();
        productsForOrder1.add(testProduct1);
        productsForOrder1.add(testProduct3);
        productsForOrder1.add(testProduct5);

        List<Product> productsForOrder2 = new ArrayList<>();
        productsForOrder2.add(testProduct4);

        List<Product> productsForOrder3 = new ArrayList<>();
        productsForOrder3.add(testProduct1);
        productsForOrder3.add(testProduct6);

        List<Product> productsForOrder4 = new ArrayList<>();
        productsForOrder4.add(testProduct2);
        productsForOrder4.add(testProduct3);
        productsForOrder4.add(testProduct5);
        productsForOrder4.add(testProduct6);

        Order testOrder1 = new Order(1001, productsForOrder1);
        Order testOrder2 = new Order(1002, productsForOrder2);
        Order testOrder3 = new Order(1003, productsForOrder3);
        Order testOrder4 = new Order(1004, productsForOrder4);
    }
    @Test
    void placingAnOrder() {
    }

     */
}