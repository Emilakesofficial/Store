public class Product {
    // Adding attributes
    private String name;
    private double price;

    // Create a constructor that can house the product name and price
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // setting getter methods for both name and price
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
