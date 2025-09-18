package semana03;

class Calculator {

    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public int sumar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public int sumar(String num1, String num2) {
        try {
            int num1Int = Integer.parseInt(num1);
            int num2Int = Integer.parseInt(num2);

            return num1Int + num2Int;
        } catch (NumberFormatException e) {
            System.out.println("el string esta vacio o no contiene un numero entero");
            return 0;
        }
    }

  
}