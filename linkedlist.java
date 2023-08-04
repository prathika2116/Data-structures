public class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    LinkedList()
    {
        head=null;
    }
    public void insertAtBeg(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void insertAtPos(int data,int posval)
    {
        if(head==null)
        {
            insertAtBeg(data);
        }
        else{
            Node newNode=new Node(data);
            Node temp=head;
            while(temp.data!=posval)
            {
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }
    public void insertAtEnd(int data)
    {
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null)
        {
            insertAtBeg(data);
            
        }
        else{
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        if(temp.next==null)
        {
            temp.next=newNode;
        }
        }
    }
    public void deletebeg()
    {   if(head==null)
        {
        System.out.println("Trying to delete the empty List");
        }
        else if(head.next==null)
        {
            System.out.println("deleted the only element in the list");
        }
        else{
        head=head.next;
        }
    }
    public void deletepos(int posval)
    {   
        if(head==null)
        {
            System.out.println("Trying to delete the empty List");
        }
        else if(head.next==null)
        {
            if(head.data==posval)
            {
                head=head.next;
            }
            else{
               System.out.println("cannot find the element to delete");
            }
        }
        else{
             
        Node temp=head.next;
        Node prev=head;
        while(temp.data!=posval)
        {
            temp=temp.next;
            prev=prev.next;
        }
        if(temp.data==posval){
            prev.next=temp.next;
            temp.next=null;
        }
        if(temp.data!=posval)
        {
            System.out.println("cannot find the element to delete");
        }
        }
    }
    public void deleteend()
    {  if(head==null)
       {
        System.out.println("Trying to delete the empty List");
       }
       else if(head.next==null)
       {
           head=head.next;
       }
       else{
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
       }
    }
    public void size(){
        if(head==null)
        {
            System.out.println("0");
        }
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        System.out.println(count);
    }
     public void search(int data)
        {  if(head==null)
          {
            System.out.println("element not found");
          }
           Node temp=head;
           int index=0;
           while(temp.data!=data)
           {
               temp=temp.next;
               index++;
           }
           if(temp.data==data)
           {
                System.out.println("element "+data+" found at "+index);
           }
           else{
               System.out.println("element not found");
           }
       
        }
    public void display()
    {    
        Node temp=head;
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else{
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
     }
       
    }

	public static void main(String[] args) {
	    LinkedList l=new LinkedList();
	   l.insertAtBeg(24);
	    l.insertAtBeg(25);
	    l.insertAtBeg(26);
	    l.insertAtPos(24,25);
	    l.insertAtEnd(23);
	    l.deletebeg();
	    l.deletepos(24);
	    l.deleteend();
	    l.display();
	    l.size();
	    l.search(24);
	    
	}
}
