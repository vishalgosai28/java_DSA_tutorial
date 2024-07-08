import java.util.Stack;

class stack_program{

    public static int[] array;
    public static int top;
    stack_program(int size)
    {
        array=new int[size];
        top=-1;
    }

    public void push(int element)
    {
        if(top==array.length-1)
        {
            System.out.println("Stack is overflow....");
        }
        else
        {
            top++;
            array[top]=element;
            System.out.println("|"+array[top]+"|");

        }
    }
    public void pop()
    {
        
        if(top==-1)
        {
            System.out.println("Stack is Empty....");   
        }
        else
        {
            int x=array[top];
            top--;
            System.out.println("|"+x+"|");
        }
    }
    public void print()
    {
        
        if(top==-1)
        {
            System.out.println("Stack is Empty....");   
        }
        else{
            for(int i=0;i<array.length-1;i++)
            {
                System.out.print("|"+array[i]+"|");
            }
        }
    }
}

public class stack {
    public static void main(String[] args) {
        
        /*stack_program s=new stack_program(5);
        System.out.print("Stack push element is:");
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.print("Stack pop element is:");
        s.pop();
        System.out.print("Stack element is:");
        s.print();*/


    }
}
