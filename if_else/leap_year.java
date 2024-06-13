import java.util.Scanner;

public class leap_year {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int y = sc.nextInt();

        if(y%4==0){
            if(y%100==0){
                if(y%400==0){
                    System.out.println(y+" Year is a leap year");
                }
                else{
                    System.out.println(y+" Year is not a leap year");
                }
            }
            else{
                System.out.println(y+" Year is not a leap year");
            }
        }
        else{
            System.out.println(y+" Year is not a leap year");
            }

        sc.close();
    }
}

