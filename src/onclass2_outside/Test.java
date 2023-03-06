package onclass2_outside;

import onclass2.Student;

public class Test extends Student {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Student's name (outside the package): " + student.getName());
        System.out.println("Student's name (outside the package): " + student.getClassroom());
        Test newTest = new Test();
        newTest.setName("James");
        System.out.println("Student's name (outside the package from extend): " + newTest.getName());

    }
}
