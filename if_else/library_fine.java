import java.util.Scanner;

public class library_fine {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days delayed: ");
        int day = sc.nextInt();

        if(day<=3){
            System.out.println("Fine is 10 Rs.");
        }
        else{
            if(day<=10){
                System.out.println("Fine is 20 Rs.");
            }
            else{
                if(day<=30){
                    System.out.println("Fine is 50 Rs.");
                }
                else{
                    System.out.println("Fine is 50 Rs. & Membership is CANCELLED");
                }
            }
        }
        sc.close();
    }
}
