package com.java.zijieliu_03_09;

public class MyThread extends Thread{
	
	public MyThread() {}
	
	public MyThread(String name) {
		super(name);
	}
	
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(getName()+":"+i);
		}
	}
	
}
