public class substring {
    public static void main(String[] args) {
        String s="abcabcabcd";
        String x="abcd";
        int i=0;
        int j=x.length();
        while (!(j>s.length())){
            if (x.equals(s.substring(i,j))){
                System.out.println(i);
                break;}

            i++;
            j++;

        }
        System.out.println();

    }
}
