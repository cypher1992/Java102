package fourpillar;

public class Portfolio implements Contract<StockInheritencePolymorphism> {

	@Override
	public String buy(StockInheritencePolymorphism stock) {
		return "Bought " + stock.getTicker();
	}

	@Override
	public String sold(StockInheritencePolymorphism stock) {
		// TODO Auto-generated method stub
		return "Sold " + stock.getTicker();
	}

}
