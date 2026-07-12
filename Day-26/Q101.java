import java.util.Scanner;
public class Q101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random() * 100) + 1;
        int guess;
        do {
            System.out.print("Enter your guess (1-100): ");
            guess = sc.nextInt();
            if (guess > number) {
                System.out.println("Too High");
            } else if (guess < number) {
                System.out.println("Too Low");
            } else {
                System.out.println("Congratulations! You guessed correctly.");
            }
        } while (guess != number);
    }
}