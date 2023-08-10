class DoublyLinkedList{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data)
        {   this.data=data;
            next=null;
            prev=null;
        }
       }
        DoublyLinkedList()
        {
            head=null;
            tail=null;
        }
       public void insertatbeg(int data)
        {
            Node newnode=new Node(data);
            if(head==null)
            {
                head=newnode;
                tail=newnode;
            }
            else{
                newnode.next=head;
                head.prev=newnode;
                head=newnode;
            }
        }
        public void reverse()
        {
            Node temp=tail;
            System.out.print("null");
            while(temp!=null)
            {
                System.out.print("->"+temp.data);
                temp=temp.prev;
            }

        }
        public void insertpos(int data,int pos){
            Node temp=head;
            Node newnode=new Node(data);
            if(head==null)
            {
                System.out.println("List is empty");
            }if(pos==0)
            {
                insertatbeg(data);
            }
            for(int i=1;i<pos && temp!=null;i++)
            {
                temp=temp.next;
            }
            if(temp.next!=null)
            temp.next.prev=newnode;
            newnode.next=temp.next;
            temp.next=newnode;
            newnode.prev=temp;
        }
        public void deleteatpos(int pos)
        {
            Node temp=head;
            Node pre=temp;
            temp=temp.next;
            if(pos==0)
            head=head.next;
            for(int i=1;i<pos &&temp!=null;i++)
            {
                temp=temp.next;
            }
            if(temp.next!=null)
            temp.next.prev=pre;
            pre.next=temp.next;
        }
        public void display()
        {
            Node temp=head;
            System.out.println();
            while(temp!=null)
            {
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.print("null");
        }
    
    public static void main(String[] args)
   { DoublyLinkedList d=new DoublyLinkedList();
     d.insertatbeg(23);
     d.insertatbeg(24);
     d.reverse();
     d.insertpos(22,1);
     d.deleteatpos(0);
     d.display();
   }
    
}
