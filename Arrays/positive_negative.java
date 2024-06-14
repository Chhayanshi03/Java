import java.util.*;
public class positive_negative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n= sc.nextInt();

        int arr[]=new int[n];
        int positive =0;
        int negative=0;

        for(int i=0; i<n; i++){
            System.out.print("Enter the number: ");
            arr[i]= sc.nextInt();
            if(arr[i]>=0){
                positive++;
            }
            else{
                negative++;
            }
        }
        System.out.print("The count of positive numbers are "+positive+" and for negative are "+negative);
        sc.close();
    }
}
