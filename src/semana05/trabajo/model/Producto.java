package semana05.trabajo.model;

public class Producto {
     public String name;
    public double price;

    public Producto(String name, double price){
        this.name=name;
        this.price=price;
    }

    public void showInfo(){
        System.out.println("el nombre del producto es: "+ name);
        System.out.println("el precio del producto es: "+price);
    }
}
