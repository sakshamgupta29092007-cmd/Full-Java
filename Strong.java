import java.util.*;
public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int a = 1;
        int num = sc.nextInt();

        while (num>0) {
            temp = num%10;
            num = num/10;            
            for(int i=1;i<=temp;temp++){
            a = a*i;
            }
            System.out.println(a);
        }
    }
}
