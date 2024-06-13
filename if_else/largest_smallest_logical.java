import java.util.*;
public class largest_smallest_logical {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("Largest number= "+a);
        }
        else{
            if(b>c){
                System.out.println("Largest number= "+b);
            }
            else{
                System.out.println("Largest number= "+c);
            }
        }

        if(a<b && a<c){
            System.out.println("Smallest number= "+a);
        }
        else{
            if(b<c){
                System.out.println("Smallest number= "+b);
            }
            else{
                System.out.println("Smallest number= "+c);
            }
        }
        sc.close();
    }
}
