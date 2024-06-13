import java.util.*;
public class check_square {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter bidth of rectangle: ");
        int b = sc.nextInt();

        if(l==b){
            System.out.println("The given rectangle is a square.");
        }
        else{
            System.out.println("The given rectangle is not a square.");
        }

        sc.close();
    }
}
