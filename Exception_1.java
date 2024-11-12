import java.util.Scanner;
class Exception_1
{
	public static void main(String s[])
	{
		try
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter the value of x:");
			int x=scn.nextInt();
			System.out.println("Enter the value of y:");
			int y=scn.nextInt();
			int res=x/y;
			System.out.println("Result= "+res);
		}
		catch(Exception e)
		{

			System.out.println("\n!Exception caught:\nDivision by zero is not allowed");
		}
	}
}