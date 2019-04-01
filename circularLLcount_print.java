public class circularLLcount_print {
    Node head;
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
    public void pushbefore(int p)
    {
        Node newnode = new Node(p);
        Node current=head;
        Node temp=head;
        if(head == null )
        {
            head=newnode;
            return;
        }
        do
        {
            temp=temp.next;
        }while(temp.next!= head);
        temp.next = newnode;
        newnode.next = head;
        head = newnode;

    }
    public void pushafter(int q)
    {
        Node newnode = new Node(q);
        Node current=head;
        do {
            current=current.next;
        }while(current.next != head);
        current.next=newnode;
        newnode.next=head;
    }
    public void print()
    {
            Node current = head;
            do
             {
                System.out.println(current.data);
                current = current.next;
            }
            while (current != head);
    }
    public void count()
    {
        Node current=head;
        int count = 0;
        do {
            count++;
            current=current.next;
        }while(current != head);
        System.out.println("Count of nodes "+count);
    }
    public static void main(String args[])
    {
        circularLLcount_print ob = new circularLLcount_print();
        ob.pushbefore(1);
        ob.pushbefore(2);
        ob.pushbefore(5);
        ob.pushafter(3);
        ob.pushafter(4);
        ob.pushbefore(6);
        ob.print();
        ob.count();

    }
}

