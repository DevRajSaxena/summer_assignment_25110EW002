import java.util.Scanner;
class Library {
    String bookName;
    boolean issued = false;
    void addBook(String name) {
        bookName = name;
        System.out.println("Book Added Successfully.");
    }
    void issueBook() {
        if (bookName == null) {
            System.out.println("No book available.");
        } else if (issued) {
            System.out.println("Book already issued.");
        } else {
            issued = true;
            System.out.println("Book Issued Successfully.");
        }
    }
    void returnBook() {
        if (issued) {
            issued = false;
            System.out.println("Book Returned Successfully.");
        } else {
            System.out.println("Book is not issued.");
        }
    }
    void displayBook() {
        if (bookName == null) {
            System.out.println("No book available.");
        } else {
            System.out.println("Book Name : " + bookName);
            System.out.println("Status : " + (issued ? "Issued" : "Available"));
        }
    }
}
public class Q109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        int choice;
        do {
            System.out.println("\n1.Add Book");
            System.out.println("2.Issue Book");
            System.out.println("3.Return Book");
            System.out.println("4.Display Book");
            System.out.println("5.Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Book Name: ");
                    lib.addBook(sc.nextLine());
                    break;
                case 2:
                    lib.issueBook();
                    break;
                case 3:
                    lib.returnBook();
                    break;
                case 4:
                    lib.displayBook();
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