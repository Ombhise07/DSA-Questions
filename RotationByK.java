package Week2;
import java.util.*;
public class RotationByK {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rightrotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }

        static public void rightrotate(int[] nums, int k) {
             k = k % nums.length;
            reverse(nums,nums.length-k,nums.length-1);
            reverse(nums,0,nums.length-k-1);
            reverse(nums,0,nums.length-1);
        }

        static public void reverse(int[] nums,int start,int end){

            while(start < end)
            {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
}
