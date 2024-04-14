import java.util.Scanner;

public class evensum_oddsum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to enter, n: ");
        int n = sc.nextInt();
        int evenSum=0;
        int oddSum=0;
        for(int i=1; i<=n;i++){
            System.out.print("Enter the number: ");
            int a = sc.nextInt();
            if(a%2==0){
                evenSum+=a;
            }
            else{
                oddSum+=a;
            }
        }
        System.out.print("The Even sum is "+evenSum+" & The Odd sum is "+oddSum);
        sc.close();
    }
}
