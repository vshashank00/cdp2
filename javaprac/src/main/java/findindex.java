import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class findindex {

    //    int binarysearch(int arr[], int n,int k) {
//        int z = 0;
//        for ( int i=0;i<arr.length;i++){
//            if (arr[i]==k){
//                z=i;
//                return z;
//            }
//        }
//
//        // code here
//
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int k=sc.nextInt();
//        int n = sc.nextInt();
//        int arr[]=new int[n];
//        for (int i=0;i<n;i++){
//            arr[i]= sc.nextInt();
//
//        }
//        findindex fi=new findindex();
//        int result=fi.binarysearch(arr,n,k);
//        System.out.println(result);
    int binarysearch(int arr[], int n) {
        int z = 0;
        int tmp;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == i + 1)) {
                z = i + 1;

            }

        }
        // code here

        if (z == 0) {
            z = n;
        }

        return z;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n-1;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(arr);
        findindex fi=new findindex();
        int result=fi.binarysearch(arr,n);
        System.out.println(result);
        String s="Shsnm";
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(32);
        Integer a[]=new Integer[al.size()];
        a=al.toArray(a);


    }
}
