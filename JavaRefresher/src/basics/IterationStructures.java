package basics;

public class IterationStructures {
	
	private int start;
	private int end;
	static private int counter = 0; 
	
	public IterationStructures(int start,int end) {
		this.start = start;
		this.end = end;
		
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
	
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		IterationStructures.counter = counter;
	}

	public int forLoop(){
		for(this.getStart();this.getCounter()<this.getEnd();this.counter++) {
			this.setCounter(this.counter);
			System.out.print(this.getCounter());
		}
		return this.getCounter();
	}
	
	public int whileLoop(){
		while(this.getCounter()<this.getEnd()){
			this.setCounter(this.getCounter()+1);
		}
		return this.getCounter();
	}
	
	public int doWhile() {
		do {
			this.setCounter(this.getCounter()+1);
			System.out.println(this.getCounter());
		}while(this.getCounter() < this.getEnd());
		return this.getCounter();
	}
	
	
	
	

}
