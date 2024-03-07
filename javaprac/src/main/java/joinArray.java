import java.util.Arrays;
import java.util.HashSet;

public class joinArray {
//    int findMidSum(int[] ar1, int[] ar2, int n) {
//        int bl=ar1.length+ar2.length;
//        int arr[]=new int[bl];
//        System.arraycopy(ar1,0,arr,0,ar1.length);
//        System.arraycopy(ar2,0,arr,ar1.length,ar2.length);
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
//        int len=bl/2;
////        System.out.println(arr[bl-1]+arr[len]);
//        // code here
//   return arr[bl-1]+arr[len];
//    }
public static int[] findTopTwoScores(int[] array){
    int arr[]=new int[2];
    int temp;
    for(int i=0;i<array.length-1;i++){
        if (array[i]<array[i+1]){
            temp=array[i];
            array[i]=array[i+1];
            array[i+1]=temp;
            i=-1;
        }}
    for(int i=0;i<arr.length;i++){
        arr[i]=array[i];
    }
    HashSet<Integer>hs=new HashSet<>();
    for(Integer i:array){
        hs.add(i);
    }
    int[] y = new int[hs.size()];
    int c = 0;
    for(int s : hs) y[c++] = s;
    System.out.println(Arrays.toString(y));
    //   TODO

    return arr;
    // TODO
}


    public static void main(String[] args) {
        int ar1[]={84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int ar2[]={2,3,4};
        findTopTwoScores(ar1);
//        joinArray j=new joinArray();
//        j.findMidSum(ar1,ar2,6);
//        int s[][]={{1,3},{2,4}};
    }
}
