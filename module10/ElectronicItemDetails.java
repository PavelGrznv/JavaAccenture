import java.util.HashMap;

public class ElectronicItemDetails {

    public double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {
        Double price = itemHashMap.get(name);

        if (price == null) {
            throw new IllegalArgumentException("Item not found: " + name);
        }

        return price;
    }

    public static void main(String[] args) {
        HashMap<String, Double> itemHashMap = new HashMap<>();

        itemHashMap.put("TV", 499.99);
        itemHashMap.put("Refrigerator", 649.99);
        itemHashMap.put("Washing Machine", 399.99);
        itemHashMap.put("Laptop", 899.99);

        ElectronicItemDetails details = new ElectronicItemDetails();

        System.out.println("Price of TV is " + details.returnPriceOfItem(itemHashMap, "TV"));
    }
}