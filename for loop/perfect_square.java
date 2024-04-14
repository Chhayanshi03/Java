import java.util.Scanner;

public class perfect_square {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number, n: ");
        int n = sc.nextInt();
        int flag=0;
        for(int i=1;i<=n-1;i++){
            if(i*i==n){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(n+" is not a perfect square ");
        }
        else{
            System.out.println(n+" is a perfect square ");
        }
        sc.close();
    }
}
