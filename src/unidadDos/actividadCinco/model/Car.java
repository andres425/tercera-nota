package unidadDos.actividadCinco.model;

public class Car {
    public String model;
    public double pricePerDay;
    public boolean available;

    public Car(String model, double pricePerDay, boolean available){
        this.model=model;
        this.pricePerDay=pricePerDay;
        this.available=available;
    }

    public String getModel() {
    return model;
}


    public boolean isAvaliable(){
        return available;
    }

    public String toString(){
        return model + " - $" + pricePerDay + " por día - Disponible: " + available;
    }
}
