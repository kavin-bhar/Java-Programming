/*"R-r-riddikulus"  used in the movie Harry Potter to transform anything from one form to other, Similarly you have to transform the array by rotation.A left rotation operation on an array shifts each of the array's elements 1 unit to the left. For example, if 2  left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].
Given an array a of n integers and a number, d, perform d left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.
CODING:*/
import java.util.Scanner;
class sol
{
 public static void main(String args[])
 {
  Scanner ob = new Scanner(System.in);
  int s = ob.nextInt();
  int val = ob.nextInt();
  int[] a = new int[s];
  for(int i=0 ; i<s ;i++)
  {
   a[i] = ob.nextInt();  
  }
  int[] rotarr = new int[s];
  for(int i=0;i<s;i++)
  {
   rotarr[i] = a[(i+val)%s];  
  }
  for(int i=0;i<s;i++)
  {
   System.out.print(rotarr[i]+" ");  
  }
  ob.close();
 }
} 
