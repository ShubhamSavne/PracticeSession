package testing;

public class ExceptionHandling 
{
	
	
	
	public static void main(String[] args)
	{
		
		
		int a=20;
		int b=0;
		int result;
		int d[]= {1,2,3,4,5,6};
		
		System.out.println("hellow");
		
		try
		{
			result = a/b;
			System.out.println(result);
		}
	
		catch(ArithmeticException e)
		{
			System.out.println("value of b should not be zero make it defoult to 1");
			b=1;
			result =a/b;
			System.out.println(result);
		}
			
		
		try
			{
				System.out.println(d[6]);
			}
			
		
//		catch(ArrayIndexOutOfBoundsException f)
//		{
//			System.out.println(d[6]);
//			System.out.println("array bound exception");
//			
//		}
//		
		catch(Exception g)
		{
			System.out.println("can handle any exception");
			g.getStackTrace();
			g.getMessage();
			g.addSuppressed(g);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
