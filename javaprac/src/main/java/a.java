public class a {
    static int k;
    void he(){
        k=10;
    }
    void gh(){
        System.out.println(k);
    }

    public void hello() {
        System.out.println("i m in a");
    }

    public static void main(String[] args) {
//
        // Your code here
        int c=20^10;
        int k=0;
        int i=0;
        String s= Integer.toBinaryString(c);
        while(i<s.length()){
            if(s.charAt(i)=='1')
                k++;
            i++;

        }
        System.out.println(k);
    }

}

