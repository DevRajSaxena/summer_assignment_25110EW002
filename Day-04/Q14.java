import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int first = 0, second = 1, nthTerm = 0;
        if (n == 1) {
            nthTerm = first;
        } else if (n == 2) {
            nthTerm = second;
        } else {
            for (int i = 3; i <= n; i++) {
                nthTerm = first + second;
                first = second;
                second = nthTerm;
            }
        }
        System.out.println("The " + n + "th Fibonacci term is: " + nthTerm);
        sc.close();
    }
}