import java.util.Scanner;

class Calculator {

    // Method 1: Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method 3: Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Calculator with Method Overloading");

        System.out.println("\n1. Add two integers");
        System.out.print("Enter first integer: ");
        int int1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int int2 = sc.nextInt();
        System.out.println("Result = " + calc.add(int1, int2));

        System.out.println("\n2. Add two doubles");
        System.out.print("Enter first double: ");
        double double1 = sc.nextDouble();
        System.out.print("Enter second double: ");
        double double2 = sc.nextDouble();
        System.out.println("Result = " + calc.add(double1, double2));

        System.out.println("\n3. Add three integers");
        System.out.print("Enter first integer: ");
        int int3 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int int4 = sc.nextInt();
        System.out.print("Enter third integer: ");
        int int5 = sc.nextInt();
        System.out.println("Result = " + calc.add(int3, int4, int5));

        sc.close();
    }
}
