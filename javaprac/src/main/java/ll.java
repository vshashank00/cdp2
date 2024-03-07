public class ll {
    int size=0;
     Node head;
     class Node{
        String value;
        Node next;
        public Node(String value){
             this.value=value;
             this.next=null;


        }}
    public void addf(String data){
        Node newnode=new Node(data);
        size++;
        if (head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;

    }



    public void addlast(String data){
         size++;
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        Node currnode=head;
        while (currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;

    }
    void addmid(String data){
         size++;
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        Node currnode=head;
        while (currnode.next!=null){
            if (currnode.value.equals("2"))
                break;
            currnode=currnode.next;
        }
        Node temp;
        temp=currnode.next;
        currnode.next=newnode;
        newnode.next=temp;

    }
    void search(String datatofind){
        int i=0;
         Node currnode =head;
         boolean found =false;
        while (currnode!=null)
        {

            if (!currnode.value.equals(datatofind))
            { currnode=currnode.next;

            }else {found=true;
                break;}
i++;
        }
if (found){
    System.out.println("found"+" at position "+i);}
else
    System.out.println("not found");
    }
    void printlist(){

        Node currnode=head;
         while (currnode!=null){
             System.out.print(currnode.value+"->");
        currnode=currnode.next;}
        System.out.println("null");
    }

    void delete(String valuetodelete){
         Node currnode=head;
         if(currnode.value.equals("1"))
         {head=head.next;
             size--;
         return;}

         for (int i=0;i<size;i++){
             if (currnode.next.value.equals(valuetodelete)){
                 currnode.next=currnode.next.next;
                 size--;
                 break;
             }
             currnode=currnode.next;
         }
    }
    void deleteall(){
         head=null;
size=0;
    }
    void temp(){
         Node curr=head;
         int a=0;
         while (curr!=null)
         { a++;
         curr=curr.next;
         }
             System.out.println(a);
    }
    public void rev(){

            if(head==null||head.next==null)
            {  return ;}

            Node curr=head.next;;
            Node prev=head;

            while(curr!=null){
                Node nextnode=curr.next;
                curr.next = prev;
                prev =curr;
                curr=nextnode;
            }
            head.next=null;
            head =prev;

            // code here

        Node currnode=head;
        while (currnode!=null){
            System.out.print(currnode.value+"->");
            currnode=currnode.next;}
        System.out.println("null");

    }
    Node recurr(Node head){
        if(head==null||head.next==null)
            return head;
        Node newhead=recurr(head.next);
        Node front =head.next;
        front.next=head;
        head.next=null;
        return newhead;
     }
void swap(){

    if(head==null||head.next==null)
        return;
    Node curr= head.next.next;
    Node prev=head;
    head=head.next;
    head.next=prev;
    while(curr!=null&&curr.next!=null)
    {    prev.next=curr.next;
        prev=curr;
        Node temp=curr.next.next;
        curr.next.next=curr;
         curr=temp;
    }
    prev.next=curr;

    return ;
}




    public static void main(String[] args) {
        ll linkedList=new ll();
        linkedList.addlast("1");
        linkedList.addlast("2");
        linkedList.addlast("2");
        linkedList.addlast("4");
        linkedList.addlast("5");
        linkedList.addlast("6");
        linkedList.addlast("7");
        linkedList.addlast("8");
        linkedList.printlist();

        linkedList.swap();
//        linkedList.addmid("3");
//        linkedList.addlast("5");
//        linkedList.rev();
//       linkedList.head= linkedList.recurr(linkedList.head);
        linkedList.printlist();

//        linkedList.temp();
//        linkedList.search("5");
//        linkedList.delete("1");
//        System.out.println("afterdeletion");
//        linkedList.deleteall();
//        linkedList.printlist();
//        System.out.println("size of linkedlist:"+linkedList.size);
    }
}
