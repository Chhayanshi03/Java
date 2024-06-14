import java.util.*;

public class print_even_index_num_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number: ");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if (i % 2 == 0) {
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
