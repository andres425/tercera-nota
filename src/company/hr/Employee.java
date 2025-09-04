package company.hr;

public class Employee {
    public String name;
    private double salary;
    protected String role;

    

    //getter
    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role =role;
    }
//getter
    public double getSalary(){
        return salary;
    }

    //setter
    public void setSalary(double salary){
        if (salary>0) {
            this.salary =salary;
        }else{
            System.out.println("el salario tiene que ser cero");
        }
    }

}
