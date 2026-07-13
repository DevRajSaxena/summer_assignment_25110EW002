import java.util.Scanner;

public class Q118 {

    static String[] books = new String[10];
    static int count = 0;

    static void addBook(String name) {
        books[count++] = name;
        System.out.println("Book Added.");
    }

    static void displayBooks() {
        if (count == 0) {
            System.out.println("No Books Available.");
            return;
        }

        System.out.println("Books:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Add Book");
            System.out.println("2.Display Books");
            System.out.println("3.Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book Name: ");
                    addBook(sc.nextLine());
                    break;

                case 2:
                    displayBooks();
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