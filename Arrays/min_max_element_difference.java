import java.util.Scanner;

public class min_max_element_difference {
    public static int maximum(int arr[]){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static int minimum(int arr[]){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
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
        int min = minimum(arr);
        System.out.println();
        System.out.println("Maximum number in array is "+max);
        System.out.println("Minimum number in array is "+min);
        System.out.println("Difference is "+(max-min));
        sc.close();
    }
}
