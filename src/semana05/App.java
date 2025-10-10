package semana05;

import semana05.model.Student;

public class App {
    public static void main(String[] args) {
        Student estudiante1 = new Student("andres", 4.0);
        Student estudiante2 = new Student("mauricio", 4.5);

        if (estudiante1.grade>=2.9) {
            System.out.println("el estudiante aprobo");
        }else{
            System.out.println("el estudiante no aprobo");
        }
        
        
        
    }
}
