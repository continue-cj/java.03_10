package com.java.zijieliu_03_09;

public class MyRunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable my=new MyRunnable();
		Thread t1=new Thread(my,"¸ßÌú ");
		Thread t2=new Thread(my,"·É»ú");
		
		t1.start();
		t2.start();
	}

}
