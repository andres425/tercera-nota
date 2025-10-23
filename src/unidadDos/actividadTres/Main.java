package unidadDos.actividadTres;

public class Main {
    public static void main(String[] args) {
        // Create Category and Products
        Category electronics = new Category("Electronics", "Devices and gadgets");
        Product phone = new Product("Smartphone", 799.99);
        Product laptop = new Product("Laptop", 1200.50);
        electronics.addProduct(phone);
        electronics.addProduct(laptop);

        // Create Customer and Order
        Customer customer = new Customer("Alice Johnson", "alice@email.com");
        Order order1 = new Order("2025-10-22");
        order1.addProduct(phone);
        order1.addProduct(laptop);

        // Customer places the order
        customer.placeOrder(order1);

        // Show information
        System.out.println(electronics.getInfo());
        System.out.println(order1.getInfo());
        System.out.println(customer.getInfo());
    }
}
