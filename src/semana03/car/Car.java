package semana03.car;

public class Car {
    String brand;
    int year;

    public Car (String brand, int year){
        this.brand=brand;
        this.year=year;
    }

    public void mostrarInformacion(){
        System.out.println("la marca del carro es "+brand+" el año del carro es "+ year);
    }
   
}
