/* Given a range, print each decimal value in binary form as space separated. Do generate the binary form of the decimal values .
CODING*/
import java.util.Scanner;
class sol
{
 public static void main(String args[])
 {
  Scanner ob = new Scanner(System.in);
  int val = ob.nextInt();
  for(int i=1;i<=val;i++)
  {
   System.out.print(Integer.toBinaryString(i)+" ");  
  }
  ob.close();
 }
}
