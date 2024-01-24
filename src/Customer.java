import java.util.ArrayList;
import java.util.List;

// Adding Attributes
public class Customer {
    private String name;
    private List<Product> purchasedProducts;

    // Create a constructor with a parameter of string name
    public Customer(String name) {
        this.name = name;
        this.purchasedProducts = new ArrayList<>();
    }
    // implement getters for product name and product list
    public String getName() {
        return name;
    }

    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }
    //Create method for adding a product to the shopping list
    public void addProductToList(Product Product) {
        purchasedProducts.add(Product);
    }
    // Create a method that calculates the total amount of the product purchased
    public double calculateTotalPurchaseAmount() {
        double totalAmount = 0.0;
        for(Product Product : purchasedProducts) {
            totalAmount += Product.getPrice();
        }
        return totalAmount;
    }
}
