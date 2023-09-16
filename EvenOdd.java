public class Ajay
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a value");
	int number=sc.nextInt();
	Ajay aj=new Ajay();
	aj.Solution(number);
	}
	public int Solution(int number) {
	if(number%2==0)
	{
		System.out.println("Even");
	}
	else if(number%1==0)
	{
		System.out.println("Odd");
	}
	return number;
	}
}
	