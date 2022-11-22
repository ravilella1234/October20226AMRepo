package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentManager 
{
  @Test
  public void applyDiscount() 
  {
	  System.out.println("---- applyDiscount ----");
  }
  
  @Test
  @Parameters({"action"})
  public void makePayment(String parameterType,ITestContext context) 
  {
	 // System.out.println("---- makePayment ----");
	  if(parameterType.equals("Electronic media"))
		  System.out.println("---- makePayment through Electronic media ----");
	  else
		  System.out.println("---- makePayment through  pay@hotel ----");
	  
	//Booking ID
	  String bookingID = "RRR12345";
	  System.out.println("Booking ID : " + bookingID);
	  context.setAttribute("bID", bookingID);
  }
}
