public class circularLLdelete {
    Node head;
    private Node he;

    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=this;
        }
    }
    public void pushelements(int p)
    {
        Node newnode = new Node(p);
        if(head == null )
        {
            head =newnode;
            return;
        }
        Node current= head;
        do {
            current=current.next;
        }while(current.next != head);
        current.next=newnode;
        newnode.next= head;
        head =newnode;
    }
    public void dellast()
    {
         Node current= head;
         do {
             current=current.next;
         }while(current.next.next != head);
         current.next.next=null;
         current.next= head;

    }
    public void delfirst()
    {
        Node current= head;
        do {
            current=current.next;
        }while(current.next != head);
        current.next= head.next;
        head.next=null;
        head=current.next;
    }
    public void print()
    {
        Node current= head;
        do {
            System.out.println(current.data);
            current=current.next;
        }while(current != head);
    }
    public static void main(String args[])
    {
        circularLLdelete ob = new circularLLdelete();
        for ( int i=1;i<=10;i++) {
            ob.pushelements(i);
        }

        ob.dellast();
        ob.dellast();
        ob.delfirst();
        ob.delfirst();
        ob.print();
    }
}

