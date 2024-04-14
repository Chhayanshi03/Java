import java.util.Scanner;

public class HCF {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number, a: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number, b: ");
        int b = sc.nextInt();

        int max =0;
        for(int i=2; i<=a*b; i++){
            if(a%i==0 && b%i==0){
                if(max<i){
                    max =i;
                }
            }
        }
        System.out.print("The HCF of "+a+" and "+b+" = "+max);
        sc.close();
    }
}
