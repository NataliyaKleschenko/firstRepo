package com.test.test.task.three;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("choose a shape...");
            System.out.println("enter \"EXIT\" to exit");

            String userChoice;
            userChoice = scanner.nextLine();
            if (!userChoice.equalsIgnoreCase("exit")) {

                switch (userChoice) {

                    case "circle":
                        circleCalculator();
                        break;
                    case "rectangle":
                        rectangleCalculator();
                        break;
                    case "triangle":
                        triangleCalculator();
                        break;
                    default:
                        System.out.println("You entered an invalid value");
                        break;
                }

            } else{
                      break;
            }
        }
    }
    private static void triangleCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the base of the triangle...");
        final double base = Double.parseDouble(scanner.next());
        System.out.println("Enter the value of the leg of the triangle...");
        final double leg = Double.parseDouble(scanner.next());
        System.out.println("Enter the value of the hypotenuse");
        final double hypotenuse = Double.parseDouble(scanner.next());
        Triangle triangle = new Triangle(base,leg,hypotenuse);
        final double trigSqr = triangle.getSquare();
        System.out.println("Area of the triangle: " + trigSqr);
        final double trigPer = triangle.getPerimeter();
        System.out.println("Perimeter of the triangle: " + trigPer);
    }

    private static void rectangleCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the first side...");
        final double side1 = Double.parseDouble(scanner.next());
        System.out.println("Enter the value of the second side...");
        final double side2 = Double.parseDouble(scanner.next());

        Rectangle rectangle = new Rectangle(side1, side2);
        final double rectSqr = rectangle.getSquare();
        System.out.println("Area of the rectangle: " + rectSqr);
        final double rectPer = rectangle.getPerimeter();
        System.out.println("Perimeter of the rectangle: " + rectPer);
    }

    private static void circleCalculator() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius value...");
        final double value = Double.parseDouble(scanner.next());

        Circle circle = new Circle(value);
        final double circleSqr = circle.getSquare();
        final double circlePerm = circle.getPerimeter();
        System.out.println("Area of the circle: " + circleSqr);
        System.out.println("Circle perimeter: " + circlePerm);
    }
}
