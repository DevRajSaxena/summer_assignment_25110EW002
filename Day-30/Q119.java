import java.util.Scanner;

public class Q119 {

    static String[] empName = new String[10];
    static double[] salary = new double[10];
    static int count = 0;

    static void addEmployee(String name, double sal) {
        empName[count] = name;
        salary[count] = sal;
        count++;
        System.out.println("Employee Added.");
    }

    static void displayEmployees() {

        if (count == 0) {
            System.out.println("No Employee Record.");
            return;
        }

        System.out.println("\nEmployee Details");

        for (int i = 0; i < count; i++) {
            System.out.println(empName[i] + " - " + salary[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n1.Add Employee");
            System.out.println("2.Display Employees");
            System.out.println("3.Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double sal = sc.nextDouble();

                    addEmployee(name, sal);
                    break;

                case 2:
                    displayEmployees();
                    break;

                case 3:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);
    }
}