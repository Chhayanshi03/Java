import java.util.Scanner;

public class convert_time_12_format {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hrs: ");
        int h = sc.nextInt();
        System.out.print("Enter the minutes: ");
        int m = sc.nextInt();

        if(h>12){
            int hr =24-h;
            int min =60-m;
        }
    }
}
