import java.util.Scanner;

public class Ternaryoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int Number = sc.nextInt();
        String Type = (Number % 2 == 0)?"Your Number Is Even":"Your Number Is Odd";
        System.out.println(Type);
    }
}
