import java.util.Scanner;

public class without_if_divisible_by_6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number, n: ");
        int n = sc.nextInt();
        for(int i=6;i<=n;i+=6){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
