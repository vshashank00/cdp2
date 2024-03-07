import java.util.ArrayList;

public class unique {
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer>list=new ArrayList<Integer>();
        // Your code here

        for(int i=0;i<arr.length;i++){
            int max=arr[i];
            for(int j=i+1;j<k;j++){
                if(max<arr[j])
                    max=arr[j];
            }
            list.add(max);
            if(k!=n)
                k++;
            else break;


        }
        return list;
    }

    public static void main(String[] args) {
        int n= 9;
        int arr[]={1,2,3,1,4,5,2,3,6};
        int k=3;

        ArrayList<Integer> min=max_of_subarrays(arr,n,k);
        System.out.println(min);

    }
}
