import java.util.Scanner;
public class Q107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        double basic = 0;
        double hra = 0;
        double da = 0;
        double totalSalary = 0;
        int choice;
        do{
            System.out.println("\n===== Salary Management =====");
            System.out.println("1. Calculate Salary");
            System.out.println("2. Display Salary");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Basic Salary: ");
                    basic = sc.nextDouble();
                    hra = basic * 0.20;
                    da = basic * 0.10;
                    totalSalary = basic + hra + da;
                    System.out.println("Salary Calculated Successfully.");
                    break;
                case 2:
                    System.out.println("\nSalary Details");
                    System.out.println("Employee Name : " + name);
                    System.out.println("Basic Salary : " + basic);
                    System.out.println("HRA : " + hra);
                    System.out.println("DA : " + da);
                    System.out.println("Total Salary : " + totalSalary);
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