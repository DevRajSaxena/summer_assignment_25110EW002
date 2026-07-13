import java.util.Scanner;

class Inventory {
    String itemName;
    int quantity;

    void addItem(String name, int qty) {
        itemName = name;
        quantity = qty;
        System.out.println("Item Added Successfully.");
    }

    void updateQuantity(int qty) {
        quantity = qty;
        System.out.println("Quantity Updated.");
    }

    void displayItem() {
        if (itemName == null) {
            System.out.println("No Item Available.");
        } else {
            System.out.println("Item Name : " + itemName);
            System.out.println("Quantity  : " + quantity);
        }
    }
}

public class Q116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inv = new Inventory();

        int choice;

        do {
            System.out.println("\n===== Inventory Management =====");
            System.out.println("1. Add Item");
            System.out.println("2. Update Quantity");
            System.out.println("3. Display Item");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    inv.addItem(name, qty);
                    break;

                case 2:
                    System.out.print("Enter New Quantity: ");
                    qty = sc.nextInt();

                    inv.updateQuantity(qty);
                    break;

                case 3:
                    inv.displayItem();
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