import java.util.Arrays;
import java.util.Scanner;

public class Long {
    String longestCommonPrefix(String arr[], int n){
        String s = "";
        Arrays.sort(arr);
        char a[]=arr[0].toCharArray();
        char b[]=arr[arr.length-1].toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                break;
        }else s+=a[i];
        }
        if (s.isEmpty())
            return "-1";

        return s;
// code here
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();

        String arr[]=new String[n];

        for (int i=0;i<n-1;i++){
            arr[i]= sc.nextLine();
        }
        Long l=new Long();
        String s=l.longestCommonPrefix(arr,n);
        System.out.println(s);
    }
}
