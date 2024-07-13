Write a program to check whether the given array of elements are in a Monotonic order or Not.

EXAMPLE:
7
3 4 5 6 7 8 9

CODING:
import java.util.Scanner;
class sol
{
 public static void main(String args[])
 {
  Scanner ob = new Scanner(System.in);
  int n = ob.nextInt();
  int a[] = new int[n];
  int i,j;
  for(i=0;i<n;i++)
  {
   a[i] = ob.nextInt();  
  }
  int c1=0,d=0;
   for(i=0;i<n;i++)
   {
    for(j=i+1;j<n;j++)
    {
     if(a[i]<a[j]) 
     { 
      c1 = c1+1;  
     }
     else
     {
      d=d+1;
      break;
     }
    }
   }
  if(d>0)
  {
   System.out.println("Not Monotonic");  
  }
  else
  {
   System.out.println("Monotonic");   
  }
 }
}
