/*Accept an integer N and generate the first N terms of the fibonacci series
CODING:
*/
import java.util.Scanner;
class sol
{
 public static void main(String args[])
 {
  Scanner ob = new Scanner(System.in);
  int n = ob.nextInt();
  if(n>0)
  {
  int a=1,b=1;  
  for(int i=1;i<=n;i++)
  {
   System.out.print(a+" ");
   int c = a+b;
   a=b;
   b=c;
  }
  }
 }
}
