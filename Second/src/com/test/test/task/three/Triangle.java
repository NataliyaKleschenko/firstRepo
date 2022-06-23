package com.test.test.task.three;

public class Triangle extends AbstractShape implements Shape{
    double firstSide;
    double secondSide;
    double thirdSide;


public Triangle(double firstSide, double secondSide, double thirdSide){
    this.firstSide = firstSide;
    this.secondSide = secondSide;
    this.thirdSide = thirdSide;
}

    public double getFirstSide() {return firstSide;}

    public void setFirstSide(double firstSide) {this.firstSide = firstSide;}

    public double getSecondSide() {return secondSide;}

    public void setSecondSide(double secondSide) {this.secondSide = secondSide;}

    public double getThirdSide() {return thirdSide;}

    public void setThirdSide(double thirdSide) {this.thirdSide = thirdSide;}


    public double getHeight(){

 double semiPerimeter = (firstSide + secondSide + thirdSide) / 2;
 double height = (Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide))) / firstSide;
        return height;
    }

    @Override
    public double getSquare() {

        double square = 0.5 * (firstSide * getHeight());
        return square;
    }

    @Override
    double getPerimeter() {
    double perimeter = firstSide + secondSide + thirdSide;

        return perimeter;
    }
}
