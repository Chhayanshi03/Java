import java.util.Scanner;

public class perfect_number {
    // perfect numbers--> numbers whose factor's sum is equal to number itself
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int j = 1; j < n; j++) {
            if (n % j == 0) {
                sum += j;
            }
        }
        if (n == sum) {
            System.out.println(n + " is a perfect number");
        }
        else{
            System.out.println(n + " is not a perfect number");
        }

        sc.close();
    }
}
