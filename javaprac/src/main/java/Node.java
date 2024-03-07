class Node {
    public static void main(String[] args) {
        int arr[]={1,2,0,2,1};
        int a=0,b=0,c=0;
        for (int i=0;i<5;i++){
            if(arr[i]==0)
                a++;
            else if(arr[i]==1)
                b++;
            else c++;

        }
        for (int i=0;i<5;i++){
            if(a!=0){
                a--;
                arr[i]=0;
            }else if(b!=0){
                b--;
                arr[i]=1;
            }
    }
}}