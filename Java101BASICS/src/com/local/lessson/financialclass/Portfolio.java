package com.local.lessson.financialclass;

import java.util.Map;
import java.util.TreeMap;
import com.local.lessson.financialclass.Equity;
import com.local.lessson.financialclass.financialexception.PortfolioException;

public class Portfolio {

	private Map<String,Equity> equityPortfolio = new TreeMap<String,Equity>();
	private Double capital;
	
	public Portfolio() {
		this.equityPortfolio = equityPortfolio;
	}
	
	public Portfolio(Double capital) {
		this.equityPortfolio = equityPortfolio;
		this.capital = capital;
	}
	
	
	public Map getPortfolio(){
		return this.equityPortfolio;
	}
	
	public Map setPortfolio(Map newPortfolio){
		return this.equityPortfolio = newPortfolio;
	}
	
	public Double getCapital() {
		return this.capital;
	}
	
	public void setCapital(Double newCapital) {
		this.capital = newCapital;
	}
	
	public void depositCapital(Double deposit) throws PortfolioException {
		if(deposit >0.00) {
			this.setCapital(this.getCapital()+ deposit);
		}else{
			throw new PortfolioException("Negative deposit");
		}
	}
	
	public void withdrawCapital(Double withdraw) throws PortfolioException {
		if(withdraw >0.00) {
			this.setCapital(this.getCapital()-withdraw);
		}else {
			throw new PortfolioException("Withdraw is below 0.00");
		}
	}
	
	public void appendEquity(Equity equity) throws PortfolioException{
		if(equity != null){
			this.getPortfolio().put(equity.getTicker(), equity);
		}else {
			throw new PortfolioException("Equity cannot be Null");
		}
	}
	
	public void appendEquityCapital(Equity equity) throws PortfolioException{
		if(equity != null){
			if(this.getCapital() > equity.getCost()){
				this.setCapital(this.capital-equity.getCost());
				this.getPortfolio().put(equity.getTicker(), equity);
			}
			else {
				throw new PortfolioException("Insufficient Capital");
			}
		}else {
			throw new PortfolioException("Equity cannot be Null");
		}
	}
	
	public void removeEquity(String key) throws PortfolioException{
		if(this.equityPortfolio.containsKey(key) && key != null){
			this.equityPortfolio.remove(key);
		}else {
			throw new PortfolioException("Ticker did not exist in portfolio");
		}
	}
	
	public Equity findEquity(String ticker) throws PortfolioException{
		Equity value = null;
		if(this.getPortfolio().containsKey(ticker)) {
			value = (Equity) this.getPortfolio().get(ticker);
		}else {
			throw new PortfolioException("ticker does not exist");
		}
		
		return value;
	}
	
	public void updateEquity(String ticker,Equity equity) throws PortfolioException{
		if(ticker != null && equity != null) {
			this.getPortfolio().replace(ticker, equity);
			}
		else {
			throw new PortfolioException("Can not take a null");
			}
		
	}
	
}
