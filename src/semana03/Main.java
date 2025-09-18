package semana03;

public class Main {
      public static void main(String[] args) {
        Calculator num = new Calculator();

        System.out.println(num.sumar(1, 2));
        System.out.println(num.sumar(1, 2, 3));
        System.out.println(num.sumar(1, 2.2));
        System.out.println(num.sumar("2", "3"));
    }
}
