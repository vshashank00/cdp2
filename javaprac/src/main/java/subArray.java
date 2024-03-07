import java.util.ArrayList;

public class subArray {
    public String isSubset( long a1[], long a2[], long n, long m) {
        ArrayList<java.lang.Long> ls =new ArrayList<>();

        for (long i:a1)
              ls.add(i);
        System.out.println(ls);
        for(int i=0;i<a2.length;i++){
            if(!ls.contains(a2[i])){
                return "No";}


        }
    return "Yes";
    }
    public static void main(String[] args) {
        long n= 9;
        long a1[]={11,7,1,13,21,3,7,3};
        long a2[]={11,3,7,1,7,9};
        long k=3;
subArray s=new subArray();
       String min=s.isSubset(a1,a2,n,k);
        System.out.println(min);

    }
}
