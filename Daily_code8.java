/*Write a program to print the values from 1 to n except multiples of 4. 
Use continue statement to skip 4
CODUING:*/
import java.util.Scanner;
class sol
{
  public static void main(String args[])
  {
   Scanner ob = new Scanner(System.in);
   int n = ob.nextInt();
   for(int i=1;i<=n;i++)
   {
    if(i%4==0)
    {
     continue;  
    }
    System.out.print(i+" ");
   }
  }
}
