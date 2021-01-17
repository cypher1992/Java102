package fourpillar;

abstract public class AbstractionEncapsulationSecurity {
	
	/*
	 * Abstraction - showing the necessary information towards an entity
	 * Key word abstraction applies Class and Methods
	 * Abstraction describes superclass
	 * */
	
	/*
	 * Encapsulation - wrapping both methods and attributes of an entity
	 * Protect the class via accessors and prevent access from outside the class and package
	 * 	Private - attributes only accessible via it on class
	 * 	Protected - attributes only accessible via inheritance of superclass and within the same package
	 *  Default - only accessible via within the same package
	 *  Public - all attributes and methods are accessible outside package and class scope
	 * */

	private String ticker;
	private String exchange;
	private String secType;
	
	// can create a constructor for abstract class but not implement it
	public AbstractionEncapsulationSecurity(String ticker, String exchange, String secType){
		this.ticker = ticker;
		this.exchange = exchange;
		this.secType = secType; 
	}
	
	public AbstractionEncapsulationSecurity(String ticker, String exchange){
		this.ticker = ticker;
		this.exchange = exchange;
	}
	
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;}

	public void setSecType(String secType) {
		this.secType = secType;
	}
	
	public String getSecType() {
		return this.secType;
	}
	
	abstract public String info();
	
	public String tickSecType() {
		return this.getTicker()+this.getSecType()+"OVERRIDING";
		
	}
	
}
