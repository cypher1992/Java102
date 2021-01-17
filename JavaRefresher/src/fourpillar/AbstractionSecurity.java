package fourpillar;

abstract public class AbstractionSecurity {
	
	/*
	 * Abstraction - showing the necessary information towards an entity
	 * Key word abstraction applies Class and Methods
	 * Abstraction describes superclass
	 * */

	private String ticker;
	private String exchange;
	private String secType;
	
	// can create a constructor for abstract class but not implement it
	public AbstractionSecurity(){
		this.ticker = ticker;
		this.exchange = exchange;
		this.secType = secType; 
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
	
	
}
