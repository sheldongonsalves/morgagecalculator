import java.math.*;
public class CalculateAmount {

	public CalculateAmount() {
		// TODO Auto-generated constructor stub
	}
   public double CalculatedMorgage(int months,int  principal)
   {
	   
	   double totalpayment=0.0;
	   
	   
	   
	   
	   totalpayment=(principal*0.06)/(1-Math.pow(1+0.06, -months));
	   System.out.println(principal);
	   System.out.println(months);
	   System.out.println("total payment:"+totalpayment);
	   
	   return totalpayment;
   }
}
