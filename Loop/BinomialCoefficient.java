package Loop;

import java.util.Scanner;

public class BinomialCoefficient {
    public static int Factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binCoefficient(int n, int r) {
        int nfact = Factorial(n);
        int rfact = Factorial(r);
        int nmrfact = Factorial(n - r);
        int bc = nfact / (rfact * nmrfact);
        return bc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value Of r = ");
        int r = sc.nextInt();
        System.out.print("Enter Value Of n = ");
        int n = sc.nextInt();
       int bc = binCoefficient(n, r);
       System.out.println("input number binomial coefficient is = " + bc);
    }

}
