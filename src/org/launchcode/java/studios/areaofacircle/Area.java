package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        try {
            if (input.hasNextDouble()) {
                double circleRadius = input.nextDouble();
                while (circleRadius < 0) {
                    System.err.println("Number must be positive!");
                    System.out.println("Enter the radius of the circle:");
                    circleRadius=input.nextDouble();
                }
                double circleArea = Circle.getArea(circleRadius);
                System.out.println("The area of a circle of radius " + circleRadius + " is: " + circleArea);

            }
        } catch (Exception error){
            System.err.println("Invalid input!");
            return;
        }
        System.out.close();
    }

}
