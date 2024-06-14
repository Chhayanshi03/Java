import java.util.Scanner;

public class max_num {
    public static int maximum(int arr[]){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter element for array: ");
            arr[i]=sc.nextInt();
        }

        int max = maximum(arr);
        System.out.println();
        System.out.println("Maximum number in array is "+max);
        sc.close();
    }
}
