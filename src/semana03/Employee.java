package semana03;


public class Employee {
    public String name;
    private double salary ;
    protected String role;

//getter
public double getSalary(){
    return salary;
}
//setter
public void setSalary(double salary){
    if(salary>0){
    this.salary=salary;
}else {
    System.out.println("Salary must be greater than 0. Value not set.");
}
}
}