public class Circular_Linklist {
    Node head;
    Node tail;
    class Node{
        int data;
        Node nextnode;
        Node(int data)
        {
            this.data=data;
            this.nextnode=null;
        }
    }
    public void insert(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            newnode=head;
            newnode=tail;
            return;
        }
        tail.nextnode=newnode;
        newnode.nextnode=head;
        tail=newnode;
    }
    public void display()
    {
        Node curNode=head;
        if(curNode!=null)
        {
            System.out.println("end");
            
            do{
                System.out.print("->"+curNode.data);
                curNode=curNode.nextnode;
            }while(curNode.nextnode!=head);
        }
    }
    public static void main(String[] args) {
        Circular_Linklist cl=new Circular_Linklist();
        cl.insert(1);
        cl.insert(2);
        cl.insert(3);
        cl.insert(4);
        cl.insert(5);
        // cl.display();
    }
}
