import java.util.Arrays;

public class jump {

    public static void sort012(int a[], int n)
    {
        // code here
        // Arrays.sort(a);
        int tmp;

        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                tmp=a[j];
                a[j]=a[i];
                a[i]=tmp;}

            }


        }
        System.out.println(Arrays.toString(a));


    }

    public static void main(String[] args)
    {
        int arr[] = {1, 4, 3, 2, 6, 7};
        int n = arr.length;
//
        sort012(arr,n);

    }

}