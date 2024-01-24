public class Main {
    public static void main(String[] args) {

        // New instance for manager // make the manager perform the function "hireStaff".
        Manager manager = new Manager();
        manager.hireStaff(new Cashier("cashier", "female", "Deyo "));


        // New instance for customer
        Customer ade = new Customer("Ade");

        // Selecting products
        Product nike = new Product("Nike Air force one ", 300);
        Product lv = new Product("LV edition ", 200);
        Product newBalance = new Product("New balance 2016 ", 500);
        Product gucci = new Product("Gucci ", 400);
        Product adidas = new Product("Adidas ", 800);

        // Adding products to product list
        ade.addProductToList(nike);
        ade.addProductToList(lv);
        ade.addProductToList(newBalance);
        ade.addProductToList(gucci);
        ade.addProductToList(adidas);

        // Calculating the total amount of products
        double totalPrice = ade.calculateTotalPurchaseAmount();

        // Making a new instance for customer and calling the print receipt method for Ade(customer).
        Cashier cashier = new Cashier("cashier 1", "female", "Deyo");
        cashier.printReceipts(ade);

    }
}
