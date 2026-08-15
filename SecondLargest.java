import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int lar = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            if(arr[i]>lar){
                sec = lar;
                lar = arr[i];
            }
            else if(sec>arr[i] && lar!=arr[i]){
                sec = arr[i];
            }
        }
        if(sec == Integer.MIN_VALUE){
            System.out.println("second largest not found");
        }
        else{
            System.out.println("Second largest "+sec);
        }
    }
}
