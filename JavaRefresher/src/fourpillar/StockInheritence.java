package fourpillar;

public class StockInheritence extends AbstractionSecurity {
	
	/*
	 * Inheritance receives properties and behaviors of superclass via extends key word
	 * Only inheritance via one superclass
	 * Reuse is the key to inheritance
	 */
	
	public StockInheritence(String ticker, String exchange, String secType) {
		super();
		this.setSecType("STOCK");
	}

	@Override
	public String info() {		
		return "TICKER: " + this.getTicker() + "/nEXCHANGE: " + this.getExchange() + "/nSECURITY TYPE: " + this.getSecType() ;
	}
	

}
