import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x=1;

        for(int i=1;i<=num;i++){
            x = x*i;
        }
        System.out.println("Factorial of the given Number is " + x);
    }
}
