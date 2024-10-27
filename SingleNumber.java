package Week2;
import java.util.*;
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(singleNumber(nums));
    }

    public static  int singleNumber(int[] nums) {
        int unique =0;
        for (int i = 0; i < nums.length; i++) {
            unique^=nums[i];
        }
        return unique;
    }
}
