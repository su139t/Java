import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age = ");
        int Age = sc.nextInt();
        if(Age >= 18){
            System.out.println("Adult");
        }
        else if(Age >= 13 && Age < 18 ){
         System.out.println("Teenager");
        }
        else{
            System.out.println("Child");
        }
    }
}
