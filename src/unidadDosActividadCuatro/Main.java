package unidadDosActividadCuatro;

import unidadDosActividadCuatro.model.Inventory;
import unidadDosActividadCuatro.model.Product;

public class Main {
public static void main(String[] args) {
    Inventory inventory = new Inventory();
    
    inventory.addProduct(new Product("arroz", "1", 100));
    inventory.addProduct(new Product("azucar", "2", 200));
    inventory.addProduct(new Product("cafe", "3", 300));

    inventory.searchProduct("1");
}    
}
