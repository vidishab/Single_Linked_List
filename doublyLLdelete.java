public class doublyLLdelete {
    Node head;
    class Node
    {
        int data;
        Node left;
        Node right;
        Node(int d)
        {
            data=d;
            left=null;
            right=null;
        }
    }
    public void push(int p)
    {
        Node temp=head;
        Node newnode = new Node(p);
        if(head == null)
        {
           head=newnode;
           return;
        }
        newnode.right=temp;
        temp.left=newnode;
        head=newnode;
    }
    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp=temp.right;
        }
    }
    public void delfirst()
    {
        Node temp=head;
        head=temp.right;
        temp.right.left=null;
    }
    public void dellast()
    {
        Node temp=head;
        while(temp.right.right != null)
        {
            temp=temp.right;
        }
        temp.right=null;
    }
    public void delatloc(int pos)
    {
        int count=0;
        Node temp=head;
        while(count < pos && temp != null)
        {
            temp=temp.right;
            count++;
        }
        temp.right.right.left= temp.right.left;
        temp.right=temp.right.right;

    }
    public static void main(String args[])
    {
        doublyLLdelete ob = new doublyLLdelete();
        for(int i=1;i<=10;i++)
        {
            ob.push(i);
        }

        ob.delfirst();
        ob.delfirst();
        ob.dellast();
        ob.delatloc(4);
        ob.print();
    }
}

