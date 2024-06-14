import java.util.*;
public class search_num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter element for array: ");
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the number to be found ");
        int find = sc.nextInt();

        System.out.println(search(arr,find));
        sc.close();
    }
    public static int search(int arr[], int find){
        int f =-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==find){
                f=i;
            }
        }
        return f;
    }
}
