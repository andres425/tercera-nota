package unidadDos.actividadCuatro.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {
    public ArrayList<Product> products;
    public HashMap<String, Product> catalog;

    public Inventory() {
        this.products= new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
        System.out.println("el producto agregado fue : " + p);
    }

    public void showProducts() {
        for (Product product : products) {
            System.out.println("el producto es " + product);
        }
    }

    public void searchProduct(String code) {
        boolean found = false;
        for (Product product : products) {
            if (product.getCode().equalsIgnoreCase(code)) {
                System.out.println("el producto encontrado es" + product);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("el producto no existe");
        }
    }

}
