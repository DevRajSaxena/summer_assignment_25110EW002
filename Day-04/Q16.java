import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        for (int num = start; num <= end; num++) {
            int original = num;
            int temp = num;
            int sum = 0;
            while (temp != 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }
            if (sum == original) {
                System.out.print(original + " ");
            }
        }
        sc.close();
    }
}