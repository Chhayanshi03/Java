import java.util.*;
public class party_guests {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of guests: ");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("All guests are in pair");
        }
        else{
            System.out.println("All guests are not in pair");
        }
        sc.close();
    }
}



