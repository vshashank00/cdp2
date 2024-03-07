import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Parse {
    public static int maxOnes (int Mat[][], int N, int M)
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i=0;i< Mat.length;i++){
            int c = 0;
            for (int j=0;j<M;j++){
                if(Mat[i][j]==1){
                    c++;
                }
            }
            hm.put(i,c);

        }
        int maxValueInMap = (Collections.max(hm.values()));
        for (Map.Entry<Integer, Integer> entry :
                hm.entrySet()) {

            if (entry.getValue() == maxValueInMap) {

                // Print the key with max value
                return entry.getKey();
            }

        }


        // your code here
            return -1;
    }

    public static void main(String[] args) {
        int Mat[][]={{0,1,1,1},{0,0,1,1},{0,0,1,1}};

        System.out.println(Mat.length);
    }
}
