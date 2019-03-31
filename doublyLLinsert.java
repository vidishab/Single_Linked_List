public class doublyLLinsert {
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
    public void pushbefore(int p)
    {
        Node temp = head;
        if(head == null) {
            Node newnode = new Node(p);
            //System.out.println(newnode.data);
            head=newnode;
            return;
        }
        Node newnode = new Node(p);
        newnode.right=temp;
        temp.left=newnode;
        head=newnode;
    }
    public void pushafter(int q)
    {
        Node temp = head;
        Node newnode = new Node(q);
        while(temp.right != null)
        {
            temp = temp.right;
        }
        temp.right=newnode;
        newnode.left=temp;
    }
    public void pushatloc(int pos,int r)
    {
        int count=0;
        Node newnode = new Node(r);
        Node temp = head;
        while(count < pos && temp != null)
        {
            temp = temp.right;
            count++;
        }
        temp.right.left=newnode;
        newnode.right=temp.right;
        temp.right=newnode;
        newnode.left=temp;

    }
    public void print()
    {
        Node last = head;
        while(last != null)
        {
            System.out.println(last.data);
            last=last.right;
        }
    }
    public static void main(String args[])
    {
        doublyLLinsert ob = new doublyLLinsert();
        for (int i=0;i<10;i++)
        {
            ob.pushbefore(i);
        }
        ob.pushafter(100);
        //ob.print();
        System.out.println("Enter the location");
        ob.pushatloc(3,40);
        ob.print();

    }
}

