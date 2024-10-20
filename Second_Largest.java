public class Second_Largest {
    public static void main(String[] args) {
        int[] arr = {10,10};
        System.out.println(secondlargest(arr));
    }

    static int secondlargest(int[] arr)
    {
        int secondL = -1;
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(largest < arr[i]){
                secondL = largest;
                largest  = arr[i];
            }

            else if (largest > arr[i] && secondL < arr[i])
            {
                secondL = arr[i];
            }
        }
        return secondL;
    }
}
