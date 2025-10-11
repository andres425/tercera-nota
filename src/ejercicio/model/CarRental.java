package ejercicio.model;

import java.util.ArrayList;

public class CarRental {
    public ArrayList<Car> cars;

    public CarRental() {
        this.cars = new ArrayList<>();
    }

public void addCar(Car c){
    cars.add(c);
    System.out.println("carro agregado "+c);
}

    public void showAvailableCars() {
        boolean carAvaliable = false;
        for (Car car : cars) {
            if (car.isAvaliable()) {
                System.out.println("el carro disponibles es " + car);
                carAvaliable = true;
            }
        }

        if (!carAvaliable) {
            System.out.println("no hay carrros disponibles ");
        }
    }

    public void calculateTotal(Car c, int days){
        if (c.isAvaliable()) {
            double total=c.pricePerDay*days;
            System.out.println("el total es "+total);
        }else{
            System.out.println("el carro no esta disponible");
        }
    }

    public void shearCar(String model){
        boolean found= false;
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model)) {
                System.out.println("carro encontrado es :"+car);
                found=true;
                break;
            }
        }
        if (!found) {
            System.out.println("el carro no se encuentra");
        }
    }
}
