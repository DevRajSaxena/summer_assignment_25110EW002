import java.util.Scanner;
public class Q52 {
    public static void countEvenAndOdd(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Total Even elements: " + evenCount);
        System.out.println("Total Odd elements: " + oddCount);
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
        countEvenAndOdd(myArray);
        scanner.close();
    }
}