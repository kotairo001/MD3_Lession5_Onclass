package onclass2;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Jack");
        System.out.println("Student's name (inside the package):" + student.getName());
        student.setClassroom("COA");
        System.out.println("Student's class (inside the package):" + student.getClassroom());

    }
}
