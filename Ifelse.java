import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();
        if(Age >= 18){
            System.out.println("You can drive");
        }
        else{
            System.out.println("Yout can't drive a vehicals");
        }
    }
}
