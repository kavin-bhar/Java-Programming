/*Check whether the number is a magic number. A magic number is a number where the multiplication of the sum of digits and the sum reverse equals the same number. For example, consider n=1729
sum of digits = (1 + 7 + 2 + 9 => 19)
The reverse of 19 is 91
(19 X 91 = 1729)
Input Format:
Accept an integer as input
Output Format:
Display YES or NO
CODING:
*/
import java.util.Scanner;
class sol
{
 public static void main(String args[])
 {
  Scanner ob = new Scanner(System.in);
  int n = ob.nextInt();
  int sum  = sud(n);
  int revsum = revfun(sum);
  if(sum*revsum == n)
  {
   System.out.print("YES");  
  }
  else
  {
   System.out.print("NO");  
  }
 }
 public static int sud(int n)
 {
  int sd=0;
  while(n!=0)
  {
   sd += n%10;
   n /= 10;
  }
  return sd;
 }
 public static int revfun(int sum)
 {
  int rev = 0;
  while(sum!=0)
  {
   int dig = sum%10;
   rev= rev*10+dig;
   sum /= 10;
  }
  return rev;
 }
}
