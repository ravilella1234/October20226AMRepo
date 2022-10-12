package icici.loans.personalloans;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("oaktech");
		a.add("vmware");
		a.add("arsin");
		a.add("prolifics");
		
		System.out.println(a);
		ListIterator<String> val = a.listIterator();
		while(val.hasNext())
		{
			String var = val.next();
			if(var.equals("vmware"))
				val.set("rythu polam");
			else
				val.remove();
		}
		System.out.println(a);
	}

}
