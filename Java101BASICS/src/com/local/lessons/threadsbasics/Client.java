package com.local.lessons.threadsbasics;

import com.local.lessons.threadsbasics.DemoDB;
import com.local.lessons.threadsbasics.DemoDBB;

public class Client {

	public static void main(String[] args) {
		DemoDB db = new DemoDB();
		DemoDBB dbb = new DemoDBB();
		db.start();
		dbb.start();
	}

}
