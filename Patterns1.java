import java.util.Scanner;
class Patterns1
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++)
       {
         char ch=(char)('A'+i-1);
           for(int j=1;j<=n-i;j++)
             {
               System.out.print("  ");
                    
              }

           for(int j=i;j<=n;j++)
              {
                 System.out.print(ch+" ");
                  ch++;
               }
          System.out.println();
       }
  }
}






/*import java.util.Scanner;
class Patterns1
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

           for(int j=i;j>=1;j--)
              {
                 System.out.print((char)(j+64)+" ");
               }
          System.out.println();
       }
  }
}
OUTPUT
        A
      B A
    C B A
  D C B A
E D C B A
*/


/*
import java.util.Scanner;
class Patterns1
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
          System.out.println();
       }
  }
}
OUTPUT
        1
      2 1
    3 2 1
  4 3 2 1
5 4 3 2 1
*/









/*
import java.util.Scanner;
class Patterns1
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
          for(int j=i;j>=1;j--)
              {
                 System.out.print(j+" ");
               }
           
          System.out.println();
       }
  }
}
OUTPUT
5 4 3 2 1
  4 3 2 1
    3 2 1
      2 1
        1
*/


/*
import java.util.Scanner;
class Patterns1
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

         for(int j=1;j<=i;j++)
             {
               System.out.print(i%2+" ");
              }
          System.out.println();
       }
  }
}
OUTPUT
1 1 1 1 1
  0 0 0 0
    1 1 1
      0 0
        1
*/





/*
import java.util.Scanner;
class Patterns1
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

         for(int j=1;j<=i;j++)
             {
               System.out.print(j%2+" ");
              }
          System.out.println();
       }
  }
}
OUTPUT
1 0 1 0 1
  1 0 1 0
    1 0 1
      1 0
        1
*/



/*
import java.util.Scanner;
class Patterns1
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
               System.out.print(i%2+" ");
              }
          System.out.println();
       }
  }
}
OUTPUT
        1
      0 0
    1 1 1 
  0 0 0 0 
1 1 1 1 1
*/






/*
import java.util.Scanner;
class Patterns1
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
                 System.out.print("*"+" ");
               }
          System.out.println();
       }
  }
}
output
         *
       * *
     * * * 
   * * * *
 * * * * *
*/

/*
import java.util.Scanner;
class Patterns1
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
                 System.out.print(j%2+" ");
               }
          System.out.println();
       }
  }
}
output
        1
      1 0
    1 0 1
  1 0 1 0
1 0 1 0 1
*/






/*
import java.util.Scanner;
class Patterns1
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
           for(int j=1;j<=i;j++)
              {
                 System.out.print(j+" ");
               }
          System.out.println();
       }
  }
}
output
1 2 3 4 5
  1 2 3 4
    1 2 3
      1 2 
        1
*/




