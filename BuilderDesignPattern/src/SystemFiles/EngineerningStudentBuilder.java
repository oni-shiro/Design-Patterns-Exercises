package SystemFiles;

import java.util.ArrayList;
import java.util.List;

public class EngineerningStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> obj = new ArrayList<>();
        obj.add("Math");
        obj.add("EVS");
        obj.add("Mechatronics");
        obj.add("Fluid Dynamics");
        this.setSubjects(obj);
        return this;
    }
}
