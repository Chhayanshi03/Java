import java.util.Scanner;

public class sum_of_elements_of_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array required: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum =0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }

        System.out.println("The sum of all ements of an array= "+sum);
        sc.close();
    }
}
