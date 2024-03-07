import java.util.ArrayList;
import java.util.Arrays;

public class height {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        arr[0] += k;
        for (int i = 1; i < n; i++) {
            arr[i] -= k;
            if (arr[i] < 0)
                arr[i] += k;
        }

        System.out.println(Arrays.toString(arr));
        return arr[0] - arr[n-1];
        // code here
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 10, 6, 4, 6, 9, 1};
//        1 8 10 6 4 6 9 1

        int n = arr.length;
        int k=7;
        height h = new height();
//        int l = h.getMinDiff(arr,n,k);
        ArrayList<Integer> al=new ArrayList<>();
         String c=Integer.toBinaryString(10);
        System.out.println(  c.substring(0,3));
        System.out.println(c);
        int a=10<<8;
        int b=10>>8;
        al.add(a);
        al.add(b);
        System.out.println(al);

    }
}

