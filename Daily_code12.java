/*Code to create the sortin in the doubly linked list.
CODING:*/
import java.util.Scanner;
class linlis
{
 Node head;
 Node tail;
 
 class Node
 {
  int data;
  Node next;
  Node prev;
  
  Node (int val)
  {
   data = val;
   next = null;
   prev = null;
  }
 }
 linlis()
 {
  head = null;
  tail = null;
 }
 public void insert(int val)
 {
  Node newnode = new Node(val);
  if(tail == null)
  {
   head = newnode;
   tail = newnode;
  }
  else
  {
   newnode.prev = tail;
   tail.next = newnode;
  }
  tail = newnode;
 }
 public void sort()
 {
  Node current , index;
  for(current = head ; current.next!=null ; current = current.next)
  {
   for(index = current.next ; index!=null ; index = index.next)
   {
    if(current.data > index.data)
    {
     int temp = current.data;
     current.data = index.data;
     index.data = temp;
    }
   }
  }
 }
 public void dis()
 {
  Node temp = head;
  while(temp!=null)
  {
   System.out.print(temp.data+" ");
   temp = temp.next;
  }
 }
 public static void main(String args[])
 {
  Scanner ob = new Scanner(System.in);
  linlis list = new linlis();
  while(true)
  {
   int val = ob.nextInt();
   if(val == -1)
   {
    break; 
   }
   list.insert(val);
  }
  list.sort();
  list.dis();
  ob.close();
 }
}
