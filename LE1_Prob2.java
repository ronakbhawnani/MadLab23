public class Main
{
    public static void main(String[] args)
    {
	   int i,j,k;
	   for(i=1; i<=5; i++)
	   {
	       for (j=1; j<i; j++)
	       {
	          System.out.print(" ");
	       }
	       for(k=1; k<=5-i; k++)
	        {
	           System.out.print("* ");
	        }
	       System.out.println();
	   }
    }

}

