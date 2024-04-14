import java.util.Scanner;

public class print_numbers_between_A_B {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number, a: ");
        int a = sc.nextInt();
        System.out.print("Enter 1st number, a: ");
        int b = sc.nextInt();
        for(int i=a; i<=b; i++){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
