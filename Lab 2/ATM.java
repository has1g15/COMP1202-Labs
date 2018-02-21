public class ATM
{
	int balance;								//Member variable balance
	Toolbox toolbox;

	public static void main (String[] args)
	{
		ATM myATM = new ATM();						//Creates an ATM object 					
		myATM.go();							//Calls go method 
	}

	public void go()
	{
		toolbox = new Toolbox();
		System.out.println("Welcome to online ATM banking");
		System.out.println("How much do you want in your account?");
		balance = -1;
		while(balance<0)						//If bank balance is negative, user renters amount
		{
			balance = toolbox.readIntegerFromCmd();
		}
		System.out.println("Your balance is: " + balance);
		while(true)							
		{
			System.out.println("What do you want to do?");
			System.out.println("1 : Withdraw");
			System.out.println("2 : Deposit");
			System.out.println("3 : Inquire");
			System.out.println("4 : Quit");
			int option = toolbox.readIntegerFromCmd();
			if (option == 1)
			{
				withdraw();
			}
			else if (option == 2)
			{
				deposit();
			}
			else if (option == 3)
			{
				inquire();
			}
			else if (option == 4)
			{
				quit();
			}
		}
	}

	public void withdraw()
	{
		System.out.println("**********************");
		System.out.println("      WITHDRAWAL      ");
		System.out.println("**********************");
		System.out.println("How much would you like to withdraw?");
		int wAmount = -1;
		while (wAmount<0 || balance<wAmount)				//If amount withdrasw is negative or more than balance, user renters amount
		{
			wAmount = toolbox.readIntegerFromCmd();
		}
		balance = balance - wAmount;
		
	}

	public void deposit()
	{
		System.out.println("***********************");
		System.out.println("        DEPOSIT        ");
		System.out.println("***********************");
		System.out.println("How much would you like to deposit?");
		int dAmount = -1;
		while (dAmount<0)						//If amount deposited is negative, user renters amount 
		{
			dAmount = toolbox.readIntegerFromCmd();
		}
		balance = balance + dAmount;
	}

	public void inquire()
	{
		System.out.println("**********************");
		System.out.println(" YOUR BALANCE IS: " + balance);
		System.out.println("**********************");
	}

	public void quit()
	{
		System.out.println("**********************");
		System.out.println("       GOODBYE!       ");
		System.out.println("**********************");
		System.exit(0);
	}
}