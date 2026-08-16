import java.util.*;
public class LeetCode1342 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while (n>0) {
            if(n%2==0){
                n/=2;
                count++;
            }
            else if(n%2!=0){
                n-=1;
                count++;
            }            
        }
        System.out.println("Number of Steps to Reduce a Number to Zero: "+count);
    }
}