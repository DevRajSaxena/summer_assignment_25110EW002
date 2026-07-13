import java.util.Scanner;

public class Q114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int n;

        System.out.print("Enter Number of Elements: ");
        n = sc.nextInt();

        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int choice;

        do {
            System.out.println("\n===== Array Operations =====");
            System.out.println("1. Display Array");
            System.out.println("2. Find Sum");
            System.out.println("3. Find Maximum");
            System.out.println("4. Find Minimum");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Array: ");
                    for (int i = 0; i < n; i++)
                        System.out.print(arr[i] + " ");
                    System.out.println();
                    break;

                case 2:
                    int sum = 0;
                    for (int i = 0; i < n; i++)
                        sum += arr[i];
                    System.out.println("Sum = " + sum);
                    break;

                case 3:
                    int max = arr[0];
                    for (int i = 1; i < n; i++)
                        if (arr[i] > max)
                            max = arr[i];
                    System.out.println("Maximum = " + max);
                    break;

                case 4:
                    int min = arr[0];
                    for (int i = 1; i < n; i++)
                        if (arr[i] < min)
                            min = arr[i];
                    System.out.println("Minimum = " + min);
                    break;

                case 5:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);
    }
}