public class priorityque
{
    Node head=null;
    class Node 
    {
    Node next;
    int data,priority;
    Node(int d,int p)
    {
    data=d;
    priority=p;
    }
    }
    void enqueue(int data,int p)
    {
        Node o =new Node(data,p);
o.next=null;
if (head==null)
{
head=o;
}
else
{
if (head.priority>o.priority)

{
o.next=head;
head=o;
}
else
{
    Node last=head;
    while(last.next!=null&&last.next.priority<o.priority)
    {
    last=last.next;
    }
    o.next=last.next;
    last.next=o;
    
}
}
}
void peek()
{
 if (isEmpty())
{
System.out.println("linkedlist is empty");
}
else
{
System.out.println(head.data);
}
}
boolean isEmpty()
{
return (head==null);
}
void dequeue()
{
if (isEmpty())
{
System.out.println("linkedlist is empty");
}
else
{
System.out.println(head.data+"removed ");
head=head.next;
}
}
public static void main(String g[])
{
priorityque obj=new priorityque();
obj.peek();
obj.enqueue(2,5);
obj.enqueue(1,3);
obj.enqueue(3,4);
obj.enqueue(4,2);
obj.enqueue(7,1);
obj.peek();
obj.dequeue();
obj.dequeue();
obj.dequeue();
obj.dequeue();
obj.dequeue();
}
}