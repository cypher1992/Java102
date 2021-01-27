package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*
 * 
 * An Arraylist is a class a resizable array, which is present in the java. Util package. 
 * While built-in arrays have a fixed size, arraylists can change their size dynamically. Elements can
 * be added and removed from an arraylist whenever there is a need, helping the user with memeory management
 * 
 * */
public class ClassArrayList {
	
	private ArrayList<Integer> arrayList;
	
	public ClassArrayList() {
	}
	
	public ClassArrayList(ArrayList<Integer> arraylist) {
		this.arrayList = arraylist;
	}
	
	public ArrayList<Integer> getArrayList() {
		return arrayList;
	}

	public void setArrayList(ArrayList<Integer> arrayList) {
		this.arrayList = arrayList;
	}

	public boolean add(Integer element){
		return this.getArrayList().add(element);
	}
	
	public Integer remove(int position) {
		return this.getArrayList().remove(position);
	}
	
	public Integer get(Integer position){
		return this.getArrayList().get((int) position);
	}
	
	public Integer size() {
		return this.getArrayList().size();
	}
	
	public Boolean isEmpty() {
		return this.getArrayList().isEmpty();
	}
	
	public void clear(){
		this.getArrayList().clear();
	}
	
	public boolean removeAll(Collection<?> c){
		return this.getArrayList().removeAll(c);
	}
	
	public boolean removeIf(Predicate<? super Integer> filter){
		return this.getArrayList().removeIf(filter);
	}
	
	public Stream<Integer> stream(){
		return this.getArrayList().stream();
	}
}
