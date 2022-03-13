package com.java.zijieliu_03_09;
//static void sleep(long millis) 使当前正在执行的线程停留(暂时执行) 指定的毫秒数


public class ThreadPriority extends Thread {
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(getName()+":"+i);
		}
		
		
		
		
		//线程控制一 Thread.sleep(1000);方法
//		for(int i=0;i<100;i++) {
//			System.out.println(getName()+":"+i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
	
}
