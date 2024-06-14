import java.util.Scanner;

public class last_occurence_in_array {
    public static int search_from_last(int []arr, int find){
        int f=-1;
        for(int i=arr.length-1; i>=0;i--){
            if(arr[i]==find){
                f=i;
                break;
            }
        }
        return f;
    }
    public static int search_from_beginning(int []arr,int find){
        int f=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==find){
                f=i;
            }
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array required: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to be found ");
        int find = sc.nextInt();

        System.out.println(search_from_last(arr,find));
        System.out.println(search_from_beginning(arr,find));
        sc.close();
    }
}
