import java.util.*;
public class prime_factors{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int i=2;i<n;i++){
            if(n%i==0){
                // System.out.print(i+" ");
                int flag=0;
                for(int j=2; j<i;j++){
                    if(i%j==0){
                        flag=1;
                    }
                }
                if(flag==0){
                    System.out.print(i+" is prime factor of "+n+"\n");
                }
            }
        }
        sc.close();
    }
}