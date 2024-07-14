/*Find the frequency of each digit from the given number.
Sample Input : 78554
Sample Output :
0 occurs 0 times
1 occurs 0 times
2 occurs 0 times
3 occurs 0 times
4 occurs 1 times
5 occurs 2 times
6 occurs 0 times
7 occurs 1 times
8 occurs 1 times
9 occurs 0 times
CODING:
*/
import java.util.Scanner;
class sol
{
 public static void main(String args[])
 {
  Scanner ob = new Scanner(System.in);
  String n = ob.nextLine();
  int[] dig = new int[10];
  for(char digit : n.toCharArray())
  {
   dig[digit - '0']++;  
  }
  for(int i = 0;i<=9;i++)
  {
   System.out.println(i + " occurs " + dig[i] + " times ");  
  }
 }
}
 
