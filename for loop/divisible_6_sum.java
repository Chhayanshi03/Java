import java.util.Scanner;

public class divisible_6_sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number, a: ");
        int a = sc.nextInt();
        System.out.print("Enter 1st number, a: ");
        int b = sc.nextInt();
        int sum=0;
        for(int i=a;i<=b; i++){
            if(i%6==0){
                sum+=i;
                System.out.print(i+" ");
            }
        }
        System.out.println("\nThe sum of numbers between "+a+" and "+b+" is "+sum);
        sc.close();
    }
}