/*Anagram for 2 numbers. Two numbers are said to be an anagram if both numbers are formed with the same digits.
Sample Input 1:
11
13
Sample Output 1:
Not
Sample Input 2:
12325645
21456523
Sample Output 2:
Anagram
CODING:
*/
import java.util.Arrays;
import java.util.Scanner;
class sol
{
  public static void main(String args[])
  {
   Scanner ob = new Scanner(System.in);
   int n1 = ob.nextInt();
   int n2 = ob.nextInt();
   if(areanag(n1,n2))
   {
    System.out.print("Anagram"); 
   }
   else
   {
    System.out.print("Not");
   }
  }
  static boolean areanag(int n1,int n2)
  {
   char[] a1 = String.valueOf(n1).toCharArray();
   char[] a2 = String.valueOf(n2).toCharArray();
   Arrays.sort(a1);
   Arrays.sort(a2);
   return Arrays.equals(a1,a2);
  }
}
