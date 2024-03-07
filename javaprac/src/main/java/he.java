import java.util.Scanner;

public class he implements traffic {
    void check(){
        System.out.println("check");
    }

    public static void main(String[] args) {
        traffic h=new he();
        he b=new he();
        h.greenGo();
        h.redStop();
        h.yellowWait();
b.check();

//        int a[][]={{1,2,3},{1,2,3},{1,2,3}};
//        for ( int i=0;i<a.length;i++){
//            for (int j=0;j<a.length;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
//int a= 2;
//int b=3;
//a=a+b;
//b=a-b;
//a=a-b;
//        System.out.println("a="+a);
//        System.out.println("b="+b);
//        int temp;
//        int a[]={5,6,1,8,2};
//        for (int i=0;i<a.length;i++){
//            for(int j=i+1;j<a.length;j++){
//            if(a[i]>a[j]){
//                temp=a[i];
//                a[i]=a[j];
//                a[j]=temp;}
//            }
//
//        }
//for(int j=0;j<a.length;j++)
//        {
//            System.out.println(a[j]);

    }
    @Override
    public void greenGo() {
        System.out.println("go");

    }

    @Override
    public void redStop() {
        System.out.println("stop");

    }

    @Override
    public void yellowWait() {
        System.out.println("wait");

    }

//        Scanner scanner = new Scanner(System.in);
//
//        int N=scanner.nextInt();
//        scanner.nextLine();
//        String S=scanner.nextLine();
//        scanner.close();
//        System.out.println(N*2);
//        System.out.println(S);
//        Scanner s = new Scanner(System.in);
//        int i =s.nextInt();
//        int k=i;
//        for(int j=1;j<k;j++)
//        {
//            i=i*j;
//        }
//
//        System.out.println(i);
//        String s="madam";
//        String d="";
//        for(int i=s.length()-1;i>=0;i--){
//            d=d+s.charAt(i);
//        }
//        System.out.println(d);
//        if(s.equals(d)){
//            System.out.println("pali");
//        }else{
//            System.out.println("nopali");
//
//        }

}
