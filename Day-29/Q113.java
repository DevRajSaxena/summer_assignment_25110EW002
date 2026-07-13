import java.util.Scanner;

public class Q113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double a, b;

        do {
            System.out.println("\n===== Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Two Numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a + b));
                    break;

                case 2:
                    System.out.print("Enter Two Numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a - b));
                    break;

                case 3:
                    System.out.print("Enter Two Numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a * b));
                    break;

                case 4:
                    System.out.print("Enter Two Numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();

                    if (b != 0)
                        System.out.println("Result = " + (a / b));
                    else
                        System.out.println("Division by zero not possible.");
                    break;

                case 5:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);
    }
}