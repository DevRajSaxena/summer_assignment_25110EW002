import java.util.Scanner;
public class Q51 {
    public static void findLargestAndSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("\n--- Results ---");
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
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
                System.out.println("Enter " + size + " elements:");
                for (int i = 0; i < size; i++) {
                    System.out.print("Element " + (i + 1) + ": ");
                    myArray[i] = scanner.nextInt();
                }
                findLargestAndSmallest(myArray);
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        scanner.close();
    }
}
