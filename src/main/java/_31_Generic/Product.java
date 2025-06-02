package _31_Generic;

public class Product {
    public static void main(String[] args) {
        ProductController<String> productController = new ProductController<>("Laptop: ", "Intel i7, 16GM RAM");
        ProductController<Double> productController1 = new ProductController<>("Smartphone: ", 799.99);
        ProductController<Boolean> productController2 = new ProductController<>("Available", true);
        System.out.println(productController);
        System.out.println(productController1);
        System.out.println(productController2);
    }
}
