/*Write a code to implement balance paranthesis using stack .
CODING:*/

import java.util.Scanner;
import java.util.Stack;
public class balpara 
{
 public static void balancing(String n)
 {
  Stack<Character> stack = new Stack<>();
  StringBuilder bal = new StringBuilder();
  for(int i = 0;i<n.length();i++)
  {
   char ch = n.charAt(i);
   if(ch == '(' || ch == '{' || ch == '[')
   {
    stack.push(ch);
   } 
   if(ch == ')' || ch == '}' || ch == ']')
   {
    if(ch == ')')
    {
     while(!stack.isEmpty() && stack.peek()!='(')
     {
      bal.append(stack.pop());  
     }   
    }
    if(ch == '}')
    {
     while(!stack.isEmpty() && stack.peek()!='}')
     {
      bal.append(stack.pop());  
     }   
    }
    if(ch == ']')
    {
     while(!stack.isEmpty() && stack.peek()!=']')
     {
      bal.append(stack.pop());  
     }   
    }
   } 
  }
  if(stack.isEmpty())
  {
   System.out.println("Balanced Paranthesis"); 
  }
  else
  {
   System.out.println("Not a Balanced Paranthesis"); 
  }
 }
 public static void main(String args[])
 {
  Scanner ob = new Scanner(System.in);
  String n = ob.nextLine();
  balancing(n);
  ob.close(); 
 }   
}
