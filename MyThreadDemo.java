package com.java.zijieliu_03_09;

/*
 �߳�
 ��ʽһ: �̳�Thread��
 1.����һ����MyThread�̳�Thread��
 2.��MyThread������дrun()����
 3.����MyThread��Ķ���
 4.�����߳�
 
 Thread���л�ȡ�������߳����Ƶķ���
 	void setName(String name) �����̵߳����Ƹ���Ϊ���ڲ��� name
 	String getName() ���ش��̵߳�����
  
 */

public class MyThreadDemo {

	public static void main(String[] args) {
		//��ʽһ: �̳�Thread��
	/*
		MyThread my1=new MyThread();
		MyThread my2=new MyThread();
	
		//my1.sun���ܵ����߳�
//		my1.run();
//		my2.run();
		
		//void start() �����߳̿�ʼִ��  java��������ô��̵߳�run����
		my1.start();
		my2.start();
	*/
		
		//Thread���л�ȡ�������߳����Ƶķ���
	/*
//		MyThread my1=new MyThread();
//		MyThread my2=new MyThread();
//		
//		//void setName(String name) �����̵߳����Ƹ���Ϊ���ڲ��� name
//		my1.setName("����");
//		my1.setName("�ɻ�");
		
		//ʹ�ô��ι��췽����ֵ  
		
		//Thread(String name)��ʹ�������  ������MyThread���д���һ���޲κʹ��εĹ��췽��
		MyThread my1=new MyThread("����");
		MyThread my2=new MyThread("�ɻ�");
		
		my1.start();
		my2.start();
	*/
		
		//static Thread currentThread () ���ضԵ�ǰ����ִ�е��̶߳��������  ��̬��currentThread()����
		System.out.println(Thread.currentThread ().getName());//main�����е�ǰִ���̶߳���
		
		
	}

}
