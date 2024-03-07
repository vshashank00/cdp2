public class Doublylinkedlist {
    Dnode head;
    Dnode tail;
    static int sizedd=0;

    class Dnode{
        Dnode prev;
        int data;
        Dnode next;
        }
        void Cretefirstnode( int data){
            Dnode newnode= new Dnode();
            head=newnode;
            tail=newnode;
            newnode.next=null;
            newnode.prev=null;
            newnode.data=data;
//            System.out.println(newnode.data);
              sizedd++;
        }
        void addDnode(int loc,int data){

            Dnode newnode= new Dnode();
            Dnode curr=head;
            if (head==null)head=newnode;
            else if (loc==0){
                newnode.next=head;
                newnode.data=data;
                head.prev=newnode;
                head=newnode;
                sizedd++;
            }else if (loc>=sizedd-1){

              tail.next=newnode;
              newnode.data=data;
              newnode.prev=tail;
              newnode.next=null;
              tail=newnode;
                sizedd++;

            }else {
                int index=0;
                while (index<loc-1){
                    curr=curr.next;
                    index++;
                }
                newnode.next=curr.next;
                curr.next.prev=newnode;
                newnode.prev=curr;
                curr.next=newnode;
                newnode.data=data;
                sizedd++;

            }


        }
        void print(){
        Dnode curr=head;
       for (int i=0;i<sizedd;i++){
            System.out.print(curr.data);
            curr=curr.next;
            if (i!=sizedd-1)
                System.out.print("->");
        }
            System.out.println();
        }
        void revtravel(){
        int i=0;
        Dnode curr=tail;
        while (curr!=head.prev){
            System.out.print(curr.data);
            if (i!=sizedd-1)
                System.out.print("<-");
            i++;
            curr=curr.prev;
        }
            System.out.println();
        }
        void searchinddl(int data){
        Dnode curr=head;
        for (int i=0;i<sizedd;i++){
            if (curr.data==data){
                System.out.println("element found at"+(i+1));
                return;
            }
            curr=curr.next;
        }
            System.out.println("not found");

        }
        void delete(int loc){
        Dnode curr=head;
        if (head==null)
            return;
        else if (loc==0) {
            if (sizedd==1){
                head=null;
                tail=null;
                sizedd--;
                return;
            }
            head=curr.next;
            curr.next.prev=null;
            curr.next=null;
        }else if (loc>=sizedd-1){
            curr=tail.prev;
            if (sizedd==1){
                head=null;
                tail=null;
                sizedd--;
                return;

            }
            curr.next=null;
            tail=curr;
        }else
        {
            int index=0;
            while (index<loc-1){
                curr=curr.next;
                index++;
            }
            curr.next=curr.next.next;
            curr.next.prev=curr;
        }
        sizedd--;
    }
    void deleteall()
    {
        Dnode curr=head;
        for (int i=0;i<sizedd;i++){
            curr.prev=null;
            curr=curr.next;
        }
        head=null;
        tail=null;
        System.out.println("delete whole list");
    }



        public static void main(String[] args) {
        Doublylinkedlist doublylinkedlist=new Doublylinkedlist();
        doublylinkedlist.Cretefirstnode(4);
        doublylinkedlist.addDnode(0,2);
            doublylinkedlist.addDnode(1,7);
            doublylinkedlist.addDnode(5,8);
            doublylinkedlist.print();
            System.out.println(sizedd);
            doublylinkedlist.revtravel();
//            doublylinkedlist.searchinddl(8);
//            doublylinkedlist.delete(5);
//            doublylinkedlist.print();


        }
    }


