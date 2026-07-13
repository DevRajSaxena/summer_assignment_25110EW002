import java.util.Scanner;

class Contact {
    String name;
    String phone;

    void addContact(String n, String p) {
        name = n;
        phone = p;
        System.out.println("Contact Saved Successfully.");
    }

    void displayContact() {
        if (name == null) {
            System.out.println("No Contact Found.");
        } else {
            System.out.println("Name : " + name);
            System.out.println("Phone : " + phone);
        }
    }

    void deleteContact() {
        name = null;
        phone = null;
        System.out.println("Contact Deleted.");
    }
}

public class Q112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contact c = new Contact();

        int choice;

        do {
            System.out.println("\n1.Add Contact");
            System.out.println("2.Display Contact");
            System.out.println("3.Delete Contact");
            System.out.println("4.Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();
                    c.addContact(name, phone);
                    break;
                case 2:
                    c.displayContact();
                    break;
                case 3:
                    c.deleteContact();
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
