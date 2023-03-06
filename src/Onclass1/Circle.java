package Onclass1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public  Circle() {};

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    String getColor() {
        return color;
    }
}

