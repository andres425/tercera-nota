package unidadDos.actividadCuatro;

import unidadDos.actividadCuatro.model.Inventory;
import unidadDos.actividadCuatro.model.Product;

public class Main {
public static void main(String[] args) {
    Inventory inventory = new Inventory();
    
    inventory.addProduct(new Product("arroz", "1", 100));
    inventory.addProduct(new Product("azucar", "2", 200));
    inventory.addProduct(new Product("cafe", "3", 300));

    inventory.searchProduct("1");
}    
}
