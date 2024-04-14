import java.util.*;
public class LCM{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number, a: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number, b: ");
        int b = sc.nextInt();

        for(int i=2; i<=a*b; i++){
            if(i%a==0 && i%b==0){
                System.out.print("The LCM of "+a+" and "+b+" = "+i);
                break;
            }
        }
        sc.close();
    }
}