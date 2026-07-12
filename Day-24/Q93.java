import java.util.Scanner;
public class Q93{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();
        if (str1.length() != str2.length()) {
            System.out.println("Not Rotation");
        } else {
            String temp = str1 + str1;
            if (temp.contains(str2))
                System.out.println("String is Rotation");
            else
                System.out.println("Not Rotation");
        }
    }
}