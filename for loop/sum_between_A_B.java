import java.util.Scanner;

public class sum_between_A_B {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number, a: ");
        int a = sc.nextInt();
        System.out.print("Enter 1st number, a: ");
        int b = sc.nextInt();
        int sum=0;
        for(int i=a; i<=b;i++){
            sum=sum+i;
        }
        System.out.println("Sum of the numbers from "+a+" to "+b+" is "+sum);
        sc.close();
    }
}
