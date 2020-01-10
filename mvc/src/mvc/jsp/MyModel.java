package  mvc.jsp;

public class MyModel {
    public Student getStudent() {
        Student student = new Student();
        student.setName("Pavel");
        student.setAge(21);
        return student;
    }
}
