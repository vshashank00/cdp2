import java.util.Arrays;

public class anagram {
    public static boolean isAnagram(String a,String b)

    {
        if(a.length()==b.length()){
            char str1[]= a.toCharArray();
            char str2[]= b.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            if (Arrays.equals(str1, str2)){
                return true;

            }


        }

        // Your code here
        return false;


    }
}
