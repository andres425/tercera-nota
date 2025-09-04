package company;

import company.hr.Employee;

public class Main {
  public static void main(String[] args) {
    Employee empleado1 = new Employee();
    Employee empleado2 = new Employee();

    empleado1.name = "andres";
    empleado1.setRole("psychologist");
    empleado1.setSalary(1000000);

    empleado2.name = "mauricio";
    empleado2.setRole("analyst");
    empleado2.setSalary(1200000);

    System.out.println("el nombre el empleado 1 es:" + empleado1.name);
    System.out.println("el rol del trabajador 1 es:" + empleado1.getRole());
    System.out.println("el salario del trabajador 1 antes de incrementar es:" + empleado1.getSalary());
    empleado1.increaseSalary(200000);
    System.out.println("el salario del trabajador 1 despues de incrementar es:" + empleado1.getSalary());

    System.out.println("---------------------------------------------------");

    System.out.println("el nombre el empleado 2 es:" + empleado2.name);
    System.out.println("el rol del trabajador 2 es:" + empleado2.getRole());
    System.out.println("el salario del trabajador 2 antes de incrementar es:" + empleado2.getSalary());
    empleado2.increaseSalary(30000);
    System.out.println("el salario del trabajador dos antes de incrementar es:"+empleado2.getSalary());

  }
}
