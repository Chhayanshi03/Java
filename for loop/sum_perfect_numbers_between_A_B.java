import java.util.*;

public class sum_perfect_numbers_between_A_B{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number, a: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number, b: ");
        int b = sc.nextInt();

        System.out.println();
        int per_sum=0;
        for(int i=a; i<=b; i++){
            int sum=0;
            for(int j=1; j<i; j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum==i){
                System.out.println(i+" is a perfect number");
                per_sum+=i;
            }
        }
        System.out.println("***********************************************************");
        System.out.println("The sum of all perfect numbers from "+a+" & "+b+" is "+per_sum);
        System.out.println("***********************************************************");
        sc.close();
    }
}