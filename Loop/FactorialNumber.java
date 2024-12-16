package Loop;

import java.util.Scanner;

public class FactorialNumber {

    public static int Factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact =  Factorial(num);
        System.out.println(fact);
    }
}
 