import SystemFiles.Director;
import SystemFiles.EngineerningStudentBuilder;
import SystemFiles.Student;
import SystemFiles.StudentBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StudentBuilder engineerSt = new EngineerningStudentBuilder();
        Director d = new Director(engineerSt);
        Student st = d.getStudent();
        System.out.print(st.toString());
    }
}