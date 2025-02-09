import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,Product> products = new HashMap<>();
        Product product1 = new Product(new BigDecimal("19.99"), "Laptop");
        Product product2 = new Product(new BigDecimal("9.99"), "Mouse");
        Product product3 = new Product(new BigDecimal("29.99"), "Keyboard");

        // Agregar productos al HashMap
        products.put(product1.getName(), product1);
        products.put(product2.getName(), product2);
        products.put(product3.getName(), product3);

        for (Map.Entry<String, Product> entry : products.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }


}