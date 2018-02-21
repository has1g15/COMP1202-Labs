public class TestCalculator {
	
	Calculator c;

	public TestCalculator()
	{
		c = new Calculator();
	}
	
	public boolean testParser()
	{
		boolean t1 = false;
		boolean t2 = false;
		boolean t3 = false;
		boolean t = false;
		if ((c.x("12 + 5")) == 17)
		{
			t1 = true;
			System.out.println("[ OK ] Parser adds correctly");
		}
		else
		{
			System.out.println("[FAIL] Basic parsing fails to add");
		}
		if ((c.x("12 x 5")) == 60)
		{
			t2 = true;
			System.out.println("[ OK ] Parser multiplies correctly");
		}
		else
		{
			System.out.println("[FAIL] Basic parsing fails to multiply");
		}
		if ((c.x("12 [ 3")) == null)
		{
			t3 = true;
			System.out.println("[ OK ] Parser returns null for operators which are not supported");
		}
		else 
		{
			System.out.println("[FAIL] Parser does not return null for operators which are not supported.");
		}
		if (t1 && t2 && t3)
		{
			t = true;
		}
		return t;
	}
	
	public boolean testAdd()
	{
		boolean pos = false, neg = false, result = false;
		//Instance variable in calculator updated 
		c.x = (double) 3;
		//Testing positive numbers can be added together 
		if ((c.x(new Double (4)) == 7))
		{
			pos = true;
			System.out.println("[ OK ] Calculator can add positive numbers");
		}
		else
		{
			System.out.println("[FAIL] Calculator adds incorrectly");
		}
		//Instance variable in calculator updated 
		c.x = (double) -3;
		//Testing negative numbers can be added together 
		if ((c.x(new Double(-4))) == -7)
		{
			neg = true;
			System.out.println("[ OK ] Calculator can add a negative number");
		}
		else 
		{
			System.out.println("[FAIL] Calculator adds with negative numbers incorrectly");
		}
		//If both positive and negative numbers can be added correctly, the testAdd method returns true
		if (pos && neg)
		{
			result = true;
		}
		return result;
	}
	
	public boolean testMultiplication()
	{
		boolean pos = false, neg = false, result = false;
		c.x = (double) 3;
		//Testing positive numbers can be multiplied 
		if (c.x(4) == 12)
		{
			pos = true;
			System.out.println("[ OK ] Calculator can multiply positive numbers");
		}
		else
		{
			System.out.println("[FAIL] Calculator multiplies incorrectly");
		}
		c.x = (double) -3;
		//Testing negative numbers can be multiplied 
		if (c.x(-4) == 12)
		{
			neg = true;
			System.out.println("[ OK ] Calculator can multiply by a negative number");
		}
		else
		{
			System.out.println("[FAIL] Calculator multiplies by negative incorrectly");
		}
		//If both positive and negative numbers can be multiplied correctly, the testMultiplication method returns true
		if (pos && neg)
		{
			result = true;
		}
		return result;
	}

}

