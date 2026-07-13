import java.util.Scanner;

public class Q120 {

    static String[] name = new String[20];
    static int[] marks = new int[20];
    static int count = 0;

    static void addStudent(String n, int m) {
        name[count] = n;
        marks[count] = m;
        count++;
        System.out.println("Student Added.");
    }

    static void displayStudents() {

        if (count == 0) {
            System.out.println("No Student Record.");
            return;
        }

        System.out.println("\nStudent List");

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + name[i] + " - " + marks[i]);
        }
    }

    static void searchStudent(String s) {

        for (int i = 0; i < count; i++) {

            if (name[i].equalsIgnoreCase(s)) {
                System.out.println("Student Found");
                System.out.println("Name : " + name[i]);
                System.out.println("Marks : " + marks[i]);
                return;
            }
        }

        System.out.println("Student Not Found.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== Student Management =====");
            System.out.println("1.Add Student");
            System.out.println("2.Display Students");
            System.out.println("3.Search Student");
            System.out.println("4.Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String n = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int m = sc.nextInt();

                    addStudent(n, m);
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    System.out.print("Enter Name to Search: ");
                    searchStudent(sc.nextLine());
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
    }
}