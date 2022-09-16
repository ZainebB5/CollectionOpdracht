package be.intecbrussel;

public class ElectricProduct extends Product{

    public ElectricProduct(String name, int productId) {
        super(name, productId);
    }

    @Override
    public String toString() {
        return "ElectricProduct{}";
    }
}
