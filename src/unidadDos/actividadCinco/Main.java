package unidadDos.actividadCinco;
import unidadDos.actividadCinco.model.Car;
import unidadDos.actividadCinco.model.CarRental;


public class Main {
    public static void main(String[] args) {
        CarRental rental = new CarRental();

        rental.addCar(new Car("Toyota", 10, true));
        rental.addCar(new Car("Corolla", 20, true));
        rental.addCar(new Car("Mazda", 15, false));

        System.out.println("\n--- Carros disponibles ---");
        rental.showAvailableCars();

        System.out.println("\n--- Cálculo de alquiler ---");
        Car carPrueba = new Car("Nissan", 30, true);
        rental.addCar(carPrueba);
        rental.calculateTotal(carPrueba, 5); // Ejemplo: 5 días

        rental.shearCar("Toyota");
    }
}
