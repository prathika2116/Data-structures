public class stacklinked
{ Node top;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    stacklinked()
    {
        top=null;
    }
    public void push(int data)
    {
        Node newnode=new Node(data);
        if(top==null){
            top=newnode;
        }
        else{
            newnode.next=top;
            top=newnode;
        }
    }
    public void display()
    {
        Node temp=top;
        while(temp!=null)
        {   System.out.print("<-"+temp.data);
            temp=temp.next;
        }
    }
    public void pop()
    {
        Node temp=top;
        if(top==null)
        {
            System.out.println("stack underflow");
        }
        else{
        top=top.next;
    
        }
    }
	public static void main(String[] args) {
		stacklinked sl=new stacklinked();
		sl.push(97);
		sl.push(98);
		sl.push(99);
		sl.push(100);
		sl.pop();
		sl.pop();
		sl.pop();
		sl.pop();
		sl.pop();
		sl.display();
	}
}
