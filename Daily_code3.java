/*Write a program to check whether the given array of elements are in a Bitonic order or Not.
Note:-
A sequence is bitonic if it monotonically increases and then monotonically
de-creases, or if it can be circularly shifted to monotonically
increase and then monotonically decrease
EXAMPLE:
5
1 3 2 4 5

Not Bitonic

CODING:
*/
import java.util.Scanner;
class sol
{
 public static void main(String args[])
 {
  Scanner ob = new Scanner(System.in);
  int n = ob.nextInt();
  int a[] = new int[n];
  for(int i = 0;i<n;i++)
  {
   a[i] = ob.nextInt();  
  }
  int bio = 0;
  int nbio = 0;
  for(int i=0;i<n;i++)
  {
   for(int j = i+1;j<n;j++)
   {
    if(a[i]<a[j]) 
    {
     bio = bio +1;  
    }
    else
    {
     break;   
    }
   }
  }
  if(bio>1)
  {
   System.out.println("Bitonic");
  }
  else
  {
   System.out.println("Not Bitonic");  
  }
 }
}
