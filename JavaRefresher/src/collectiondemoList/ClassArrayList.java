package collectiondemoList;

import java.util.ArrayList;

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
	
	
	
}
