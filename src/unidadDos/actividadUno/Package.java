package unidadDos.actividadUno;

public class Package {
    public String tranckingCode;
    public double weight;

    public Package(String tranckingCode,double weight){
        this.tranckingCode=tranckingCode;
        this.weight=weight;
    }

    public void showPackage(){
        System.out.println("el codigo de seguimiento es  "+tranckingCode+" y el peso es "+weight);
    }
}
