import java.util.Scanner;

public class delete_element_from_array {
    public static int search(int arr[], int del){
        int f=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==del){
                f=i;
                break;
            }
        }
        return f;
    }
    public static void delete(int arr[], int del){
        int f = search(arr,del);
        if(f!=-1){
            for(int i=f; i<arr.length-1; i++){
                arr[i]=arr[i+1];
            }
        }
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
        System.out.print("Enter number to be deleted: ");
        int del=sc.nextInt();
        delete(arr, del);
        // By doing n-- here, it prints the element only till the last shifted element,
        // although it does not alter the size of array
        n--;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
