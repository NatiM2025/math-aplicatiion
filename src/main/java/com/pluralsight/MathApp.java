package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Excersice 3.1
        double bobSalary = 100_000.68;
        double garySalary = 100_000.49;
        double highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is: " + highestSalary);

        //Excersice 3.2

        double carPrice = 25999;
        double truckPrice = 43999;
        double lowestPrice = Math.min(carPrice,truckPrice);
        System.out.println(lowestPrice);

        //Excersice 3.3

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius,2);
        System.out.println(area);
        System.out.println(Math.round(area));

        //Excersice 3.4

        double numberValue = 5.0;
        double squareRoot = Math.sqrt(numberValue);
        System.out.println(squareRoot);

        //Excersice 3.5
        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.sqrt(Math.pow(y2 - y1,2)));
        System.out.println("The distance between the points is " + distance);

    }
}
