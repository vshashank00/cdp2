import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
//        Stream.of("Shashank","ade","a").filter(s -> s.startsWith("a")).sorted().map(s -> s.toUpperCase()).forEach(s-> System.out.println(s));
//        String s="sdfghj";
//        char c[]=s.toCharArray();
//        String t="";
//        for (int i=c.length-1;i>=0;i--){
//            t=t+c[i];
//        }
//        System.out.println(t);
        int arr[]={1,2,60,7,5};
        int tmp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    tmp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=tmp;
                }
            }}
            for(int k=0;k<arr.length;k++){
                System.out.println(arr[k]);
            }

// Java program to demonstrate working of split(regex,
// limit) with high limit.

                String str ="image1 en";
                String[] arrOfStr = str.split(" ",0);

                for (String a : arrOfStr)
                    System.out.println(a);
            }
        }


