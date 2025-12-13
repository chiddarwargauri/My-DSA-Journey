package dowhileloop.com;
import java.util.Scanner;

public class ArithmeticOperation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nEnter First number:");
            int num1 = sc.nextInt();

            System.out.println("Enter Second number:");
            int num2 = sc.nextInt();

            System.out.println("\nChoose operation:");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Division");
            System.out.println("4. Subtraction");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition = " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Multiplication = " + (num1 * num2));
                    break;

                case 3:
                    if (num2 != 0)
                        System.out.println("Division = " + (num1 / num2));
                    else
                        System.out.println("Cannot divide by zero");
                    break;

                case 4:
                    System.out.println("Subtraction = " + (num1 - num2));
                    break;

                case 5:
                    System.out.println("Modulus = " + (num1 % num2));
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);

        sc.close();
    }
}
