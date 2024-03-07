//public class mainclass {
//    static int i = 1;
//    public static void detdata(){
//        i++;
//        System.out.println(i);
//    }
//
//    public static void main(String[] args) {
////        a c=new b();
////        System.out.println(c.i);
////        c.hello();
//        mainclass mc = new mainclass();
//        System.out.println(i);
//
//        mainclass.detdata();
//    }
//}
public class StringBufferExample {
    public static void main(String[] args)
    {
//        int arr [] = new int[5];
        String s = "madam";
        String r="";
        for (int i =s.length()-1;i>=0;i--){
            r=r+s.charAt(i);



        }
        System.out.println(r);
        if(s.equals(r)){
            System.out.println("poli");
        }
    }
}
