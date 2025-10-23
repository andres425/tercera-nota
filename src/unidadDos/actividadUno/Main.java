package unidadDos.actividadUno;

public class Main {

    public static void main(String[] args) {
        Package p1 = new Package("PKG123", 5.0);
        Package p2 = p1;
        p2.weight = 10.0;

        System.out.println("informacion p1");
        p1.showPackage();

        System.out.println("\nExplicación:");
        System.out.println("Tanto p1 como p2 apuntan al mismo objeto en memoria,");
        System.out.println("por eso, cuando se cambia el peso desde p2,");
        System.out.println("también se ve modificado al mostrarlo desde p1.");

    }
}
