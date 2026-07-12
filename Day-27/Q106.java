import java.util.Scanner;
public class Q106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = 0;
        String empName = "";
        String department = "";
        int choice;
        do{
            System.out.println("\n===== Employee Management =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    empName = sc.nextLine();
                    System.out.print("Enter Department: ");
                    department = sc.nextLine();
                    System.out.println("Employee Added Successfully.");
                    break;
                case 2:
                    System.out.println("\nEmployee Details");
                    System.out.println("Employee ID : " + empId);
                    System.out.println("Employee Name : " + empName);
                    System.out.println("Department : " + department);
                    break;
                case 3:
                    System.out.println("Thank You");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while(choice!=3);

    }
}