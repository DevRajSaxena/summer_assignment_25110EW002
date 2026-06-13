import java.util.Scanner;

public class Q51 {

    /**
     * Function to find and print the largest and smallest elements in an array.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static void findLargestAndSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        // Initialize both largest and smallest with the first element of the array
        int largest = arr[0];
        int smallest = arr[0];

        // Traverse the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if current element is greater
            } else if (arr[i] < smallest) {
                smallest = arr[i]; // Update smallest if current element is smaller
            }
        }

        // Display results
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

                // Taking array input
                System.out.println("Enter " + size + " elements:");
                for (int i = 0; i < size; i++) {
                    System.out.print("Element " + (i + 1) + ": ");
                    myArray[i] = scanner.nextInt();
                }

                // Calling the user-defined function
                findLargestAndSmallest(myArray);
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }

        scanner.close();
    }
}