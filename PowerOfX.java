import java.util.*;
public class PowerOfX{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        double a = 1;
         if(pow>0){
        for(int i=1;i<=pow;i++){
            a = a*num;
        }
            System.out.println(a);
        }
            else if(pow ==0){
                System.out.println(1);
            }
            double b=1;
            if(pow<0){
            for (int i=pow;i<0;i++){
            b/=num;}
            System.out.print(b);
        }
    }
}