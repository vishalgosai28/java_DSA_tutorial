public class Doubly_Linklist {

    Node head;
    class Node{
        Node next;
        Node prev;
        int data;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public void insertfrist(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        head.prev=null;
    }
    public void insertlast(int data)
    {
        Node newnode=new Node(data);

        if(head==null)
        {
            head=newnode;
            return;
        }
        Node cuNode=head;
        while (cuNode.next!=null) {
            cuNode=cuNode.next;
        }
        cuNode.next=newnode;
        newnode.prev=cuNode;
    }
    public void display()
    {
        Node n=head;
        while (n!=null) {
            System.out.print("->"+n.data);
            n=n.next;
        }
        System.out.println("->"+"null");
    }
    public void displayreverse()
    {
        if(head==null)
        {
           System.out.println("List is empty....");
            return;
        }
        Node cuNode=head;
        while (cuNode.next!=null) {
            cuNode=cuNode.next;
        }
        while (cuNode!=null) {
            System.out.print("->"+cuNode.data);
            cuNode=cuNode.prev;
            
        }
        System.out.println("->"+"null");
    }
    public void deletefrist()
    {
        if(head==null)
        {
           System.out.println("List is empty....");
            return;
        }
        head=head.next;
        head.prev=null;
        
    }
    public void deletelast()
    {
        if(head==null)
        {
           System.out.println("List is empty....");
            return;
        }
        Node last=head.next;
        Node scondlast=head;
        while (last.next!=null) {
            last=last.next;
            scondlast=scondlast.next;   
        }
        scondlast.next=null;

    }
    public static void main(String[] args) {
        Doubly_Linklist dl=new Doubly_Linklist();
        dl.insertfrist(2);
        dl.insertfrist(1);
        dl.insertfrist(0);
        dl.insertlast(3);
        dl.display();
        dl.deletelast();
        dl.display();
        //dl.displayreverse();
    }
}
