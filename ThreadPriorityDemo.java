package com.java.zijieliu_03_09;
/*
 Thread类中设置和获取线程优先级的方法
  	pubilc final void setPriority(int newPriority) 更改此线程的优先级
  	public final int getPriority() 返回此线程的优先级
 
 */

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		ThreadPriority tp1=new ThreadPriority();
//		ThreadPriority tp2=new ThreadPriority();
//		ThreadPriority tp3=new ThreadPriority();
//		
//		tp1.setName("高铁");
//		tp2.setName("飞机");
//		tp3.setName("汽车");
		
		//public final int getPriority() 返回此线程的优先级  获取优先级
//		System.out.println(tp1.getPriority());//默认优先级 5
//		System.out.println(tp2.getPriority());//5
//		System.out.println(tp3.getPriority());//5
		
		//pubilc final void setPriority(int newPriority) 更改此线程的优先级
//		tp1.setPriority(1000);//IllegalArgumentException 非法参数异常  优先级不在MAx_Priority到MIN_Priority范围内
//		System.out.println(Thread.MAX_PRIORITY); //最高优先级10
//		System.out.println(Thread.MIN_PRIORITY);//最低为1
//		System.out.println(Thread.NORM_PRIORITY);//默认为5
		
		//设置正确的优先级
//		tp1.setPriority(5);
//		tp2.setPriority(10);
//		tp3.setPriority(1);
		
//		tp1.start();
//		tp2.start();
//		tp3.start();
		
		
		//线程控制三个方法
		//线程控制二 void  join(); 等待这个线程死亡

//				ThreadPriority tp1=new ThreadPriority();
//				ThreadPriority tp2=new ThreadPriority();
//				ThreadPriority tp3=new ThreadPriority();
//				
//				tp1.setName("高铁");
//				tp2.setName("飞机");
//				tp3.setName("汽车");
//				
//				tp1.start();
//				try {
//					tp1.join(); //先执行tp1  执行结束后再执行后面的
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				tp2.start();
//				tp3.start();
		
		
		//线程控制三 void setDaemon (boolean on) 将此线程标记为守护线程 当运行的线程都是守护线程时 java虚拟机将退出
		ThreadPriority tp1=new ThreadPriority();
		ThreadPriority tp2=new ThreadPriority();
		ThreadPriority tp3=new ThreadPriority();
		
		tp1.setName("高铁");
		tp2.setName("飞机");
//设置主线程为汽车
		Thread.currentThread().setName("汽车");
//设置守护线程
		tp1.setDaemon(true);
		tp2.setDaemon(true);
		
		tp1.start();
		tp2.start();

		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
