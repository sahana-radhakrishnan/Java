import java.util.Scanner;

// Payment interface with a common method
interface Payment {
    void pay(double amount);
}

// CreditCard payment implementation
class CreditCard implements Payment {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card: " + cardNumber);
    }
}

// PayPal payment implementation
class PayPal implements Payment {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal account: " + email);
    }
}

// Cash payment implementation
class Cash implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash");
    }
}

// Main class to demonstrate the payment system
public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Cash");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();
        sc.nextLine(); // consume newline

        Payment paymentMethod;

        switch (choice) {
            case 1:
                System.out.print("Enter Credit Card Number: ");
                String cardNumber = sc.nextLine();
                paymentMethod = new CreditCard(cardNumber);
                break;

            case 2:
                System.out.print("Enter PayPal Email: ");
                String email = sc.nextLine();
                paymentMethod = new PayPal(email);
                break;

            case 3:
                paymentMethod = new Cash();
                break;

            default:
                System.out.println("Invalid choice. Defaulting to Cash payment.");
                paymentMethod = new Cash();
        }

        // Using interface reference to pay
        paymentMethod.pay(amount);

        sc.close();
    }
}
