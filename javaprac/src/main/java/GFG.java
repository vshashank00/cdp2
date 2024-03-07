// Java program to find longest common prefix of
// given array of words.
import java.util.*;

 public class GFG
{
     String longestCommonPrefix(String[] arr)
    {
        int n = arr.length;
        // take temp_prefix string and assign first element of arr : a.
        String result = arr[0];

        // Iterate for rest of element in string.
        for(int i = 1; i < n; i++){
            // .indexOf() return index of that substring from string.

            while(arr[i].indexOf(result) != 0){
                System.out.println(arr[i].indexOf(result));
                // update matched substring prefx
                result = result.substring(0, result.length()-1);

                // check for empty case. direct return if true..
                if(result.isEmpty()){
                    return "-1";
                }
            }
        }
        return result;
    }

    /* Driver Function to test other function */
    public static void main(String[] args)
    {
        GFG gfg = new GFG();
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String s=gfg.longestCommonPrefix(input);
    }
}

// this code is contributed by shantanu_mourya
