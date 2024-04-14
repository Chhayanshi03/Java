import java.util.*;
public class strong_number {

    // strong numbers---> sum of factorial of digits is equal to number itself
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int temp=n;
        int sum=0;
        while(n>0){
            int r= n%10;
            int fact=1;
            for(int i=r; i>0; i--){
                fact*=i;
            }
            sum+=fact;
            n/=10;
        }
        if (temp == sum) {
            System.out.println(temp + " is a strong number");
        }
        else{
            System.out.println(temp + " is not a strong number");
        }
        sc.close();
    }
}
