import java.util.Scanner;
class Ticket {
    int seats = 10;

    void bookTicket(int n) {
        if (n <= seats) {
            seats -= n;
            System.out.println("Ticket Booked Successfully.");
        } else {
            System.out.println("Seats Not Available.");
        }
    }

    void availableSeats() {
        System.out.println("Available Seats = " + seats);
    }
}

public class Q111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ticket t = new Ticket();

        int choice;

        do {
            System.out.println("\n1.Book Ticket");
            System.out.println("2.Check Available Seats");
            System.out.println("3.Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Number of Tickets: ");
                    t.bookTicket(sc.nextInt());
                    break;
                case 2:
                    t.availableSeats();
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