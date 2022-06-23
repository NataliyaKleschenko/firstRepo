package com.test.test.task.three;

public class Circle extends AbstractShape implements Shape{

    private double radius;

    public Circle(double rad){
        this.radius = rad;
    }

    public double getRadius() {return radius;}

    public void setRadius(double radius) {this.radius = radius;}

    @Override
    public double getSquare() {
        double square = Math.PI * (Math.pow(radius,2));
        return square;
    }

    @Override
    double getPerimeter() {

        double perimeter = 2.0 *  Math.PI * radius;
        return perimeter;
    }
}
