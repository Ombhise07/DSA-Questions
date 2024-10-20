import java.util.*;
public class Array_Sorted_Rotated {
    public static void main(String[] args) {
        int[] arr = {2,1};
        System.out.println(check(arr));
//        System.out.println(Arrays.toString(reverse(arr,0,1)));
    }

    static boolean check(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            rotate(arr,arr.length-1,i);
            if(sort(arr)){
                return true;
            }
        }
        return false;
    }

    static boolean sort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true ;
    }
    static int[] rotate(int[] arr,int n,int d)
    {
        if(arr.length == 2){
            reverse(arr,0,1);
            return arr;
        }
        d = d % n;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
        return arr;
    }

    static int[] reverse(int[] arr,int start,int end)
    {
     while(start < end)
     {
         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         start++;
         end--;
     }
     return arr;
    }

}
