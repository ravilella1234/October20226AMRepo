package icici.loans.carloans;

public interface Rbi 
{
	int x = 100;
	
	public void withdrawl();
	public void deposit();
	
	public static void main(String[] args) 
	{
		//Rbi i = new Rbi();
		
		Rbi i;
		
		i = new ICICI();
		i.withdrawl();
		i.deposit();
		
		i = new HDFC();
		i.withdrawl();
		i.deposit();
	}

}
