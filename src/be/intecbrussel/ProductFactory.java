package be.intecbrussel;

import java.util.*;

public class ProductFactory {

    private ProductSorter productSorter;
    private String[] foodProducts  = {"Apple", "Steak", "Potatoes", "Salad", "Pear"};
    private String[] healthPoducts  = {"Face cream", "Vitamins", "Eye drops", "Toothpaste", "Shampoo"};
    private String[] electricProducts  = {"Hair dryer", "Vacuum", "Mixer", "Washing machine", "Dishwasher"};

    public void ProductFactory(ProductSorter productSorter){
        this.productSorter = productSorter;
    }

    public void createProducts(int amount){

        



        /*Map<String[], String> prod = new HashMap<>();



        String key = prod.getKey();
        String values = (String) mapentry.getValue();

        prod.put(foodProducts,foodProducts[pos]);
        prod.put(healthPoducts,healthPoducts[pos]);
        prod.put(electricProducts,electricProducts[pos]);



        for(Map.Entry mapentry : prod.entrySet()){

            System.out.println("Key : " + key + mapentry.getValue());
        }
*/

    }
}
