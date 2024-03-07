public class check {
    static long maxSubarraySum(int arr[], int n){
        if (arr.length==0)
            return -1;
        long prev=-23456;
        long curr = 0;
        for(int i=0;i<n;i++){
            curr+=arr[i];
            if(prev<curr)
                prev=curr;
            if(curr<0){
                curr=0;
            }
        }
        return prev;
    }


    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n=arr.length;
        long l=check.maxSubarraySum(arr,n);
        System.out.println(l);
    }
}
