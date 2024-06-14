import java.util.Scanner;

public class second_max_method_1 {
    public static int search(int arr[], int del) {
        int f = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == del) {
                f = i;
                break;
            }
        }
        return f;
    }

    public static void delete(int arr[], int del) {
        int id = search(arr, del);
        if (id != -1) {
            for (int i = id; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
        }
    }

    public static int max(int arr[],int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
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
        int del = max(arr,n);
        delete(arr, del);n--;
        System.out.println(max(arr,n));

        sc.close();
    }
}
