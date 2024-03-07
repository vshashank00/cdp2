import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class UncommonChars {
    public static void main(String[] args) {

        String A="characters";
        String B="alphabets";
        HashMap<Character,Integer>hm=new HashMap<>();
        HashSet<Character>hashSet=new HashSet<>();
        for(int i=0;i<B.length();i++){
            if(!hm.containsKey(B.charAt(i)))
                hm.put(B.charAt(i),2);

        }
        for(int i=0;i<A.length();i++){
            if(!hm.containsKey(A.charAt(i))){
                hashSet.add(A.charAt(i));
            }else
                hm.put(A.charAt(i),1);
        }
        for(int i=0;i<B.length();i++){
            if(hm.get(B.charAt(i))!=1)
                hashSet.add(B.charAt(i));
        }


        String b="";
        for (Character c:hashSet){
            b=b+c;
        }
       char c[]= b.toCharArray();
        System.out.println(Arrays.toString(c));
        Arrays.sort(c);
        System.out.println(String.valueOf(c));
        }}


