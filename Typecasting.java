import java.util.Scanner;

public class Typecasting {
     public static void main(String[] args) {
       //Example of Widening Casting
       int myint = 9;
       double mydouble = myint;
       System.out.println(mydouble);
       //output = 9.0;

       //Example of Narroing Casting
       double Mydouble = 9.78d;
       int Myint = (int) Mydouble;
       System.out.println(Myint);
       //output = 9;
    }
}
