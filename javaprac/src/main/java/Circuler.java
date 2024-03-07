public class Circuler {
    Nodec head;
    static int s=0;
    Nodec tail;
    class Nodec {
        int value;
        Nodec next;
        Nodec(int value){
            this.value=value;
            this.next=null;

        }

    }
    Nodec addc(int value){
        Nodec nodec = new Nodec(value);
        if (head==null)
        {head=nodec;}
        nodec.value=value;
        nodec.next=nodec;
        head=nodec;
        tail=nodec;
s++;
return head;
    }
    void addoll(int loc ,int value) {
        Nodec nodec = new Nodec(value);

        if (head == null)
        {  head = nodec;}
        else if (loc == 0)
        { nodec.next = head;
        head = nodec;
        tail.next = nodec;
    }else if (loc>=s){
            tail.next=nodec;
            tail=nodec;
            tail.next=head;

        }else{
            Nodec tmp = head;

        int ind=0;
            while (ind<loc-1){
                tmp=tmp.next;
                ind++;
            }

            nodec.next=tmp.next;
            tmp.next=nodec;

}
//        System.out.println(head.value);
        s++;
    }
    void print(){
        if (head != null) {
            Nodec tempNode = head;
            for (int i=0; i<s; i++) {
                System.out.print(tempNode.value);
                if (i != s-1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        } else {
            System.out.println("CSLL does not exist!");
        }

    }
    void searchCC(int value){
        if(head==null)
            return;
        Nodec curr =head;
       for (int i=0;i<s;i++){
            if (curr.value==value)
            { System.out.println(curr.value+" at pos:"+(i+1));
               return;}
            curr=curr.next;
        }
        System.out.println("not found");

    }
    void deletecc(int loc){
        Nodec curr=head;
        if (head==null)
            return;
       else if (loc==0){
            head=curr.next;
            tail.next=head;
            s--;
            if (s==0){
                head=null;
                tail=null;
                head.next=null;
            }

        }else if (loc<s-1){//mid

            int i=0;
            while (i<loc-1){
                curr=curr.next;
                i++;
            }
            curr.next=curr.next.next;
            s--;
        }else
        {  int i=0;
            while (i<s-1){//last
                curr=curr.next;
                i++;
            }
            curr.next=head;
            tail=curr;
            s--;
            if(head==tail){
                head=null;
                tail=null;
                head.next=null;
            }

        }
    }
    void deleteall(){
        Nodec curr=head;
        if (head==null)
            return;
        head=null;
        tail.next=null;
        tail=null;
        System.out.println("deleteall");

    }

    public static void main(String[] args) {
        Circuler circuler= new Circuler();
        circuler.addc(5);
        circuler.addoll(0,4);
        circuler.addoll(1,6);
        circuler.addoll(8,7);
        circuler.print();
        circuler.searchCC(7);
        circuler.deletecc(2);
        circuler.print();
        System.out.println(s);


    }
}
