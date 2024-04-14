import java.util.Scanner;

public class factors_of_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number, n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
