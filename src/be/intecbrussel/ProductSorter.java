package be.intecbrussel;

import java.util.List;

public class ProductSorter {

    private List<Product> products;
    private List<FoodProduct> foodProducts;
    private List<HealthProduct> healthProducts;
    private List<ElectricProduct> electricProducts;

    public List<FoodProduct> getFoodProducts() {
        return foodProducts;
    }

    public List<HealthProduct> getHealthProducts() {
        return healthProducts;
    }

    public List<ElectricProduct> getElectricProducts() {
        return electricProducts;
    }

    public void SortProduct(Product product){}
}
