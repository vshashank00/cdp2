import java.util.Scanner;

 class equi {
         static int equilibriumPoint(long arr[], int n) {
        // Your code here
int i=0;
        for ( i=0;i< arr.length;i++) {
            long lsum1=0;

            for (int j=0;j<i;j++){
                lsum1=lsum1+arr[j];

            }
            long rsum=0;

            for (int k =i+1;k<n;k++){
                rsum=rsum+arr[k];

            }
            if (lsum1==rsum){
                return i+1;

            }



        }
        System.out.println("i="+i);
        return -1;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        long arr[] = {8,8,3,7,8,2,7,2};

//        for (int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }

        int list = equilibriumPoint(arr,n);
        System.out.println(list);
    }


}
