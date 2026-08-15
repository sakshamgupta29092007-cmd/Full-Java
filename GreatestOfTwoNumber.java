import java.util.*;
public class GreatestOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x =  sc.nextInt();

        if(n>x){
            System.out.println(n+" is greater");
        }
        else{
            System.out.println(x+" is greater");
        }
    }
}
