import java.util.Scanner;
public class Q46 {
    public static boolean isArmstrong(int num) {
        if (num < 0) return false;
        int originalNum = num;
        int temp = num;
        int digits = 0;
        int sum = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        temp = num; 
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp /= 10; 
        }
        return sum == originalNum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check if it's an Armstrong number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (isArmstrong(number)) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is NOT an Armstrong number.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        scanner.close();
    }
}