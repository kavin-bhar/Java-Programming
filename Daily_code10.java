/*Following is the mobile keyboard alignment - The keystrokes are given as a string - find the TEXT string that would appear on the screen Note : Input string will be made of DIGITS[0,2-9] and Spaces    Maximum of 100 characters long                           

                                                                                                                                    2               3                                     

                                                                                                                               ABC             DEF                         

                                                                                                                       4                5                6                        

                                                                                                                 GHI               JKL               MNO                            

                                                                                                                      7              8                  9                     

                                                                                                          PQRS               TUV               WXYZ                                         

                                                                                                                                    0                                     

                                                                                                                              SPACE
Example: 7777 33 555 888 2 0 55 88 6 2 777

 Output: SELVA KUMAR*/
import java.util.*;
class sol
{
 public static void main(String args[])
 {
  Scanner ob = new Scanner(System.in);
  String str[] = ob.nextLine().split(" ");
  String num[] = { " ","null","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
  for(int i=0;i<str.length;i++)
  {
   int val = Integer.parseInt(String.valueOf(str[i].charAt(0)));
   int count =str[i].length();
   System.out.print(num[val].charAt(count-1));
  }
  ob.close();
 }
}
