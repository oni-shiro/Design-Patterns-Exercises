package SystemFiles;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private String guardianName;
    private List<String> subjects;


    public Student(StudentBuilder sb) {
        this.id = sb.getId();
        this.name = sb.getName();
        this.guardianName = sb.getGuardianName();
        this.subjects = sb.getSubjects();
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", guardianName='" + guardianName + '\'' +
                ", subjects=" + subjects +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
