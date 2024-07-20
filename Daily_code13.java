/*write the code to reverse the nodes of the doubly linked list
CODING:*/
import java.util.Scanner;
class linlis
{
 Node head;
 Node tail;
 class Node 
 {
  int data ;
  Node next;
  Node prev;
  
  Node(int val)
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
 public void dis()
 {
  Node temp = tail;
  while(temp!=null)
  {
   System.out.print(temp.data+" ");
   temp = temp.prev;
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
  list.dis();
  ob.close();
 }
}
