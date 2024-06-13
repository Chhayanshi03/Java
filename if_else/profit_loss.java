import java.util.Scanner;

public class profit_loss {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost price of the product: ");
        int cp = sc.nextInt();
        System.out.print("Enter selling price of the product: ");
        int sp = sc.nextInt();

        if(cp>sp){
            System.out.println("You have a loss of "+ (cp-sp)+ " Rs.");
        }
        else{
            System.out.println("You have a profit of "+ (sp-cp)+ " Rs.");
        }
        sc.close();
    }
}
