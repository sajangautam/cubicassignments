import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        // Output for Question 1: Displaying Greetings
        System.out.println("\nQuestion 1: Displaying Greetings in three lines.");
        displayGreetings();
        System.out.println("\n\n");

        // Output for Question 2: Displaying Introduction
        System.out.println("Question 2: Displaying Introduction in three lines.");
        displayIntroduction();
        System.out.println("\n\n");

        // Output for Question 3: Calculating Sum and Average
        System.out.println("Question 3: Calculating Sum and Average of two numbers.");
        calculateSumAndAverage();
        System.out.println("\n\n");

        // Output for Question 4: Calculating Simple Interest
        System.out.println("Question 4: Calculating Simple Interest.");
        calculateSimpleInterest();
        System.out.println("\n\n");

        // Output for Question 5: Calculating Area
        System.out.println("Question 5: Calculating area of Circle, Rectangle, and Triangle.");
        calculateArea();
        System.out.println("\n\n");

        // Output for Question 6: Calculating Perimeter
        System.out.println("Question 6: Calculating Perimeter of Circle, Triangle, and Rectangle.");
        calculatePerimeter();
        System.out.println("\n\n");

        // Output for Question 7: Computing Volume of a Cylinder
        System.out.println("Question 7: Computing volume of a Cylinder.");
        computeCylinderVolume();
        System.out.println("\n\n");

        // Output for Question 8: Converting Temperature
        System.out.println("Question 8: Converting Fahrenheit to Celsius and vice versa.");
        convertTemperature();
        System.out.println("\n\n");

        // Output for Question 9: Converting Pounds to Kilograms
        System.out.println("Question 9: Converting Pounds to Kilograms.");
        convertPoundsToKg();
        System.out.println("\n\n");
    }

    // Question 1: Function to display greetings
    public static void displayGreetings() {
        System.out.println("Hello!");
        System.out.println("Welcome to Java Programming.");
        System.out.println("Have a great day!");
    }

    // Question 2: Function to display introduction
    public static void displayIntroduction() {
        System.out.println("My name is Sajan Gautam.");
        System.out.println("I am a computer science student.");
        System.out.println("I love coding in Java.");
    }

    // Question 3: Function to calculate sum and average
    public static void calculateSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        double average = sum / 2;
        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Average: %.2f\n", average);
    }

    // Question 4: Function to calculate simple interest
    public static void calculateSimpleInterest() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal amount (in $): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();
        System.out.print("Enter Rate of Interest (in %): ");
        double rate = scanner.nextDouble();
        double simpleInterest = (principal * time * rate) / 100;
        System.out.printf("Simple Interest: $%.2f\n", simpleInterest);
    }

    // Question 5: Function to calculate area of circle, rectangle, and triangle
    public static void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle (in cm): ");
        double radius = scanner.nextDouble();
        System.out.printf("Area of Circle: %.2f sq cm\n\n", Math.PI * radius * radius);
        System.out.print("Enter breadth of the rectangle (in cm): ");
        double breadth = scanner.nextDouble();
        System.out.print("Enter height of the rectangle (in cm): ");
        double height = scanner.nextDouble();
        System.out.printf("Area of Rectangle: %.2f sq cm\n\n", breadth * height);
        System.out.print("Enter base of the triangle (in cm):  ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the triangle (in cm): ");
        double triHeight = scanner.nextDouble();
        System.out.printf("Area of Triangle: %.2f sq cm\n", 0.5 * base * triHeight);
    }

    // Question 6: Function to calculate perimeter of circle, rectangle, and triangle
    public static void calculatePerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle (in cm): ");
        double radius = scanner.nextDouble();
        System.out.printf("Perimeter of Circle: %.2f cm\n\n", 2 * Math.PI * radius);
        System.out.print("Enter breadth of the rectangle (in cm): ");
        double breadth = scanner.nextDouble();
        System.out.print("Enter height of the rectangle (in cm): ");
        double height = scanner.nextDouble();
        System.out.printf("Perimeter of Rectangle: %.2f cm\n", 2 * (breadth + height));
    }

    // Question 7: Function to compute volume of a cylinder
    public static void computeCylinderVolume() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the cylinder (in cm): ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height of the cylinder (in cm): ");
        double height = scanner.nextDouble();
        System.out.printf("Volume of Cylinder: %.2f cubic cm\n", Math.PI * radius * radius * height);
    }

    // Question 8: Function to convert Fahrenheit to Celsius and vice versa
    public static void convertTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        System.out.printf("Temperature in Celsius: %.2f°C\n", (fahrenheit - 32) * 5 / 9);
    }

    // Question 9: Function to convert pounds to kilograms
    public static void convertPoundsToKg() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();
        System.out.printf("Weight in Kilograms: %.2f kg\n", pounds * 0.454);
    }
}
