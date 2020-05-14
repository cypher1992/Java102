package com.local.lessons.threadsbasics;

public class DemoDB extends Thread {

	public void getDataFromDBA() {
			for(int i=0;i<100;i++) {
				System.out.println("DB A:" + i );
			}
	}
	
	public void run() {
		try {
				this.getDataFromDBA();
			
		}catch(Exception e) {
			System.out.println("Exception caught");
		}
	}
	
	public class DemoDBB extends Thread {
		
		public void getDataFromDBB() {
			for(int i=0;i<100;i++) {
				System.out.println("DB B:" + i*20 );
			}
		}
		
		public void run() {
			try {
					this.getDataFromDBB();
				
			}catch(Exception e) {
				System.out.println("Exception caught");
			}
		}	
	}
	
	public static void main(String[] arg){
	} 
	
}
