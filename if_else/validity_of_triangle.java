import java.util.Scanner;

public class validity_of_triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side of triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd side of triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd side of triangle: ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && c+a>b){
            System.out.println("It is a valid triangle");
        }
        else{
            System.out.println("It is not a valid triangle");
        }

        sc.close();
    }
}
