/*Write the java code to implement the Priority Queue using linked list.
CODING:*/

import java.util.Scanner;
public class priorityqueue{
    Node head;
    
    class Node{
        int data;
        int pri;
        Node next;
        
        Node(int val, int k){
            data = val;
            pri = k;
            next = null;
        }
    }
    priorityqueue(){
        head = null;
    }
    public void enqueue(int val, int pri){
        Node newnode = new Node(val,pri);
         
        if (head==null){
            head = newnode;
        }
        else{
            if (head.pri > pri){
                newnode.next = head;
                head = newnode;
            }
            else{
                Node temp = head;
                while(temp.next != null && temp.next.pri < pri){
                    temp =  temp.next;       
                }
                newnode.next = temp.next;
                temp.next = newnode;
            }
        }
    }
    public void dequeue(){
        head = head.next;
    }
    public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null \n");
    }
    public static void main(String args[]){
        Scanner ob = new Scanner (System.in);
        priorityqueue q1 = new priorityqueue();
        System.out.println("Enter the Size of the queue: ");
        int size = ob.nextInt();
        System.out.println("Enter the data and its priority:");
        for(int i=0;i<size;i++)
        {
         int val = ob.nextInt();
         int p = ob.nextInt();
         q1.enqueue(val, p);
        }
        System.out.println("ENQUEUE :");
        q1.display();
        q1.dequeue();
        System.out.println("DEQUEUE :");
        q1.display();
        ob.close();
    }
}
