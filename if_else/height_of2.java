import java.util.*;
public class height_of2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st student's height: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd student's height: ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("1st student is taller than 2nd");
        }
        else{
            System.out.println("2nd student is taller than 1st");
        }

        sc.close();
    }
}