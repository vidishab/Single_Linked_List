public class linkedlist {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void push (int dd)
    {
        Node ob1 = new Node(dd);
        ob1.next=head;
        head=ob1;
    }
    public void pushafter(int dd)
    {
        Node ob = new Node(dd);
        if (head == null)
        {
            head=ob;
            head.next=null;
            return;
        }

        Node last = head;
        while (last.next != null)
        {
            last=last.next;
        }
        last.next=ob;
    }
    public void print()
    {
        Node last = head ;
        while(last != null)
        {
            System.out.println(last.data);
            last = last.next;
        }
    }

    public void pushatloc(int pp,int p1)
    {
        Node ob1 = new Node(pp);
        Node last = head;
        int count = 0;
        while(count < p1 )
        {
            last = last.next;
            count ++;
        }
        ob1.next=last.next;
        last.next=ob1;
    }
    public static void main(String args[])
    {
        linkedlist ob = new linkedlist();
        ob.push(5);
        ob.pushafter(7);
        ob.pushafter(9);
        ob.pushatloc(3,1);
        ob.print();
    }
}

