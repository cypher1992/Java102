package com.local.lessons.threadsbasics;

public class DemoDB extends Thread {

	public void getDataFromDBA() {
			for(int i=0;i<100;i++) {
				System.out.println("DB A:" + i );
			}
	}
	
	public void getDataFromDBB() {
		for(int i=0;i<100;i++) {
			System.out.println("DB B:" + i*20 );
		}
}
	
	public void run(Boolean isDBA) {
		try {
			if(isDBA) {
				this.getDataFromDBA();
			}else {
				
			}
			
		}catch(Exception e) {
			System.out.println("Exception caught");
		}
	}
	
	
}
