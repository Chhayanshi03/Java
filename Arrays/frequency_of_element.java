import java.util.Scanner;

public class frequency_of_element {
    public static int frequency(int arr[], int find) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element for array: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to find: ");
        int find = sc.nextInt();
        System.out.println("Frequency of " + find + " is " + frequency(arr, find));
        sc.close();
    }
}
