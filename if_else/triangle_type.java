import java.util.Scanner;

public class triangle_type {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side of triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd side of triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd side of triangle: ");
        int c = sc.nextInt();

        if(a==b && b==c){
            System.out.println("Triangle is an equilateral triangle");
        }
        else{
            if(a==b || b==c || c==a){
                System.out.println("Triangle is an isosceles triangle");
            }
            else{
                System.out.println("Triangle is an scalene triangle");
            }
        }

        sc.close();
    }
}
