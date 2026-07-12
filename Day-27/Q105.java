import java.util.Scanner;
public class Q105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 0;
        String name = "";
        double marks = 0;
        int choice;
        do {
            System.out.println("\n===== Student Record Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Student ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    marks = sc.nextDouble();
                    System.out.println("Student Record Added Successfully.");
                    break;
                case 2:
                    System.out.println("\nStudent Details");
                    System.out.println("ID : " + id);
                    System.out.println("Name : " + name);
                    System.out.println("Marks : " + marks);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while(choice != 3);
    }
}