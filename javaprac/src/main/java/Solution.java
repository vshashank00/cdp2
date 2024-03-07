import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here

        ArrayList <Integer>list=new ArrayList<Integer>();
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    if (list.contains(arr[i])){
                        break;
                    }else
                        list.add(arr[i]);
                }

            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }


    return list;
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int arr[]=new int[n];
//        for (int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//
//        }
//       ArrayList<Integer> res =Solution.duplicates(arr,n);
//        List r=res.stream().sorted().collect(Collectors.toList());
//        System.out.println(r);
      String x="{([])}";
            char c[]=x.toCharArray();
            if(c.length==1)
                System.out.println("false");
            Stack<Character>stack=new Stack<>();
            for (Character b: c){
                if (b=='{'||b=='['||b=='('){
                    stack.push(b);

                } else if (stack.isEmpty()||!((b == ']' &&stack.pop()=='[')||( b == ')' &&stack.pop()=='(')|| (b == '}'&&stack.pop()=='{'))) {

                    System.out.println("false");

                }



            }
            if(stack.isEmpty())
                System.out.println("true");
            System.out.println("false");
        }}