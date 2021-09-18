//Exception handling
//a) Impliment arithmetic exception
//c)Impliment nested try statements
//d)Impliment finally
//e)Write a pgm to implement throw keyword

public class TryCatch
{
	public static void main(String[] args)
	{
		int a=10; 
		int b=5,c=5; 
		int x,y;
		try{
			x=a/(b-c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero");
		}
		y=a/(b+c);
		System.out.println("Y="+y);
	}
}
