package exception;

public class OneTryMultipleCatch {
	public static void main(String[] args) {
		int i,j=8,k=0;
		int[] array=new int[3];
		try
		{
			array[5]=8;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided by zero.");
			//e.printStackTrace();->to print details of the exception .
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array out of Bound");
		}
		catch(Exception e)
		{
			System.out.println("This works for all types of excpetion .");
		}
		
		System.out.println("The value of j:"+j);
	}

}
