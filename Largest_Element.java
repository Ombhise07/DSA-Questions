public class Largest_Element {
    public static void main(String[] args) {
        int[] arr = {10};
        System.out.println(largest(arr));
    }

    static int largest(int[] arr)
    {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

}