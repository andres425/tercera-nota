package UnidadUnoActividad;

public class Main {
    public static void main(String[] args) {
        // Create two products
        Product p1 = new Product("Wireless Mouse", 25.99, 30);
        Product p2 = new Product("Keyboard", 49.99, 15);

        // Show initial info
        System.out.println("=== Initial Stock ===");
        p1.showProduct();
        p2.showProduct();

        // Sell some units
        System.out.println("=== Selling Products ===");
        p1.sell(5);
        p2.sell(20); // should show "not enough stock"

        // Restock
        System.out.println("=== Restocking ===");
        p2.restock(10);

        // Show final info
        System.out.println("=== Final Stock ===");
        p1.showProduct();
        p2.showProduct();
    }
}
