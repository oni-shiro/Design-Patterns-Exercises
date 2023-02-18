package SystemFiles;

public class MedicalStudentBuilder extends StudentBuilder{

    public MedicalStudentBuilder setSubjects() {
        MedicalStudentBuilder obj = new MedicalStudentBuilder();
        obj.getSubjects().add("Biology");
        obj.getSubjects().add("Anatomy");
        obj.getSubjects().add("Medicine");
        return obj;
    }
}
