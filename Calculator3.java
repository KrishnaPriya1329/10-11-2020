class Calculator3
{
	public static int add()
	{
		return 80+40;
	}
	public static int subtract()
	{
		return 80-40;
	}
	public static int multiply()
	{
		return 80*40;
	}
	public static int division()
	{
		return 80/40;
	}
	public static void main(String args[])
	{
		int sum=Calculator3.add();
		System.out.println("The Addition is =" +sum);
		int sub=Calculator3.subtract();
		System.out.println("The Subtraction is =" +sub);
		int multi=Calculator3.multiply();
		System.out.println("The Multiplication is =" +multi);
		int div=Calculator3.division();
		System.out.println("The Division is =" +div);
	}
}