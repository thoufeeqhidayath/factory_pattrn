
public class Gst implements Tax {

	@Override
	public Double calculateTax(Double amount) {
		
		return (amount*100)/18;
	
	}

}
