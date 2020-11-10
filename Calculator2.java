class Calculator2
{
	public static int add(int a,int b)
	{
		int sum=0;
		sum=a+b;
		System.out.println(" Addition is = " +sum);
		return sum;
	}
	public static int subtract(int a,int b)
	{
		int sub=0;
		sub=a-b;
		System.out.println(" Subtraction is = " +sub);
		return sub;
	}
	public static int multiply(int a,int b)
	{
		int multi=0;
		multi=a*b;
		System.out.println(" Multipliaction is = " +multi);
		return multi;
	}
	public static int division(int a,int b)
	{
		int div=0;
		div=a/b;
		System.out.println(" Division is = " +div);
		return div;
	}
	public static void main(String args[])
	{
		Calculator2.add(60,30);
		Calculator2.subtract(60,30);
		Calculator2.multiply(60,30);
		Calculator2.division(60,30);
	}
}