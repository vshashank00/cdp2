import java.util.HashMap;

public class Solution1 {

            public static void main(String[] args) {

//String str1="amazon";
//
//String str2="azonam";
//  if (str1.length()!=str2.length())
//      return;
//  String clock="";
//                String anticlock="";
//                        anticlock=anticlock+str1.charAt(str1.length()-2)+str1.charAt(str1.length()-1)+str1.substring(0,str1.length()-2);
//                clock=clock+str1.substring(2,str1.length())+str1.charAt(0)+str1.charAt(1);
//                System.out.println(clock+" "+anticlock);
                String s="aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv";
                HashMap<Character,Integer>hashMap=new HashMap<>();
                int i=0,j=0;
                int max=0;
                int n=s.length();
                while (i< n){
                    if (hashMap.containsKey(s.charAt(i)))
                        j=Math.max(hashMap.get(s.charAt(i))+1,j);
                    hashMap.put(s.charAt(i),i);
                    max=Math.max(i-j+1,max);
                    i++;
                }
                System.out.println(max);
            }}




