import java.util.Objects;
import java.util.Scanner;

public class favfinger {
    public static void main(String[] args) {
        int c=0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Double[] arr=new Double[a];
        sc.nextLine();
        for (int i =0;i<a;i++){
            arr[i]=sc.nextDouble();

        }
        for (int i =0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i].equals(arr[j])){
                    c++;
                }
            }
        }
        System.out.println(c);
    }

}
