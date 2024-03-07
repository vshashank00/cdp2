public class b extends a{
    int i=20;
   public void hello(){
        System.out.println("i m in b");
    }
    public static void main(String[] args) {
        b c=new b();
        System.out.println(c.i);
        c.hello();
    }
}
