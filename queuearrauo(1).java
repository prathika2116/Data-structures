public class queue{
int maxsize=10;
int[] queue1;
int front,rear;
queue()
{
    queue1=new int[maxsize];
    front=-1;
    rear=-1;
}
public void enqueue(int data)
{  
    if(front==-1)
    {
        front++;
    }
    if(rear==maxsize-1)
    {
        System.out.println("Queue if full");
    }
    queue1[++rear]=data;
}
public int dequeue()
{
    if(front==-1 || front>rear)
    {
        throw new IndexOutOfBoundsException("queue is full");
    }
    return queue1[front++];
}
public static void main(String[] args)
{
    queue q=new queue();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
}
}
    
