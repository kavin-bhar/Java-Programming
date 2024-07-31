/*Write a java code to implement the Queue Data Structures using linked list.
CODING:*/
import java.util.Scanner;
class queuelist 
{
 Node head;
 class Node
 {
  int data;
  Node next;
  Node (int val)
  {
   data = val;
   next = null; 
  }  
 }
 queuelist()
 {
   head = null; 
 }
 public void enqueue(int val)
 {
   Node newnode = new Node(val);
   if(head == null)
   {
    head = newnode; 
   } 
   else
   {
    Node temp = head;
    while(temp.next != null)
    {
     temp = temp.next;   
    } 
    temp.next = newnode;
   }
 }
 public void dequeue()
 {
  int deque_val = head.data;
  head = head.next; 
  System.out.println(deque_val);
 }
 public void dis()
 {
  Node temp = head;
  while(temp.next!=null)
  {
   System.out.print(temp.data+"-->");
   temp = temp.next; 
  } 
  System.out.print(temp.data);
 }
 public static void main(String args[])
 {
  Scanner ob = new Scanner(System.in);
  queuelist list = new queuelist();
  System.out.println("Enter the no of the elements : ");
  int n = ob.nextInt();
  System.out.println("Enter the "+n+" Elements : ");
  for(int i=0;i<n;i++) 
  {
   int val = ob.nextInt();
   list.enqueue(val); 
  }
  System.out.println();
  list.dis();
  System.out.println();
  list.dequeue();
  list.dis();
  ob.close();
 }
}
