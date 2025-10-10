package semana05.trabajo;

import java.util.ArrayList;

import semana05.trabajo.model.Producto;

public class App {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Producto("arroz",2000));
        productos.add(new Producto("cafe",2500));
        productos.add(new Producto("azucar",3000));
        productos.add(new Producto("sal",1000));
        productos.add(new Producto("aceite",10000));

        for (Producto producto : productos) {
            producto.showInfo();
        }

    }
}
