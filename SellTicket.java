package com.java.zijieliu_03_09;

public class SellTicket implements Runnable{
//	private int tickets=100;
	private static int tickets=100;//使用静态方法
	private Object obj=new Object();
	private int x=0;
	@Override
	public void run() {
		//synchronized(obj) 上锁
//		while(true) {
//			//tickets=100
//			//t1 t2 t3
//			//假设t1抢到了CPU的执行权
//			//假设t2抢到了CPU的执行权
//			synchronized(obj) { 
//				//t1进来之后 就会把这段代码锁起来
//			if(tickets >0) {
//				try {
//					Thread.sleep(100);
//					//t1休息100毫秒
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				//窗口1正在出售第100张票
//				System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
//				tickets--;
//			}
//			}
//			//t1出来了 这段代码的锁就被释放了
//		}
		
		//相同的票出现了多次(问题)
//		while(true) {
//			//tickets =100;
//			//t1 t2 t3
//			//假设t1线程抢到了CPU的执行权
//			if(tickets >0) {
//				//通过sleep()方法来模拟出票时间
//				try {
//					Thread.sleep(100);
//					//t1线程休息100毫秒
//					//t2线程抢到了CPU的执行权 t2线程开始执行 执行到这里的时候 t2线程休息100毫秒
//					//t3线程抢到了CPU的执行权 t3线程开始执行 执行到这里的时候 t3线程休息100毫秒
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				//假设线程按照顺序醒过来
//				//t1抢到CPU的执行权 在控制台输出 窗口1正在售出第100张票
//				System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
//				//t2抢到CPU的执行权 在控制台输出 窗口2正在售出第100张票
//				//t31抢到CPU的执行权 在控制台输出 窗口3正在售出第100张票
//				tickets--;
//				//如果这三个线程还是按照顺序来，这里就执行了3次--操作 最终票就变成了97
//			}
//		}
		
		//出现了负数的票(第2个问题)
//		while(true) {
//			//tickets =1;
//			//t1 t2 t3
//			//假设t1线程抢到了CPU的执行权
//			if(tickets >0) {
//				//通过sleep()方法来模拟出票时间
//				try {
//					Thread.sleep(100);
//					//t1线程休息100毫秒
//					//t2线程抢到了CPU的执行权 t2线程开始执行 执行到这里的时候 t2线程休息100毫秒
//					//t3线程抢到了CPU的执行权 t3线程开始执行 执行到这里的时候 t3线程休息100毫秒
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				//假设线程按照顺序醒过来
//				//t1抢到CPU的执行权 在控制台输出 窗口1正在售出第1张票
//				//假设t1继续拥有CPU的执行权 就会执行tickets--操作 tickets=0
//				//t2抢到CPU的执行权 在控制台输出 窗口1正在售出第0张票
//				//假设t2继续拥有CPU的执行权 就会执行tickets--操作 tickets=-1
//				//t3抢到CPU的执行权 在控制台输出 窗口1正在售出第-1张票
//				//假设t3继续拥有CPU的执行权 就会执行tickets--操作 tickets=-2
//				System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
//				tickets--;
//			}
//		}
		
		while(true) {
			if(x%2==0) {
			//synchronized(obj) { 
			//synchronized(this) { //同步方法 锁对象是this
			synchronized(SellTicket.class) { //静态同步方法
			if(tickets >0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
				tickets--;
			}
			}
		}else {
//			synchronized(obj) { 
//				if(tickets >0) {
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
//					tickets--;
//				}
//				}
			sellTicket();
		}
			x++;
		}
	}
	
	//同步方法
	//1.创建方法上锁可以正常出售
	//2.如果把synchronized加在方法上呢  他锁定对象是this 在synchronized(this)
//public synchronized void sellTicket() {
////	synchronized(obj) { 
//		if(tickets >0) {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
//			tickets--;
//		}
////		}
//}

	//同步静态方法
	//如果加个静态方法呢  成员变量不是静态的 
	//静态的内容和类相关的 所以不能用synchronized(this) 用synchronized(SellTicket.class)类点class
	public static synchronized void sellTicket() {
			if(tickets >0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
				tickets--;
			}
	}
	
}
