import java.util.Scanner;

public class Binary_search {

    public static int bSearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            System.out.println("bSearch(low=" + low + ", high=" + high + ") -> not found, return -1");
            return -1;
        }
        int mid = low + (high - low) / 2;
        System.out.println("bSearch(low=" + low + ", high=" + high + ") -> mid=" + mid + ", arr[mid]=" + arr[mid]);
        if (arr[mid] == target) {
            System.out.println("arr[" + mid + "] == " + target + " -> found!");
            return mid;
        }
        if (target < arr[mid]) {
            System.out.println(target + " < " + arr[mid] + " -> search left half");
            return bSearch(arr, target, low, mid - 1);
        }
        System.out.println(target + " > " + arr[mid] + " -> search right half");
        return bSearch(arr, target, mid + 1, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers in sorted (ascending) order:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.print("\nEnter a number to search: ");
        int target = sc.nextInt();
        System.out.println("\nTrace");
        int result = bSearch(
            numbers,
            target,
            0,
            numbers.length - 1
        );
        System.out.println("\n");
        if (result == -1) {
            System.out.println("Target not found.");
            System.out.println("Index: -1");
        } else {
            System.out.println("Target found.");
            System.out.println("Index: " + result);
        }
    }
}
