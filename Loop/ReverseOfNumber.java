package Loop;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int n = 189;
        while (n>0) {
            int LastDigit = n%10;
            System.out.print(LastDigit + "");
            n = n / 10;
        }
    }
}
