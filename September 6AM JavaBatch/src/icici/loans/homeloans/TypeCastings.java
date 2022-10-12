package icici.loans.homeloans;

public class TypeCastings 
{

	public static void main(String[] args) 
	{
		// byte-1, short-2, int-4, long-8, float-4, double-8
		
		// 1-liter  ---> 500 ml  ---> There is no risk  ---> Widening
		// 1-Liter  ---> 1.5 ltr ---> There is a risk(water overflow) ---> Narrowing
		
		//Type casting from one primitive type to another primitive type
		
		int x1 = 10;
		System.out.println(x1);
		
		double x2 = x1;
		System.out.println(x2);
		
		double y1 = 12.34;
		System.out.println(y1);
		
		int y2 = (int) y1;
		System.out.println(y2);
		
		//Type casting from primitive type to corresponding Wapperclass type
		
		int i1 = 100;
		System.out.println(i1);
		
		//Integer i2 = i1;
		Integer i2 = Integer.valueOf(i1);
		System.out.println(i2);
		
		Integer k1 = 10;
		System.out.println(k1);
		
		//int k2 = k1;
		int k2 = (int)k1;
		System.out.println(k2);
		
		//Type casting from one WapperClass type to another Wapperclass type
		
		String s1 = "200";
		String s2 = "300";
		System.out.println(s1+s2);
		
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		System.out.println(i+j);
		
		float f1 = Float.parseFloat(s1);
		float f2 = Float.parseFloat(s2);
		System.out.println(f1+f2);
	}

}
