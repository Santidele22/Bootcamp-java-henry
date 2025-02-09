import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;

    public Product(BigDecimal price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getInfo(){
        System.out.println("Product: " + this.name + " price: " + this.price);
    }
}
