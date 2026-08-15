public class Target {
    public static void main(String[] args) {
        int target = 9;
        int arr[] = {2,7,11,15};
        int left = 0;
        int right = 3;
        while(left<right){
            if(arr[left]+arr[right] == target){
                System.out.println("target found");
            }
            else if(arr[left]<target){
                left++;
            }
            else if(arr[right]>target){
                right--;
            }
        }
    }
}
