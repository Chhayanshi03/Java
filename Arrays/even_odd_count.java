import java.util.*;
public class even_odd_count{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();

        int arr[]=new int[n];
        int even =0;
        int odd=0;

        for(int i=0; i<n; i++){
            System.out.print("Enter the number: ");
            arr[i]= sc.nextInt();
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.print("The count of even numbers are "+even+" and for odd are "+odd);
        sc.close();
    }
}