package onclass2;

public class Student {
    private String name = "John";
    private String classroom = "CO2";

    public Student() {

    }
    protected void setName(String name) {
        this.name = name;
    }

    void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public String getClassroom() {
        return classroom;
    }
}
