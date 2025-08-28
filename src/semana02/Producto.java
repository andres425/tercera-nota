package semana02;
public class Producto {
    String nombre;
    float precio;
    int cantidad;

    void vender(int amount) {
        if (cantidad > amount) {
            cantidad -= amount;
            System.out.println("vendi " + amount + " productos de " + nombre + " y me quedaron " + cantidad);
        } else {
            System.out.println("no hay suficiente en stok");
        }
    }

    void comprar(int amount) {
        cantidad += amount;
        System.out.println("compre " + amount + " y ahora tengo " + cantidad + " de " + nombre);
    }

    void mostrarProducto() {
        System.out.println("tengo " + cantidad + " productos de " + nombre + " con un precio de " + precio);
    }

}
