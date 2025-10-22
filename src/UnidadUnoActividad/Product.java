package UnidadUnoActividad;

public class Product {
    // Attributes
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to sell units
    public void sell(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println(amount + " units of " + name + " sold successfully.");
        } else {
            System.out.println("Not enough stock to sell " + amount + " units of " + name + ".");
        }
    }

    // Method to restock
    public void restock(int amount) {
        quantity += amount;
        System.out.println(amount + " units of " + name + " added to stock.");
    }

    // Method to show product info
    public void showProduct() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Stock available: " + quantity + " units");
        System.out.println("------------------------------");
    }
}
