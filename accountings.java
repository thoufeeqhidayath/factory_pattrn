import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class accountings {
	
	
	public static void main(String[] args) throws IOException
	{
		accountings accountings=new accountings();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the tax options 1.gst 2.sgst 3.vat");
		String taxMode=br.readLine().toString();
		accountings.doSum(taxMode);
		
		
	}
	
	public void doSum(String taxMode)
	{
		factoryPattern factoryPattern=new factoryPattern();
		try
		{
		Tax tax=factoryPattern.theTax(taxMode);
		System.out.println(""+tax.calculateTax(100.0));
		}catch(Exception e)
		{
			System.out.println("The enterd tax mode didnt exist");
		}
	}
	
}
