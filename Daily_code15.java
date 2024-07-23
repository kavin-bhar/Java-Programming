/*write a code to stack implementation in the linked list.
CODING:*/
import java.util.Scanner;
class stacklink
{
 Node peek;
 Node head;
 class Node
 {
  int data;
  Node next;
  Node(int val)
  {
   data = val;
   next  = null;
  }
 }
 stacklink()
 {
   peek = null; 
   head = null;
 }     
 public void push(int val)
 {
  Node newnode = new Node(val);
  if(peek == null && head == null)
  {
    head = newnode;
    peek = newnode; 
  }  
  else
  {
   Node temp = head;  
   while(temp.next!=null)
   {
    temp = temp.next; 
   } 
   temp.next = newnode;
   peek = newnode;
  }
 }
 public void pop()
 {
  Node temp = head;
  while(temp.next.next!=null)
  {
   temp = temp.next; 
  }  
  temp.next = null;
  peek = temp;
 }
 public void dis()
 {
   Node temp = head;
   while(temp!=null)
   {
    System.out.print(temp.data+"-->");
    temp = temp.next; 
   }
   System.out.print("null");
   System.out.println();
   System.out.println(peek.data);
 }
 public static void main(String args[])
 {
   Scanner ob = new Scanner(System.in);
   stacklink list = new stacklink();
   System.out.println("Enter the count of values :");
   int n = ob.nextInt();
   System.out.println("Enter the values to insert:");
   for(int i=0;i<n;i++)
   {
    int val = ob.nextInt();
    list.push(val); 
   } 
   list.dis();
   System.out.println();
   list.pop();
   System.out.println();
   list.dis();
   ob.close();
 }
}
