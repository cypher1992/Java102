package basics;

public class ConditionStructures {

	private int number = 0;
	private Boolean isEven;
	private Boolean isOdd;
	private Boolean isNegative;
	private Boolean isPositive;
	private Boolean isNeutral;
	
	public ConditionStructures(int number) {
		this.number = number;
	}
	
	/*
	 * Conditions are
	 * if
	 * if/else
	 * if/else if/else
	 * switch
	 * */
	
	public int getNumber() {
		return this.number;
	}
	
	public Boolean getIsEven() {
		return isEven;
	}
	public void setIsEven(Boolean isEven) {
		this.isEven = isEven;
	}
	public Boolean getIsOdd() {
		return isOdd;
	}
	public void setIsOdd(Boolean isOdd) {
		this.isOdd = isOdd;
	}
	public Boolean getIsNegative() {
		return isNegative;
	}
	public void setIsNegative(Boolean isNegative) {
		this.isNegative = isNegative;
	}
	public Boolean getIsPositive() {
		return isPositive;
	}

	public void setIsPositive(Boolean isPositive) {
		this.isPositive = isPositive;
	}

	public Boolean getIsNeutral() {
		return isNeutral;
	}

	public void setIsNeutral(Boolean isNeutral) {
		this.isNeutral = isNeutral;
	}

	public Boolean ifIsEven(){
		this.setIsEven(false);
		if(this.getNumber()%2 == 0){
			this.setIsEven(true);
		}
		return this.getIsEven();
	}
	
	public Boolean ifIsOdd(){
		this.setIsEven(false);
		if(this.getNumber()%2 != 0){
			this.setIsOdd(true);
		}
		return this.getIsOdd();
	}
	
	public Boolean ifElseEven(){
		this.setIsEven(false);
		this.setIsOdd(false);
		if(this.getNumber()%2 == 0){
			this.setIsEven(true);
		}else {
			this.setIsOdd(false);
		}
		return this.getIsEven();
	}
	
	public Boolean ifElseOdd(){
		this.setIsEven(false);
		this.setIsOdd(false);
		if(this.getNumber()%2 != 0){
			this.setIsOdd(true);
		}else {
			this.setIsEven(false);
		}
		return this.getIsOdd();
	}
	
	public Boolean ifElseifElseNeutual(){
		this.setIsNegative(false);
		this.setIsPositive(false);
		this.setIsNeutral(false);
		if(this.getNumber()>0){
			this.setIsPositive(true);
		}
		else if(this.getNumber()<0) {
			this.setIsNegative(true);
		}
		else {
			this.setIsNeutral(true);
		}
		
		return this.getIsNeutral();
	}
	
	public Boolean switchIsNeutural(){
		switch(this.getNumber()) {
		case 0:
			return true;
		default:
			return false;
		}
	}
	
	
}
