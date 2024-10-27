package Week2;
import java.util.*;
public class UnionOfArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,5};
        int[] b = {2,3,4,4,6};
        System.out.println(FindUnion(b, a,b.length,a.length));

    }

        static ArrayList<Integer> FindUnion(int a[], int b[], int n, int m) {
            int i = 0, j = 0;
            ArrayList<Integer > Union=new ArrayList<>();
            while (i < n && j < m) {
                if (a[i] <= b[j])
                {
                    if (Union.size() == 0 || Union.get(Union.size()-1) != a[i])
                        Union.add(a[i]);
                    i++;
                } else
                {
                    if (Union.size() == 0 || Union.get(Union.size()-1) != b[j])
                        Union.add(b[j]);
                    j++;
                }
            }
            while (i < n)
            {
                if (Union.get(Union.size()-1) != a[i])
                    Union.add(a[i]);
                i++;
            }
            while (j < m)
            {
                if (Union.get(Union.size()-1) != b[j])
                    Union.add(b[j]);
                j++;
            }
            return Union;
        }

}



