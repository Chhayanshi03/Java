import java.util.Scanner;

public class insert_element_in_array {
    public static void insert(int arr[],int ins,int idx){
        for(int i=arr.length-1; i>idx; i--){
            arr[i]=arr[i-1];
        }
        arr[idx]=ins;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n = sc.nextInt();
        int arr[] = new int[n+1];

        for(int i=0; i<n; i++){
            System.out.print("Enter element for array: ");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter number to be inserted: ");
        int ins=sc.nextInt();
        System.out.print("Enter index at which number to be inserted: ");
        int idx=sc.nextInt();
        insert(arr, ins, idx);
        n++;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
