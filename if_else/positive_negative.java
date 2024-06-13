import java.util.Scanner;

public class positive_negative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();

        if(a>0){
            System.out.println("The number "+a+" is positive");
        }
        else{
            if(a<0){
                System.out.println("The number "+a+" is negative");
            }
            else{
                System.out.println("The number "+a+" is Zero");
            }
        }
        sc.close();
    }
}
