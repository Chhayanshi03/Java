import java.util.*;
public class coding_thinker {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(n%2==0){
            if(n%3==0){
                System.out.println("Coding Thinker");
            }
            else{
                System.out.println("Coding");
            }            
        }
        else{
            if(n%3==0){
                System.out.println("Thinker");
            }
        }
        sc.close();
    }
}

