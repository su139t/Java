package Loop;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = sc.nextInt();
        for(int i = 0 ; i<=number ; i++){
          sum = sum + i;
        }
        System.out.println(sum);
    }
}
