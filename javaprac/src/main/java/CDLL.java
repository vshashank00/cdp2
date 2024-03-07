public class CDLL {
    CNode head;
    CNode tail;
    static int sizeCdd=0;
    public class CNode{
        int value;
        CNode next;
        CNode prev;
    }
    void addcfirstnode(int value){
        CNode cNode=new CNode();
        cNode.value=value;
        head=cNode;
        tail=cNode;
        tail.next=cNode;
        cNode.next=null;
        cNode.prev=null;
        sizeCdd++;

    }
    void superadd(int value,int loc){
        CNode cNode=new CNode();
        cNode.value=value;
        if (head==null)
        { head=cNode;
        return;}

        if (loc==0){
            cNode.next=head;
            cNode.prev=tail;
            head.prev=cNode;
            head=cNode;
            tail.next=cNode;
            sizeCdd++;
        }else if (loc>=sizeCdd){
          cNode.next=head;
          cNode.prev=tail;
          head.prev=cNode;
          tail.next=cNode;
          tail=cNode;
            sizeCdd++;

        }else
        {
            int index=0;
            CNode tmp=head;
            while (index<loc-1) {
                tmp = tmp.next;
                index++;
            }
            cNode.prev=tmp;
            cNode.next=tmp.next;
            tmp.next=cNode;
            cNode.next.prev=cNode;
            sizeCdd++;
        }


    }

    void traverse(){
        CNode curr=head;
        for (int i=0;i<sizeCdd;i++){
            System.out.print(curr.value);
            curr=curr.next;
            if (i!=sizeCdd-1)
                System.out.print("->");
        }
        System.out.println();

        }
        void rectraverse(){
        CNode curr=tail;
            for (int i=0;i<sizeCdd;i++){
                System.out.print(curr.value);
                if (i!=sizeCdd-1)
                    System.out.print("<-");
                curr=curr.prev;
            }
            System.out.println();

            }


            void searchincdll(int value){
        CNode curr=head;
                for (int i=0;i<sizeCdd;i++){
                    if (curr.value==value)
                    {  System.out.println(i+1);
                    return;}

curr=curr.next;
            }
                System.out.println("not found");
    }
    void delete(int loc){
        CNode curr=head;
        if (head==null){
            return;
        }else if(loc==0){
            if (sizeCdd==1){
                head=null;
                head.prev=null;
                head.next=null;
                tail=null;
                sizeCdd--;

            }
            curr=head.next;
            curr.prev=null;
             head=curr;
            tail.next=head;
            sizeCdd--;
        }else if (loc>=sizeCdd){
            if (sizeCdd==1){
                head=null;
                head.prev=null;
                head.next=null;
                tail=null;
                sizeCdd--;
                return;
            }

           tail=tail.prev;
           tail.next=head;
           sizeCdd--;

        }else {
            int index=0;

            while (index<loc-1){
                curr=curr.next;
                index++;
            }
            curr.next=curr.next.next;
            curr.next.prev=curr;
            sizeCdd--;

        }

    }




    public static void main(String[] args) {
        CDLL cdll= new CDLL();
        cdll.addcfirstnode(1);
        cdll.superadd(3,0);
        cdll.superadd(4,1);
        cdll.superadd(5,0);
        cdll.superadd(6,2);
        cdll.superadd(8,10);
        cdll.traverse();
        cdll.rectraverse();
        cdll.searchincdll(8);
        cdll.delete(2);
        cdll.traverse();



    }
}
