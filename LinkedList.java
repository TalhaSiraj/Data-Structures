package javaapplication19;

public class JavaApplication19 {
    public static void main(String[] args) {
        Slinkedlist slist = new Slinkedlist();
        slist.addFirst(10);
        slist.addFirst(25);
        slist.addFirst(35);
        slist.Display();
    }
    
}
class Node{
    private int data;
    private Node next;
    Node(int d , Node ref)
    {
        data = d;
        next = ref;
    }
    public void set_data(int data)
    {
        this.data = data;
    }
    public void set_ref(Node ref)
    {
        next = ref;
    }
    public int get_data()
    {
        return data;
    }
    public Node get_ref()
    {
        return next;
    }
}
class Slinkedlist{
    private Node head , tail;
    private int size;
    
    public Slinkedlist()
    {
        head = tail = null;
        size = 0;
    }
    
    public void addFirst(int value)
    {
        Node n = new Node(value,null);
        n.set_ref(head);
        head = n;
        if(tail == null)
        {
            tail = n;
        }
        size++;
    }
    public void addLast(int value)
    {
        Node n = new Node(value ,null);
        if(tail == null)
        {
            head = tail = n;
        }
        else
        {
        tail.set_ref(n);
        tail = n;   
        }
        size++;
    }
    public void Display()
    {
        Node n1 = head;//Provide address by head
        while(n1 != null)
        {
        System.out.println(""+n1.get_data());
        n1 = n1.get_ref();//provide address by get_ref() method
            
        }
        //get_ref() method act as stack and store refernces ,storage of reference depend on your space.
    }
    }