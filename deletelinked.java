public class deletelinked {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public void push(int r)
    {
        Node ob = new Node (r);
        if ( head == null)
        {
            head = ob;
            return;
        }
        Node last = head;
        while(last.next != null)
        {
            last = last.next;
        }
        last.next = ob;
    }

    public void delfirst()
    {
        Node last = head;
        last = head.next;
        head.next = null;
        head = last;
    }
    public void dellast()
    {
        Node last = head;
        while(last.next.next != null)
        {
            last = last.next;
        }
        last.next = null;
    }
    public void delatloc(int p)
    {
        Node last = head;
        int count = 0;
        while (count < p && last != null)
        {
            last = last.next;
            count++;
        }
        last.next=last.next.next;
    }
    public void print()
    {
        Node last = head;
        while(last != null)
        {
            System.out.println(last.data);
            last = last.next;
        }
    }
    public static void main(String args[])
    {
        deletelinked dl = new deletelinked();
        for ( int i=1; i<=10; i++)
        {
            dl.push(i);
        }
        //dl.print();
        dl.delfirst();
        dl.dellast();
        dl.delatloc(3);
        dl.delatloc(2);
        dl.print();
    }
}

