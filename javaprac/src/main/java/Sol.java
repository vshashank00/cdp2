import java.util.Arrays;

public class Sol {
    static long trappingWater(int arr[], int n) {
        long maxL=0,maxr;
        long min=0;
        for(int i=1;i<n-1;i++){
            maxL=Math.max(maxL,arr[i-1]);
            maxr=0;
            System.out.println(Arrays.toString(arr));

            for(int j=i+1;j<n;j++){
                maxr=Math.max(maxr,arr[j]);
            }
            if(arr[i]<maxL&&arr[i]<maxr)
                min+=(Math.min(maxL,maxr)-arr[i]);

        }

        return min;
    }
    public static void main(String[] args) {
        int n= 10;
        int arr[]={1,1,5,2,7,6,1,4,2,3};

        long min=trappingWater(arr,n);
        System.out.println(min);
    }

}
