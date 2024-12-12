import java.util.Scanner;

public class Evenoadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        if(Number%2==0){
            System.out.println("Input Number is Even");
        }
        else{
            System.out.println("Input Number is Odd");
        }
    }
}
