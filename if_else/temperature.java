import java.util.Scanner;

public class temperature {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int temp = sc.nextInt();

        if(temp<0){
            System.out.println("Freezing Weather");
        }
        else if(temp>=0 && temp<10){
            System.out.println("Very Cold");
        }
        else if(temp<20 && temp>=10){
            System.out.println("Cold");
        }
        else if(temp<30 && temp>=20){
            System.out.println("Normal");
        }
        else if(temp<40 && temp>=30){
            System.out.println("Hot");
        }
        else if(temp>=40){
            System.out.println("Very Hot");
        }

        sc.close();
    }
}
