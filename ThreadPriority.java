package com.java.zijieliu_03_09;
//static void sleep(long millis) ʹ��ǰ����ִ�е��߳�ͣ��(��ʱִ��) ָ���ĺ�����


public class ThreadPriority extends Thread {
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(getName()+":"+i);
		}
		
		
		
		
		//�߳̿���һ Thread.sleep(1000);����
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
