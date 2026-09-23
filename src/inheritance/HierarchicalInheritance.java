package inheritance;


class BankAccount
{
	int accountNo;
	String customerName;
	float balance;
	public BankAccount(int accountNo, String customerName, float balance) {
		
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.balance = balance;
	}
}

class SavingsAccount extends BankAccount
{
	float interestRate;

	public SavingsAccount(int accountNo, String customerName, float balance, float interestRate) {
		super(accountNo, customerName, balance);
		this.interestRate = interestRate;
	}
	void calculateInterest()
	{
		
		double interest = balance + (balance * interestRate);
		System.out.println(" "+interest);
	}
	
	void displaySavingsAccount()
	{
		System.out.println(accountNo+" "+customerName+" "+balance+" "+ interestRate);
	}
	
}

class CurrentAccount extends BankAccount
{
	float minimumBalance;

	public CurrentAccount(int accountNo, String customerName, float balance, float minimumBalance) {
		super(accountNo, customerName, balance);
		this.minimumBalance = minimumBalance;
	}
	
	void checkMinibal() {
		if(balance >= minimumBalance)
			System.out.println("Balance Maintained");
		else
			System.out.println("Minimum Balance not Maintained");
	}
	 
	void displayCurrentAccount()
	{
		System.out.println(accountNo+" "+customerName+" "+balance+" "+minimumBalance);
	}
}


public class HierarchicalInheritance {
	
	public static void main(String[] args) {
		
		SavingsAccount s1 = new SavingsAccount(1001, "Prashun", 50000, 0.07f);
		SavingsAccount s2 = new SavingsAccount(1002, "Jha", 100000, 0.05f);
		s1.displaySavingsAccount();
		s1.calculateInterest();
		s2.displaySavingsAccount();
		s2.calculateInterest();
		
		CurrentAccount c1 = new CurrentAccount(1003, "Vishu", 80000, 2000);
		CurrentAccount c2 = new CurrentAccount(1004, "Muthu", 50000000, 2000);
		c1.displayCurrentAccount();
		c1.checkMinibal();
		c2.displayCurrentAccount();
		c2.checkMinibal();
	}

}
