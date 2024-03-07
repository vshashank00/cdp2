import java.util.Arrays;

public class MAxprod {
        public  String maxProduct(int[] intArray) {
            int max=0,curpro=0;

            int arr1[] = {2, 1, 3, 5, 4, 3, 2};
            int arr2[] = {3, 2, 2, 4, 5, 3, 1};
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            System.out.println(Arrays.equals(arr1,arr2));
            Arrays.sort(intArray);
            for (int i=0;i<intArray.length-1;i++){
                for (int j=i+1;j<intArray.length;j++){
                    curpro=intArray[i]*intArray[j];
                    if(curpro>max){
                        max=curpro;

                    }



                }
            }
            return Integer.toString(max);
        }



    public static void main(String[] args) {
            MAxprod m=new MAxprod();
            int arr[]= {10,20,30,40,50};
        System.out.println(m.maxProduct(arr));

    }
}
