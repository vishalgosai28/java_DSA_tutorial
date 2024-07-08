public class Singular_Linklist {
    Node head;
    class Node{
        String data;
        Node nextnode;

        Node(String data)
        {
            this.data=data;
            this.nextnode=null;
        }
    }
    public void addfrist(String data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }

        newnode.nextnode=head;
        head=newnode;
    }
    public void addlast(String data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        Node currentnode=head;
        while (currentnode.nextnode!=null) {
            currentnode=currentnode.nextnode;
        }
        currentnode.nextnode=newnode;
    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("Linklist is empty....");
            return;
        }
        Node currentnode=head;
        while (currentnode!=null) {
            System.out.print("|"+currentnode.data);
            currentnode=currentnode.nextnode;       
        }
        System.out.print("|"+"Null");
    }
    public void deletefrist()
    {
        if(head==null)
        {
            System.out.println("Linklist is empty....");
            return;
        }
        head=head.nextnode;

    }
    public void deletelast()
    {
        if(head==null)
        {
            System.out.println("Linklist is empty....");
            return;
        }
        Node secoundlast=head;
        Node lastnode=head.nextnode;       
         while (lastnode.nextnode!=null) {
            secoundlast=secoundlast.nextnode;
            lastnode=lastnode.nextnode;
        }
        secoundlast.nextnode=null;
    }
    /*public void reverse()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node cuNode=head.nextnode;
        Node prNode=head;
        Node nextNode=cuNode.nextnode;
        while (cuNode.nextnode!=null) {
            prNode=nextNode;
            nextNode=prNode;   
            cuNode=cuNode.nextnode;
        }
    }*/

    public static void main(String[] args) {

        Singular_Linklist ll=new Singular_Linklist();
        ll.addfrist("am");
        ll.addfrist("I");
        ll.addlast("Vishal");
        ll.print();
        //ll.deletefrist();
        //ll.deletelast();
        //ll.reverse();
        ll.print();
        
    }
}
