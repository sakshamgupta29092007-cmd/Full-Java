import java.util.*;
public class PowerofNume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int a = 1;

        for(int i=1;i<=pow;i++){
            a = a*num;
        }
        System.out.println(a);
    }
}
