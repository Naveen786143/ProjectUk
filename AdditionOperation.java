import java.util.Scanner;
class AdditionOperation
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner (System.in);
	System.out.println("welcome to addition operation");
	int status;
	do
	{
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		System.out.println("addition of" +a+ "and" +b +"is" +(a+b));
		System.out.println("do you want to continue or stop");
		System.out.println("press 1 to continue");
		System.out.println("press 0 to stop");
		status = sc.nextInt();
	}
	while(status == 1);
	System.out.println("Thank you visit again");
	}
}
