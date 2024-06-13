import java.util.Scanner;

public class AM_PM {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hrs: ");
        int h = sc.nextInt();

        if(h<12){
            System.out.println("The time is of AM");
        }
        else{
            System.out.println("The time os of PM");
        }
        sc.close();
    }
}
