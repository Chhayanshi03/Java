import java.util.*;

public class prime_sum_between_A_B {
    public static void main(String rags[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number, a: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number, b: ");
        int b = sc.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            int flag = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(i + " is a prime number\n");
                sum += i;
            }
        }
        System.out.println("The sum of all prime numbers are: " + sum);
        sc.close();
    }
}