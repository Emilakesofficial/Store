public class Cashier extends Staff {
    // Declare attribute
    private String name;
    // create cashier constructor // super() to inherit the role, sex attributes from the staff class.
    public Cashier(String role, String sex, String name) {
        super(role, sex, name);
        this.name = name;
    }
    // set getter method method for name.
    public String getName() {
        return name;
    }
    // create a method which allows the perform the function of being able to print receipts.
    public void printReceipts(Customer customer) {
        System.out.println("Receipt for " + customer.getName() + ":");
        System.out.println("-----");
        for(Product Product : customer.getPurchasedProducts()) {
            System.out.println(Product.getName() + "$" + Product.getPrice());
        }
        System.out.println("Total Amount: $" + customer.calculateTotalPurchaseAmount());
        System.out.println("-----");
        System.out.println("Thank you for shopping with us! " + customer.getName());
    }
}
