import java.util.*;
public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;

        if(n<0){
            n = -n;
        }

        while(n>0){
            long digit = n%10;
            sum += digit;
            n /= 10;
        }
        System.out.println(sum);
    }
}
