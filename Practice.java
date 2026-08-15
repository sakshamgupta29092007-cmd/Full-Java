
import java.util.*; 
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int a = 0;

        // while(n>0){
        //     int digit = n%10;
        //     sum += digit;
        //     n /= 10;
        // }
        // System.out.println(sum);

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //         // num++;
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=n;j>=i;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        if (units <= 100) {
            a = units * 10;
        }
        else if (units <= 200) {
            a = (100 * 10) + (units - 100) * 15;
        }
        else if (units <= 300) {
            a = (100 * 10) +(100 * 15) + (units - 200) * 20;
        }
        else if (units > 300) {
            a = (100 * 10) + (100 * 15) + (100 * 20) + (units - 300) * 25;
        }
        System.out.println(a);
    }
}
