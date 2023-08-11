public class stack
{  
    int[] s=new int[10];
    int top;
    stack()
    {
        top=-1;
    }
    public void push(int data)
    {
        if(top>9)
        {
            System.out.println("stack over flow");
        }
        else{
    
            s[++top]=data;
        }
    }
    public void display()
    {
        if(top<0)
        {
            System.out.println("stack under flow");
        }
        for(int i=top;i>=0;i--)
    {
        System.out.println(s[i]);
    }
    }
    public int pop()
    {
        if(top>=0)
        {
        
            return s[top--];
        }
        else{
            System.out.println("stack under flow");
        }
        return -1;
    }
	public static void main(String[] args) {
		stack s1=new stack();
		s1.push(10);
		s1.push(11);
		s1.push(23);
		s1.push(12);
		s1.display();
		System.out.println("poped element is:"+s1.pop());
		s1.display();
	}
}
