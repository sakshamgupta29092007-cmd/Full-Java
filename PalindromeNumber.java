import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your Number");
        int num = sc.nextInt();
        int backup = num;
        int rev = 0;

        while (num>0){
            rev = rev*10 + num%10;
            num = num/10;
        }

        if(backup == rev){
            System.out.println("PalindromeNumber");
        }
        else{
            System.out.println("Not PalindromeNumber");
        }
    }
}
