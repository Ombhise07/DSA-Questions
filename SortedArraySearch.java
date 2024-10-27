package Week2;
import java.util.*;
public class SortedArraySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        System.out.println(binary(arr,6));
    }

    static boolean binary(int[] arr ,int target){
        int start =0;
        int end = arr.length-1;


        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return true;
            }

            else if(target < arr[mid]){
                end = mid-1;
            }

            else {
                start = mid+1;
            }
        }
        return false;
    }

}
