import java.util.Scanner;

public class positive_negative_even_odd_count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to enter, n: ");
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        int positive = 0;
        int negative = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the number: ");
            int a = sc.nextInt();
            if (a % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            if (a > 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.print("The Even count is " + even + " & The Odd count is " + odd);
        System.out.print("\nThe Positive count is " + positive + " & The Negative count is " + negative);
        sc.close();
        
    }
}
