package icici.loans.homeloans;


class parent
{
	public Number workhard()
	{
		System.out.println("PARENT : wakeup early, goto college...");
		return 0;
	}
	
	public void care()
	{
		System.out.println("PARENT : atmost care..");
	}
	
	
}

public class Child extends parent
{
	
	public Number workhard()
	{
		System.out.println("CHILD : wakeup anytime, goto Movie...");
		return 0;
	}
	
	public void love()
	{
		System.out.println("CHILD : iam in love....");
	}

	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.workhard();
		obj.care();
		obj.love();
	}

}
