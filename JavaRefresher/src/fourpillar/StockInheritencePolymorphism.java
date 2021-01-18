package fourpillar;

public class StockInheritencePolymorphism extends AbstractionEncapsulationSecurity{
	
	/*
	 * Inheritance receives properties and behaviors of superclass via extends key word
	 * Only inheritance via one superclass
	 * Reuse is the key to inheritance
	 */
	
	/*
	 * Polymorphism takes on many forms of same type or behaviors
	 * E.g. 
	 * overriding - different class, same methodname, same parameters 
	 * overloading - same class, same methodname, different parameters 
	 */
	
	public StockInheritencePolymorphism(String ticker, String exchange) {
		super(ticker,exchange);
		this.setSecType("STOCK");
	}
	
	public StockInheritencePolymorphism(String ticker, String exchange, String secType) {
		super(ticker, exchange, secType);
		this.setSecType("STOCK");
	}

	@Override
	public String info() {		
		return "TICKER: " + this.getTicker() + "/nEXCHANGE: " + this.getExchange() + "/nSECURITY TYPE: " + this.getSecType() ;
	}
	
	/*
	 *public String tickSecType() {
		return "STOCKOVERRIDING" ;
		}
	 */
	
	//OVERRIDING
	public String tickSecType(String domain) {
		return "STOCKOVERLOADING" + domain;
	}

}
