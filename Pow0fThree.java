import java.util.*;
public class Pow0fThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("Fasle");
        }
        while(n%3==0){
            n=n/3;
        }
        System.out.println(n==1);
    }
}
