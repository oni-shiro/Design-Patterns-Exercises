package SystemFiles;

public class Director {

    private StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student getStudent(){
        Student st = null;
        if(studentBuilder instanceof  EngineerningStudentBuilder){
            st= studentBuilder.setName("sinchan").setGuardianName("sanjib").setSubjects().build();

        }else if(studentBuilder instanceof  MedicalStudentBuilder){
            st = studentBuilder.setSubjects().setName("John").setGuardianName("Doe").build();
        }
        return st;

    }

}
