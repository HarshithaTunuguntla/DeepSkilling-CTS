package com.search;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Shoes", "Fashion"),
            new Product("P002", "Watch", "Accessories"),
            new Product("P003", "Phone", "Electronics"),
            new Product("P004", "Laptop", "Electronics")
        };
        Product result1 = SearchService.linearSearch(products, "Phone");
        System.out.println("Linear Search Result: " + result1);

        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        Product result2 = SearchService.binarySearch(products, "Phone");
        System.out.println("Binary Search Result: " + result2);
    }
}
