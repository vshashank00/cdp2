
public class SinglyLinkedList {

    public  static Nodd head;
    public static Nodd tail;
    public  static int size;
    public class Nodd {
        public int value;
        public Nodd next;
    }
    Nodd first(int value){
        Nodd newnode=new Nodd();
        head=newnode;
        newnode.value=value;
        newnode.next=null;
        tail=newnode;
        size++;
        return head;

    }


    public void push(int nodeValue) {
        // From previous question
        Nodd newnode=new Nodd();
        SinglyLinkedList s=new SinglyLinkedList();
        if (head==null)
            head=s.first(nodeValue);
        else
        {
            tail.next=newnode;
            tail=newnode;
            newnode.next=null;
            newnode.value=nodeValue;
            size++;

        }
    }

    public Nodd pop() {
        Nodd curr=head;
        if (head==null){
            return null;
        }else{
            int index=0;
            while(index<size-1){
                curr=curr.next;
                index++;
            }

            curr.next=null;
            tail=curr;
            size--;
            if(size==0){
                head=null;
                tail=null;

            }
            return head;
        }

    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.push(5);
        singlyLinkedList.push(10);

        singlyLinkedList.pop(); // 10

        singlyLinkedList.pop(); // 5
        singlyLinkedList.pop()  ; // The SLL does not exist

    }




}