
public class VatTax implements Tax{

	@Override
	public Double calculateTax(Double amount) {

	 return (amount*100)/4.5;
		
	}

}
