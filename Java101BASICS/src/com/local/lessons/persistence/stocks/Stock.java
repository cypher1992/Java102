package com.local.lessons.persistence.stocks;

public class Stock {

	private String ticker;
	private String date;
	private double closedPrice;
	private double openedPrice;
	private double high;
	private double low;
	private double peRatio;
	private double dividendYield;
	
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getClosedPrice() {
		return closedPrice;
	}
	public void setClosedPrice(double closedPrice) {
		this.closedPrice = closedPrice;
	}
	public double getOpenedPrice() {
		return openedPrice;
	}
	public void setOpenedPrice(double openedPrice) {
		this.openedPrice = openedPrice;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	public double getLow() {
		return low;
	}
	public void setLow(double low) {
		this.low = low;
	}
	public double getPeRatio() {
		return peRatio;
	}
	public void setPeRatio(double peRatio) {
		this.peRatio = peRatio;
	}
	public double getDividendYield() {
		return dividendYield;
	}
	public void setDividendYield(double dividendYield) {
		this.dividendYield = dividendYield;
	}
	
	
	
	
	
	
	
}