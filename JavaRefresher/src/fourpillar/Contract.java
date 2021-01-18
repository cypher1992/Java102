package fourpillar;

public interface Contract<T> {
	
	public String buy(T t);
	public String sold(T t);
}
