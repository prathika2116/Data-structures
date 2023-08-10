class CircularLinkedList {
    Node last;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    CircularLinkedList() {
        last = null;
    }

    public void insertatbeg(int data) {
        Node newnode = new Node(data);
        if (last == null) {
            last = newnode;
            newnode.next = newnode;
        } else {
            newnode.next = last.next;
            last.next = newnode;
        }
    }

    public void display() {
        if (last == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node temp = last.next;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != last.next);
    }

    public void insertatend(int data) {
        Node newnode = new Node(data);
        if (last == null) {
            last = newnode;
            newnode.next = newnode;
        } else {
            newnode.next = last.next;
            last.next = newnode;
            last = newnode;
        }
    }
   public void deleteatbeg()
   {
       if(last==null)
       {
           System.out.println("trying to delete a empty list");
       }
       else{
          last=last.next.next;
       }
   }
   public void deleteatend()
   {if(last==null)
       {
           System.out.println("trying to delete a empty list");
       }
      else{
          Node temp=last.next;
          while(temp.next!=last)
          {
              temp=temp.next;
          }
          temp.next=last.next;
          last=temp;
      } 
   }
    public static void main(String[] args) {
        CircularLinkedList c = new CircularLinkedList();
        c.insertatbeg(23);
        c.insertatbeg(24);
        c.insertatbeg(25);
        c.insertatend(44);
        c.deleteatbeg();
        c.deleteatend();
        c.display();
    }
}
