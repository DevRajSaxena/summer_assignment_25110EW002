import java.util.Scanner;

public class Q117 {

    public static void display(String[] name, int[] marks, int n) {
        System.out.println("\nStudent Records");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + name[i] + " - " + marks[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = new String[10];
        int[] marks = new int[10];

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        display(name, marks, n);
    }
}