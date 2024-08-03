/* Complete the function peek(). Function will receive an address of top value. Do return the value from top of the stack. If top is pointing to NULL  return 0.
CODING : */
import java.util.*;
class Stack
{
 static class TopRef
 {
  int value;
  TopRef (int value)
  {
   value = value;  
  }
 }
 public static int push(int[] stack,TopRef top,int push_val)
 {
  top.value++;
  if(top.value > 1000) return -1;
  stack[top.value] = push_val;
  return 1;
 }
 public static int pop(int[] stack, TopRef top)
 {
  int pop_val;
  if(top.value == -1) return 0;
  pop_val = stack[top.value];
  top.value--;
  return pop_val;
 }
 public static boolean isEmpty(TopRef top)
 {
  return top.value == -1; 
 }
 public static int peek(int[] stack, TopRef top)
 {
  if(top.value == -1) return 0;
  return stack[top.value];
 }
 public static int curr_size(TopRef top)
 {
  return top.value + 1; 
 }
 public static void main(String args[])
 {
  int[] stack = new int[1001];
  TopRef top = new TopRef(-1);
  int ch;
  int input;
  int return_val;
  Scanner ob = new Scanner(System.in);
  while(true)
  {
   ch = ob.nextInt();
   if(ch == -1) break;
   switch(ch)
   {
    case 1:
      input = ob.nextInt();
      return_val = push(stack,top,input);
      if(return_val == -1)
       System.out.println("Stack Full");
      break;
      
    case 2:
      return_val = pop(stack,top);
      if(return_val == 0)
       System.out.println("Empty Stack");
      else
       System.out.println(return_val);
      break;
      
    
    case 3:
      return_val = peek(stack,top);
      if(return_val == 0) 
       System.out.println("Empty Stack");
      else
       System.out.println(return_val);
      break;
      
      
    case 4:  
      if(isEmpty(top))
       System.out.println("Empty Stack");
      else
       System.out.println("Non Empty Stack");
      break;
      
    
    case 5:
      return_val = curr_size(top)-1;
      System.out.println("Number elements stored inside stack : "+return_val);
      break;
   } 
  }
  ob.close();
 }
}
