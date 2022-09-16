package be.intecbrussel;

public class HealthProduct extends Product{
    public HealthProduct(String name, int productId) {
        super(name, productId);
    }

    @Override
    public String toString() {
        return "HealthProduct{}";
    }
}
