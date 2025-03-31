import java.util.Scanner;
import java.util.*;

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
		
		// Output for Question 10(a): Calculating displacement
        System.out.println("Question 10(a): Calculating displacement.");
        calculateDisplacement();
        System.out.println("\n\n");

        // Output for Question 10(b): Calculating triangle area
        System.out.println("Question 10(b): Calculating triangle area.");
        calculateTriangleArea();
        System.out.println("\n\n");

        // Output for Question 10(c): Solving quadratic equation
        System.out.println("Question 10(c): Solving quadratic equation.");
        solveQuadraticEquation();
        System.out.println("\n\n");
		
		// Question 11
		System.out.println("Question 11: Swapping two numbers");
		swapWithTemp();
		swapWithoutTemp();
		System.out.println("\n\n");
		
		// Question 12
		System.out.println("Question 12: Display person's information");
		displayPersonInfo();
		System.out.println("\n\n");
		
		// Question 13
		System.out.println("Question 13: Print negative numbers only");
		printIfNegative();
		System.out.println("\n\n");
		
		// Question 14
		System.out.println("Question 14: Relate two integers");
		compareIntegers();
		System.out.println("\n\n");
		
		// Question 15
		System.out.println("Question 15: ASCII to character");
		asciiToChar();
		System.out.println("\n\n");		
		
		// Question 16
        System.out.println("Question 16: Check if number is even or odd");
        checkEvenOdd();
        System.out.println("\n\n");

        // Question 17
        System.out.println("Question 17: Leap Year Calculator");
        checkLeapYear();
        System.out.println("\n\n");

        // Question 18
        System.out.println("Question 18: Largest of Three Numbers");
        findLargestOfThree();
        System.out.println("\n\n");

        // Question 19
        System.out.println("Question 19: Triangle Type Checker");
        checkTriangleType();
        System.out.println("\n\n");

        // Question 20
        System.out.println("Question 20: Four-Function Calculator");
        simpleCalculator();
        System.out.println("\n\n");

        // Question 21
        System.out.println("Question 21: Day Number to Day Name");
        printDayName();
        System.out.println("\n\n");

        // Question 22
        System.out.println("Question 22: Multiplication Table");
        printMultiplicationTable();
        System.out.println("\n\n");

        // Question 23
        System.out.println("Question 23: Sum of Natural Numbers");
        sumNaturalNumbers();
        System.out.println("\n\n");

        // Question 24
        System.out.println("Question 24: Factorial Calculator");
        calculateFactorial();
        System.out.println("\n\n");

        // Question 25
        System.out.println("Question 25: Highest Score Finder");
        findHighestScore();
        System.out.println("\n\n");

        // Question 26
        System.out.println("Question 26: Number Reverser");
        reverseNumber();
        System.out.println("\n\n");

        // Question 27
        System.out.println("Question 27: Digit Sum and Product");
        calculateDigitSumProduct();
        System.out.println("\n\n");
		
		// Question 28a
        System.out.println("Question 28a: Check prime number");
        isPrimeNumber();
        System.out.println("\n\n");

        // Question 28b
        System.out.println("Question 28b: First N prime numbers");
        firstNthPrime();
        System.out.println("\n\n");

        // Question 28c
        System.out.println("Question 28c: Primes between range");
        allPrimeBetween();
        System.out.println("\n\n");

        // Question 29
        System.out.println("Question 29: Mathematical series");
        calculateSeries();
        System.out.println("\n\n");

        // Question 30
        System.out.println("Question 30: Fibonacci series");
        printFibonacciSeries();
        System.out.println("\n\n");

        // Question 31
        System.out.println("Question 31: Number pattern");
        printNumberPattern();
        System.out.println("\n\n");

        // Question 32
        System.out.println("Question 32: Array sum");
        calculateArraySum();
        System.out.println("\n\n");

        // Question 33
        System.out.println("Question 33: Sort array");
        sortArray();
        System.out.println("\n\n");

        // Question 34
        System.out.println("Question 34: Reverse array");
        reverseArray();
        System.out.println("\n\n");

        // Question 35
        System.out.println("Question 35: Second largest in array");
        findSecondLargest();
        System.out.println("\n\n");

        // Question 36
        System.out.println("Question 36: Find duplicates in array");
        findDuplicates();
        System.out.println("\n\n");

        // Question 37a
        System.out.println("Question 37a: Matrix addition");
        matrixAddition();
        System.out.println("\n\n");

        // Question 38
        System.out.println("Question 38: Check palindrome");
        checkPalindrome();
        System.out.println("\n\n");

        // Question 39
        System.out.println("Question 39: Display short name");
        displayShortName();
        System.out.println("\n\n");

        // Question 40
        System.out.println("Question 40: Reverse string");
        reverseString();
        System.out.println("\n\n");

        // Question 41
        System.out.println("Question 41: Find duplicate letters");
        findDuplicateLetters();
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
	
	// Question 10(a): Function to calculate s = ut + 1/2 * at^2
    public static void calculateDisplacement() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter initial velocity in meters (u): ");
        double u = scanner.nextDouble();
        System.out.printf("Enter time in seconds(t): ");
        double t = scanner.nextDouble();
        System.out.printf("Enter acceleration in m per square seconds (a): ");
        double a = scanner.nextDouble();
		System.out.printf("Displacement: %.2f m\n", (u * t) + (0.5 * a * t * t));    
	}

	// Question 10(b): Function to calculate triangle area given all three sides
	public static void calculateTriangleArea() {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Enter the first side of the triangle: ");
		double a = scanner.nextDouble();
		System.out.printf("Enter the second side of the triangle: ");
		double b = scanner.nextDouble();
		System.out.printf("Enter the third side of the triangle: ");
		double c = scanner.nextDouble();
		
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		
		System.out.printf("Triangle Area: %.2f square units\n", area);
	}

    // Question 10(c): Function to solve quadratic equation: x = (-b ± sqrt(b^2 - 4ac)) / (2a)
    public static void solveQuadraticEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.printf("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.printf("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double determinant = (b * b) - (4 * a * c);

        if (determinant > 0) {
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.printf("Roots are real and distinct: %.2f, %.2f\n", root1, root2);
        } else if (determinant == 0) {
            double root = -b / (2 * a);
            System.out.printf("Roots are real and equal: %.2f\n", root);
        } else {
            System.out.println("Roots are complex and imaginary.");
        }
    }
	
	// Question 11a: Swap two numbers using temp variable
	public static void swapWithTemp() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();
		
		System.out.println("\nBefore swapping: num1 = " + num1 + ", num2 = " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping (using temp): num1 = " + num1 + ", num2 = " + num2);
	}
	
	// Question 11b: Swap two numbers without temp variable
	public static void swapWithoutTemp() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();
		
		System.out.println("\nBefore swapping: num1 = " + num1 + ", num2 = " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swapping (without temp): num1 = " + num1 + ", num2 = " + num2);
	}
	
	// Question 12: Accept and display person's information
	public static void displayPersonInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		scanner.nextLine(); // consume newline
		System.out.print("Enter your nationality: ");
		String nationality = scanner.nextLine();
		
		System.out.println("\nPerson Information:");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age + " years");
		System.out.println("Nationality: " + nationality);
	}
	
	// Question 13: Print number only if negative
	public static void printIfNegative() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double number = scanner.nextDouble();
		
		if (number < 0) {
			System.out.println("You entered a negative number: " + number);
		} else {
			System.out.println("The number is not negative. Nothing to display.");
		}
	}
	
	// Question 14: Compare two integers
	public static void compareIntegers() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter second integer: ");
		int num2 = scanner.nextInt();
		
		if (num1 == num2) {
			System.out.println(num1 + " == " + num2);
		} else if (num1 > num2) {
			System.out.println(num1 + " > " + num2);
		} else {
			System.out.println(num1 + " < " + num2);
		}
	}
	
	// Question 15: Convert ASCII code to character
	public static void asciiToChar() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ASCII code (0-128): ");
		int code = scanner.nextInt();
		
		if (code >= 0 && code <= 128) {
			System.out.println("Character for ASCII " + code + ": " + (char)code);
		} else {
			System.out.println("Invalid ASCII code. Please enter between 0-128.");
		}
	}
	
	 // Question 16: Even or Odd
    public static void checkEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    // Question 17: Leap Year Calculator
    public static void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    // Question 18: Largest of Three Numbers
    public static void findLargestOfThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double n3 = scanner.nextDouble();
        double largest = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println("Largest number is: " + largest);
    }

    // Question 19: Triangle Type Checker
    public static void checkTriangleType() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three sides of triangle: \n");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }

    // Question 20: Four-Function Calculator
    public static void simpleCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        double result = 0;
        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
            default: System.out.println("Invalid operator");
        }
        System.out.println("Result: " + result);
    }

    // Question 21: Day Number to Day Name
    public static void printDayName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int day = scanner.nextInt();
        String dayName;
        switch (day) {
            case 1: dayName = "Sunday"; break;
            case 2: dayName = "Monday"; break;
            case 3: dayName = "Tuesday"; break;
            case 4: dayName = "Wednesday"; break;
            case 5: dayName = "Thursday"; break;
            case 6: dayName = "Friday"; break;
            case 7: dayName = "Saturday"; break;
            default: dayName = "Invalid day";
        }
        System.out.println("Day of week: " + dayName);
    }

    // Question 22: Multiplication Table
    public static void printMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Multiplication table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // Question 23: Sum of Natural Numbers
    public static void sumNaturalNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }

    // Question 24: Factorial Calculator
    public static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + ": " + factorial);
    }

    // Question 25: Highest Score Finder
    public static void findHighestScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        String topStudent = "";
        int topScore = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student " + (i+1) + " name: ");
            String name = scanner.next();
            System.out.print("Enter " + name + "'s score: ");
            int score = scanner.nextInt();
            
            if (score > topScore) {
                topScore = score;
                topStudent = name;
            }
        }
        System.out.println("Top student: " + topStudent + " with score " + topScore);
    }

    // Question 26: Number Reverser
    public static void reverseNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }

    // Question 27: Digit Sum and Product
    public static void calculateDigitSumProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0, product = 1, temp = num;
        
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        System.out.println("Sum of digits: " + sum);
        System.out.println("Product of digits: " + product);
    }

	// Question 28a: Check if number is prime (helper function)
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Question 28a: Check if number is prime
    public static void isPrimeNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if prime: ");
        int num = scanner.nextInt();
        System.out.println(num + (isPrime(num) ? " is prime" : " is not prime"));
    }

    // Question 28b: Find first N prime numbers
    public static void firstNthPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many primes to display: ");
        int n = scanner.nextInt();
        int count = 0, num = 2;
        System.out.println("First " + n + " prime numbers:");
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    // Question 28c: Find all primes between start and end
    public static void allPrimeBetween() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter end number: ");
        int end = scanner.nextInt();
        System.out.println("Primes between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Question 29: Mathematical series
    public static void calculateSeries() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        double sum = 0;
        long fact = 1;
        
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += (double)i / fact;
        }
        System.out.printf("Result: %.4f\n", sum);
    }

    // Question 30: Fibonacci series
    public static void printFibonacciSeries() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci numbers to display: ");
        int n = scanner.nextInt();
        int a = 1, b = 1;
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }

    // Question 31: Number pattern
    public static void printNumberPattern() {
        System.out.println("Number pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Question 32: Array sum
    public static void calculateArraySum() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:\n");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }

    // Question 33: Sort array in ascending order
    public static void sortArray() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:\n");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Question 34: Reverse array
    public static void reverseArray() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:\n");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Reversed array: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Question 35: Find second largest in array
    public static void findSecondLargest() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:\n");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second largest: " + secondLargest);
    }

    // Question 36: Find duplicates in array
    public static void findDuplicates() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:\n");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Duplicate elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        System.out.println();
    }

    // Question 37a: Matrix addition
    public static void matrixAddition() {
        int[][] matrix1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matrix2 = {{4,5,6}, {2,7,8}, {3,1,9}};
        int[][] result = new int[3][3];
        
        System.out.println("Matrix Addition Result:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Question 38: Check palindrome string
    public static void checkPalindrome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str + " is " + (str.equals(reversed) ? "" : "not ") + "a palindrome");
    }

    // Question 39: Display short name
    public static void displayShortName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        String[] names = fullName.split(" ");
        StringBuilder shortName = new StringBuilder();
        
        for (int i = 0; i < names.length; i++) {
            if (i < names.length - 1) {
                shortName.append(names[i].charAt(0)).append(". ");
            } else {
                shortName.append(names[i]);
            }
        }
        System.out.println("Short name: " + shortName);
    }

    // Question 40: Reverse string
    public static void reverseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Reversed string: " + new StringBuilder(str).reverse());
    }

    // Question 41: Find duplicate letters
    public static void findDuplicateLetters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.print("Duplicate letters: ");
        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (word.indexOf(c) != word.lastIndexOf(c) && word.indexOf(c) == i) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }
	
}
