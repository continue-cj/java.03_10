package com.java.zijieliu_03_09;
/*
 消费者类
 * */
public class Customer implements Runnable{
	private Box b;
	
	public Customer(Box b) {
	this.b=b;
	}
	@Override
	public void run() {
		while(true) {
			b.get();
		}
		
	}

}
