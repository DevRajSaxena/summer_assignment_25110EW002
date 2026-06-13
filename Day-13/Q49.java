import java.util.Scanner;
public class Q49 {
    public static void inputArray(int[] arr, Scanner scanner) {
        System.out.println("Enter " + arr.length + " elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element at index [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }
    }
    public static void displayArray(int[] arr) {
        System.out.print("The array elements are: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        if (scanner.hasNextInt()) {
            int size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Array size must be a positive integer.");
            } else {
                int[] myArray = new int[size];
                inputArray(myArray, scanner);
                System.out.println(); 
                displayArray(myArray);
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer for size.");
        }

        scanner.close();
    }
}