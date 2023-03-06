package onclass_outside;

import Onclass1.Circle;

public class TestCircle extends Circle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        TestCircle testCircle = new TestCircle();
        System.out.println("Circle's radius outside the package ---> " + testCircle.getRadius());
    }
}
