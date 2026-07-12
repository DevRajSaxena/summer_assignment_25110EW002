import java.util.Scanner;
public class Q104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int ans;
        System.out.println("===== Java Quiz =====");
        System.out.println("\nQ1. Which keyword is used to create an object?");
        System.out.println("1. new");
        System.out.println("2. class");
        System.out.println("3. public");
        System.out.println("4. static");
        ans = sc.nextInt();
        if (ans == 1)
            score++;
        System.out.println("\nQ2. Which method is the entry point of Java?");
        System.out.println("1. start()");
        System.out.println("2. run()");
        System.out.println("3. main()");
        System.out.println("4. execute()");
        ans = sc.nextInt();
        if (ans == 3)
            score++;
        System.out.println("\nQ3. Which loop executes at least once?");
        System.out.println("1. for");
        System.out.println("2. while");
        System.out.println("3. do-while");
        System.out.println("4. foreach");
        ans = sc.nextInt();
        if (ans == 3)
            score++;
        System.out.println("\nQ4. Which data type stores decimal values?");
        System.out.println("1. int");
        System.out.println("2. float");
        System.out.println("3. char");
        System.out.println("4. boolean");
        ans = sc.nextInt();
        if (ans == 2)
            score++;
        System.out.println("\nQ5. Which operator is used for comparison?");
        System.out.println("1. =");
        System.out.println("2. ==");
        System.out.println("3. +");
        System.out.println("4. %");
        ans = sc.nextInt();
        if (ans == 2)
            score++;
        System.out.println("\nYour Score = " + score + "/5");
    }
}