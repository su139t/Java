package Loop;

public class ReverseGivenNumber {
    public static void main(String[] args) {
        int n = 139;
        int rev = 0;
        while (n>0) {
            int LastDigit = n % 10;
            rev = (rev*10)+LastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}
