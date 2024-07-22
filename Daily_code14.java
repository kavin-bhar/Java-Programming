/*Delete adjacent duplicate nodes of a circular singly linked list
CODING:*/
import java.util.Scanner;
class linlis
{
 Node last;
 class Node 
 {
  int data;
  Node next;
  Node(int val)
  {
   data = val;
   next = null;
  }
 }
 linlis()
 {
  last = null; 
 }
 public void insert(int val)
 {
  Node newnode = new Node(val);
  if(last == null)
  {
   last = newnode;
   last.next = last;
  }
  else
  {
   newnode.next = last.next;
   last.next = newnode;
   last = newnode;
  }
 }
 public void deldup()
 {
  Node temp = last.next.next;
  Node prev = last.next;
  if(temp.data == prev.data)
  {
   prev.next = temp.next;
   
  }
  while(temp!=last.next)
  {
   prev = temp;
   temp = temp.next;
   if(temp.data == prev.data)
   {
    prev.next = temp.next;   
   }
  }
 }
 public void dis()
 {
  Node temp = last.next;
  do
  {
   System.out.print(temp.data+" ");
   temp = temp.next;
  }while(temp!=last.next);
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
  list.deldup();
  list.dis();
  ob.close();
 }
}
