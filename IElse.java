import java.util.*;
public class IElse 
{
	static void test(int testval, int target)
	{
		if (testval > target)
			System.out.println(testval + " is greater than " + target);
		else if (testval < target)
			System.out.println(target + " is greater than " + testval);
		else 
			System.out.println(testval + " is equals to " + target);
	}

	public static void main(String[] args)
	{	

		// Scanner newscanner = new Scanner(System.in);
		// String ask = getString(newscanner, "Please enter your first name: ");
		// IElse a = new IElse();
		// a.test(1000,1000);
		Random rand = new Random();
		double i = rand.nextInt(1000);
		int u = rand.nextInt(2000);
		System.out.println(i);
		System.out.println(u);
	}
}