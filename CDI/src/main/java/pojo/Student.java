package pojo;
import anotation.Anatations;
import interfaces.iPerson;


@Anatations.StudentAnotation
public class Student implements iPerson {
    private String name;

    public String getName() {
        name = "Student";
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
