/*Write a program to accept the string from the user and display the string in the password format without making any change in the input arrayimport java.util.Scanner;
*/
import java.util.Scanner;
class sol
{
 public static void main(String args[])
 {
  Scanner ob = new Scanner(System.in);
  String str = ob.nextLine();
  int len = str.length();
  for(int i = 0;i<len;i++)
  {
   System.out.print("*");  
  }
 }
}
