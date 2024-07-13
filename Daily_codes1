Given number of elements , array and K value, Find the minimum number of Swaps required to get elements less then K and  greater elements on the right  side.
EXAMPLE:
8
4 3 5 2 7 6 8 7
3

CODING :
import java.util.Scanner;
class sol
{
 public static void main(String[] args)
 {
  Scanner ob = new Scanner(System.in);
  int n = ob.nextInt();
  int a[] = new int[n];
  int i,j,min=0,ind=0;
  for(i=1;i<=n;i++)
  {
   a[i] = ob.nextInt();  
  }
  int k = ob.nextInt();
  for(i=1;i<=n;i++)
  {
   if(a[i]==k)
   {
    ind = i; 
   }
  }
  for(i=1;i<=n;i++)
  {
   for(j=i+1;j<=n;j++)
   {
    if(a[i]<a[j])
    {
     min = i;  
    }
    else
    {
     min = j;  
    }
   }
  }
  int s = min-ind-1;
  System.out.print(s);
 }
}
