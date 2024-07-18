Write a program to sort an array as per their words for the number.
Sample : {1,2,3,4,5} 
Output : five four one three two 
Constraints :3 <= len <= 20
Values will be in the range 1 to 20 all words must be in lowercase letters
Coding:
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
class sol
{
 public static void main(String args[])
 {
  Scanner ob = new Scanner(System.in);
  int size = ob.nextInt();
  int[] a = new int[size];
  for(int i=0;i<size;i++)
  {
   a[i] = ob.nextInt(); 
  }
  Map<Integer, String> numwor = new HashMap<>();
  numwor.put(1,"one");
  numwor.put(2,"two");
  numwor.put(3,"three");
  numwor.put(4,"four");
  numwor.put(5,"five");
  numwor.put(6,"six");
  numwor.put(7,"seven");
  numwor.put(8,"eight");
  numwor.put(9,"nine");
  numwor.put(10,"ten");
  numwor.put(11,"eleven");
  numwor.put(12,"twelve");
  numwor.put(13,"thirteen");
  numwor.put(14,"fourteen");
  numwor.put(15,"fifteen");
  numwor.put(16,"sixteen");
  numwor.put(17,"seventeen");
  numwor.put(18,"eighteen");
  numwor.put(19,"nineteen");
  numwor.put(20,"twenty");
  Integer[] sorta = Arrays.stream(a).boxed().toArray(Integer[]::new);
  Arrays.sort(sorta, Comparator.comparing(numwor::get, Collections.reverseOrder()));
  for(int i=size-1;i>=0;i--)
  {
   int num = sorta[i];
   System.out.print(numwor.get(num)+" ");
  }
 }
}
