import java.util.Scanner;
public class Q47 {
    public static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        long firstTerm = 0;
        long secondTerm = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println(); 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n) for Fibonacci series: ");
        if (scanner.hasNextInt()) {
            int terms = scanner.nextInt();
            printFibonacci(terms);
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        scanner.close();
    }
}