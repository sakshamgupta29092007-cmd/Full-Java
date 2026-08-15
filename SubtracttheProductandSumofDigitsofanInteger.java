import java.util.*;
public class SubtracttheProductandSumofDigitsofanInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pro = 1;

        while (n>0) {
            sum += n%10;
            pro *= n%10;
            n /= 10;
        }
        System.out.println("The Difference between the product and sum od the number: "+(pro-sum));
    }
}