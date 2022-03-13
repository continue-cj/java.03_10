package com.java.zijieliu_03_09;

/*
 线程
 方式一: 继承Thread类
 1.定义一个类MyThread继承Thread类
 2.在MyThread类中重写run()方法
 3.创建MyThread类的对象
 4.启动线程
 
 Thread类中获取和设置线程名称的方法
 	void setName(String name) 将此线程的名称更改为等于参数 name
 	String getName() 返回此线程的名称
  
 */

public class MyThreadDemo {

	public static void main(String[] args) {
		//方式一: 继承Thread类
	/*
		MyThread my1=new MyThread();
		MyThread my2=new MyThread();
	
		//my1.sun不能调用线程
//		my1.run();
//		my2.run();
		
		//void start() 导致线程开始执行  java虚拟机调用此线程的run方法
		my1.start();
		my2.start();
	*/
		
		//Thread类中获取和设置线程名称的方法
	/*
//		MyThread my1=new MyThread();
//		MyThread my2=new MyThread();
//		
//		//void setName(String name) 将此线程的名称更改为等于参数 name
//		my1.setName("高铁");
//		my1.setName("飞机");
		
		//使用带参构造方法赋值  
		
		//Thread(String name)想使用这个类  必须在MyThread类中创建一个无参和带参的构造方法
		MyThread my1=new MyThread("高铁");
		MyThread my2=new MyThread("飞机");
		
		my1.start();
		my2.start();
	*/
		
		//static Thread currentThread () 返回对当前正在执行的线程对象的引用  静态的currentThread()方法
		System.out.println(Thread.currentThread ().getName());//main方法中当前执行线程对象
		
		
	}

}
