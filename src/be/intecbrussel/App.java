package be.intecbrussel;

public class App {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        productFactory.createProducts(3);
    }
}
