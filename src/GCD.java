import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        int gcd = GCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);

    }

    public static int GCD(int num1, int num2) {
        int res = 0;
        int max = min(num1, num2);
        for (int i = 1; i <=max; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                res = i;
            }
        }
        return res;
    }

    public static int min(int a, int b) {
        if (a > b) {
            return b;
        }
        return a;
    }
}

