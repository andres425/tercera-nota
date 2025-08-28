package semana02;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        producto1.nombre = "arroz";
        producto1.precio = 2000;
        producto1.cantidad = 20;

        producto1.vender(7);
        producto1.comprar(15);
        producto1.mostrarProducto();
        System.out.println("---------------------------------------");
        Producto producto2 = new Producto();
        producto2.nombre = "arina";
        producto2.precio = 3000;
        producto2.cantidad = 30;

        producto2.vender(13);
        producto2.comprar(10);
        producto2.mostrarProducto();
    }
}
