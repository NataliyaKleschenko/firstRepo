package com.test.test.task.three;

public class Rectangle extends AbstractShape implements Shape {

    private double aSide;
    private double bSide;

    public Rectangle(double aSide, double bSide){
        this.aSide = aSide;
        this.bSide = bSide;
    }

    public double getASide() {return aSide;}

    public void setASide(double aSide) {this.aSide = aSide;}

    public double getBSide() {return bSide;}

    public void setBSide(double bSide) {this.bSide = bSide;}

    @Override
    public double getSquare() {
        double square = aSide * bSide;

        return square;
    }


    @Override
    double getPerimeter() {

        double perimeter = 2.0 * (aSide + bSide);
        return perimeter;
    }
}
