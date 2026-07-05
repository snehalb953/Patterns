/*
import java.util.Scanner;
class PatternString2
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++)
       {
         for(int j=i;j<=n-1;j++)
             {
               System.out.print("  ");
                    
              }
           for(int j=i;j>=1;j--)
              {
                 System.out.print(j+" ");
               }
           for(int j=2;j<=i;j++)
              {
                  System.out.print(j+" ");
               }
           System.out.println();
       }
  }
}
OUTPUT
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
*/


/*
import java.util.Scanner;
class PatternString2
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++)
       {
         for(int j=1;j<=n-i;j++)
             {
               System.out.print("  ");
                    
              }
           for(int j=1;j<=i;j++)
              {
                 System.out.print(j+" ");
               }
           for(int j=i-1;j>=1;j--)
              {
                 System.out.print(j+" ");
              }
          System.out.println();
       }
  }
}
OUTPUT
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/





/*
import java.util.Scanner;
class PatternString2
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++)
       {
         for(int j=1;j<=n-i;j++)
             {
               System.out.print("  ");
                    
              }
               int x=1;
           for(int j=1;j<=(2*i-1);j++)
              {
                 System.out.print(x+" ");
                  if(j<i)
                    x++;
                  else
                    x--;
               }
          System.out.println();
       }
  }
}
OUTPUT
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/




/*
import java.util.Scanner;
class PatternString2
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     for(int i=n;i>=1;i--)
       {
         for(int j=1;j<=n-i;j++)
             {
               System.out.print("  ");
                    
              }
           for(int j=1;j<=(2*i-1);j++)
              {
                 System.out.print("*"+" ");
               }
          System.out.println();
       }
  }
}
OUTPUT
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
*/



/*
import java.util.Scanner;
class PatternString2
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     int sp=0,st=2*n-1;
     for(int i=1;i<=n;i++)
       {
         for(int j=1;j<=sp;j++)
             {
               System.out.print("  ");
                    
              }
           for(int j=1;j<=st;j++)
              {
                 System.out.print("*"+" ");
               }
              sp++;
              st=st-2;
          System.out.println();
       }
  }
}
OUTPUT
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
*/



/*
import java.util.Scanner;
class PatternString2
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     int sp=n-1,st=1;
     for(int i=1;i<=n;i++)
       {
         for(int j=1;j<=sp;j++)
             {
               System.out.print("  ");
                    
              }
           for(int j=1;j<=st;j++)
              {
                 System.out.print("*"+" ");
               }
              sp--;
              st=st+2;
          System.out.println();
       }
  }
}
OUTPUT
     *
    ***
   *****
  *******
 *********
*/


/*
import java.util.Scanner;
class PatternString2
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++)
       {
         for(int j=1;j<=n-i;j++)
             {
               System.out.print("  ");
                    
              }
           for(int j=1;j<=(2*i-1);j++)
              {
                 System.out.print("*"+" ");
               }
          System.out.println();
       }
  }
}
OUTPUT
     *
    ***
   *****
  *******
 *********
*/