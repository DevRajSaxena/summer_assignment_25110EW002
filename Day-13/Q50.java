import java.util.Scanner;
public class Q50 {
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static double calculateAverage(int[] arr) {
        if (arr.length == 0) return 0.0;
        
        int sum = calculateSum(arr);
        return (double) sum / arr.length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }
        int totalSum = calculateSum(myArray);
        double average = calculateAverage(myArray);
        System.out.println("\n--- Results ---");
        System.out.println("Sum of array elements: " + totalSum);
        System.out.printf("Average of array elements: %.2f\n", average);
        scanner.close();
    }
}