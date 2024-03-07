public class Pairing {
    // Java program to find the element that
// appears only once
// A XOR based function to find
        // the element that appears only once
        static void search(int arr[], int n)
        {
            int XOR = 0;
            for (int i = 0; i < n; i++) {
                XOR = XOR ^ arr[i];
            }
            System.out.println("The required element is "
                    + XOR);
        }
        // Driver Code
        public static void main(String[] args)
        {
            int arr[] = { 1, 1, 2, 4, 4, 5, 5, 6, 6 ,6};
            int len = arr.length;

            search(arr, len);
        }
    }

// This code is contributed by yashbeersingh42


//    int findOnce(int arr[], int n)
//    {
//        int uni = 0;
//
//        ArrayList<Integer>l=new ArrayList<>();
//        for (int i =0;i<arr.length;i++){
//            int k=0;
//            if(!l.contains(arr[i])){
//                l.add(arr[i]);
//                k++;
//                for (int j=i+1;j<arr.length;j++){
//                    if (arr[i]==arr[j]){
//                        k++;
//                    }}
//                    if(k==1){
//                         return arr[i];
//
//                    }
//
//
//            }
//        }
//        // Complete this function
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int arr[]={3,1,1};
//        long arr1[]={6,5,4};
//        int n=arr.length;
//        Pairing p=new Pairing();
//        p.findOnce(arr,n);
//    }
//}