package Loop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean IsPrime = true;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2){
            System.out.println("n is a prime number");
        }
        else{
           for(int i = 2 ; i < n-1 ; i++){
            if(n % i == 0){
                IsPrime = false;
            }
           }
           if(IsPrime == true){
            System.out.println("n is a prime number");
           }
           else{
            System.out.println("n is not a prime number");
           }
        }
    }
}
