import java.util.Scanner;
public class Q28 {
    static int reverse = 0;
    static int reverseNumber(int num) {
        if (num == 0) {
            return reverse;
        }
        reverse = reverse * 10 + (num % 10);
        return reverseNumber(num / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Reversed number = " + reverseNumber(num));
        sc.close();
    }
}