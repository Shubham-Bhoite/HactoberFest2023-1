// Java Program to implement
// Factorial using recursion
class shubhu {

	// recursive method
	int fact(int n)
	{
		int result;

		if (n == 1)
			return 1;
		result = fact(n - 1) * n;
		return result;
	}
}

// Driver Class
class Recursion {

	// Main function
	public static void main(String[] args)
	{
		shubhu f = new shubhu();

		System.out.println("Factorial of 3 is "
						+ f.fact(3));
		System.out.println("Factorial of 4 is "
						+ f.fact(4));
		System.out.println("Factorial of 5 is "
						+ f.fact(5));
	}
}
