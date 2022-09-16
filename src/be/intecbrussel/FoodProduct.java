package be.intecbrussel;

public class FoodProduct extends Product{

    public FoodProduct(String name, int productId) {
        super(name, productId);
    }

    @Override
    public String toString() {
        return "FoodProduct{}";
    }
}
