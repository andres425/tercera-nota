package semana05.model;

public class Employee {
    public String role;

    public Employee(String role){
        this.role=role;
    }

    public void showResponsabities(){
        switch (role) {
            case "Manager" :
            System.out.println("maneja el equipo");
            break;
            case "Developer" :
            System.out.println("programa y testea");
            break;
            case "Design" :
            System.out.println("diseña");
            break;
            default:
            System.out.println("no conocido");
                break;
        }
    }
}
