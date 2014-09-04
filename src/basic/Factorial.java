package basic;

public class Factorial
{
	public int Fact(int num)
	{
		if(num<0)
			System.out.println("Please enter the positive number..!!");
		else if(num == 0 || num == 1)
			return 1;
		else 
			return num * Fact(num - 1);
		return 0;
	}
	
	public static void main(String[] args) 
	{
		Factorial f=new Factorial();
		int fact=f.Fact(5);
		System.out.println(fact);
	}

}
