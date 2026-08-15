import java.util.*;
public class ThreeDigitArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Backup = num;
        int sum = 0;

        while (num>0) {
            sum = sum + (num%10)*(num%10)*(num%10);
            num = num/10;
        }

        if(sum == Backup){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
