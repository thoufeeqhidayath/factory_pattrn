
public class factoryPattern {
	
	public Tax theTax(String taxName)
	{
		
		
		if(taxName.equals("gst"))
		{
			return new Gst();
		}
		else if(taxName.equals("sgst"))
		{
			return new Sgst();
		}
		else if(taxName.equals("vat"))
		{
			return new VatTax();
		}
		
		
		return (Tax) new Exception();
		
		
	}
	

}
