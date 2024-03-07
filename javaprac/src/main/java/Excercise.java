public class Excercise {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int tmp;
        for (int i = 0; i <= arr.length/2; i++) {
            for (int j = i+1; j < arr.length; j++) {
                tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length/2; j++) {
//                tmp = arr[i][j];
//                arr[i][j] = arr[i][arr.length-j-1];
//                arr[i][arr.length-j-1] = tmp;
//            }
//        }
////        System.out.println(Arrays.deepToString(arr));

        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
            System.out.print(arr[i][j]);
        }
            System.out.println(" ");
        }
    }
}
