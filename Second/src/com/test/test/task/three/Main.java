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
        System.out.printf("Area of the triangle: %.2f\n",trigSqr);
        final double trigPer = triangle.getPerimeter();
        System.out.printf("Perimeter of the triangle: %.2f\n",trigPer);
    }

    private static void rectangleCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the first side...");
        final double side1 = Double.parseDouble(scanner.next());
        System.out.println("Enter the value of the second side...");
        final double side2 = Double.parseDouble(scanner.next());

        Rectangle rectangle = new Rectangle(side1, side2);
        final double rectSqr = rectangle.getSquare();
        System.out.printf("Area of the rectangle: %.2f\n",rectSqr);
        final double rectPer = rectangle.getPerimeter();
        System.out.printf("Perimeter of the rectangle: %.2f\n",rectPer);
    }

    private static void circleCalculator() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius value...");
        final double value = Double.parseDouble(scanner.next());

        Circle circle = new Circle(value);
        final double circleSqr = circle.getSquare();
        final double circlePerm = circle.getPerimeter();
        System.out.printf("Area of the circle: %.2f\n",circleSqr);
        System.out.printf("Circle perimeter: %.2f\n",circlePerm);
    }
}
