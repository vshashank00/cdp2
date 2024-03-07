import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class leader {
    static ArrayList<Integer> leaders(int[] arr, int n){
        // Your code here
          int max=-23456;
          String s=Integer.toString(max);
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();}

        ArrayList <Integer>list = leader.leaders(arr,n);
        System.out.println(list);
    }
}
