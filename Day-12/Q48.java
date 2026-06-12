import java.util.Scanner;
public class Q48 {
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 1; 
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i; 
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check if it's a Perfect Number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (isPerfectNumber(number)) {
                System.out.println(number + " is a Perfect Number.");
            } else {
                System.out.println(number + " is NOT a Perfect Number.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        scanner.close();
    }
}