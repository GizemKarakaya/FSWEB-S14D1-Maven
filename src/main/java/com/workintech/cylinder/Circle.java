package com.workintech.cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius > 0 ? radius :0;
        //Math.max(radius,0);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
