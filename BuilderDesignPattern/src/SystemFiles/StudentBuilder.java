package SystemFiles;

import java.util.List;

public abstract class StudentBuilder {
    private int id;
    private String name;
    private String guardianName;
    private List<String> subjects;

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }

    public StudentBuilder setGuardianName(String name){
        this.guardianName = name;
        return this;
    }

    abstract public StudentBuilder setSubjects();

    public Student build(){
        Student s = new Student(this);
        return s;
    }




}
