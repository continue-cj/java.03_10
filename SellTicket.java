package com.java.zijieliu_03_09;

public class SellTicket implements Runnable{
//	private int tickets=100;
	private static int tickets=100;//ʹ�þ�̬����
	private Object obj=new Object();
	private int x=0;
	@Override
	public void run() {
		//synchronized(obj) ����
//		while(true) {
//			//tickets=100
//			//t1 t2 t3
//			//����t1������CPU��ִ��Ȩ
//			//����t2������CPU��ִ��Ȩ
//			synchronized(obj) { 
//				//t1����֮�� �ͻ����δ���������
//			if(tickets >0) {
//				try {
//					Thread.sleep(100);
//					//t1��Ϣ100����
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				//����1���ڳ��۵�100��Ʊ
//				System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+tickets+"��Ʊ");
//				tickets--;
//			}
//			}
//			//t1������ ��δ�������ͱ��ͷ���
//		}
		
		//��ͬ��Ʊ�����˶��(����)
//		while(true) {
//			//tickets =100;
//			//t1 t2 t3
//			//����t1�߳�������CPU��ִ��Ȩ
//			if(tickets >0) {
//				//ͨ��sleep()������ģ���Ʊʱ��
//				try {
//					Thread.sleep(100);
//					//t1�߳���Ϣ100����
//					//t2�߳�������CPU��ִ��Ȩ t2�߳̿�ʼִ�� ִ�е������ʱ�� t2�߳���Ϣ100����
//					//t3�߳�������CPU��ִ��Ȩ t3�߳̿�ʼִ�� ִ�е������ʱ�� t3�߳���Ϣ100����
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				//�����̰߳���˳���ѹ���
//				//t1����CPU��ִ��Ȩ �ڿ���̨��� ����1�����۳���100��Ʊ
//				System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+tickets+"��Ʊ");
//				//t2����CPU��ִ��Ȩ �ڿ���̨��� ����2�����۳���100��Ʊ
//				//t31����CPU��ִ��Ȩ �ڿ���̨��� ����3�����۳���100��Ʊ
//				tickets--;
//				//����������̻߳��ǰ���˳�����������ִ����3��--���� ����Ʊ�ͱ����97
//			}
//		}
		
		//�����˸�����Ʊ(��2������)
//		while(true) {
//			//tickets =1;
//			//t1 t2 t3
//			//����t1�߳�������CPU��ִ��Ȩ
//			if(tickets >0) {
//				//ͨ��sleep()������ģ���Ʊʱ��
//				try {
//					Thread.sleep(100);
//					//t1�߳���Ϣ100����
//					//t2�߳�������CPU��ִ��Ȩ t2�߳̿�ʼִ�� ִ�е������ʱ�� t2�߳���Ϣ100����
//					//t3�߳�������CPU��ִ��Ȩ t3�߳̿�ʼִ�� ִ�е������ʱ�� t3�߳���Ϣ100����
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				//�����̰߳���˳���ѹ���
//				//t1����CPU��ִ��Ȩ �ڿ���̨��� ����1�����۳���1��Ʊ
//				//����t1����ӵ��CPU��ִ��Ȩ �ͻ�ִ��tickets--���� tickets=0
//				//t2����CPU��ִ��Ȩ �ڿ���̨��� ����1�����۳���0��Ʊ
//				//����t2����ӵ��CPU��ִ��Ȩ �ͻ�ִ��tickets--���� tickets=-1
//				//t3����CPU��ִ��Ȩ �ڿ���̨��� ����1�����۳���-1��Ʊ
//				//����t3����ӵ��CPU��ִ��Ȩ �ͻ�ִ��tickets--���� tickets=-2
//				System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+tickets+"��Ʊ");
//				tickets--;
//			}
//		}
		
		while(true) {
			if(x%2==0) {
			//synchronized(obj) { 
			//synchronized(this) { //ͬ������ ��������this
			synchronized(SellTicket.class) { //��̬ͬ������
			if(tickets >0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+tickets+"��Ʊ");
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
//					System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+tickets+"��Ʊ");
//					tickets--;
//				}
//				}
			sellTicket();
		}
			x++;
		}
	}
	
	//ͬ������
	//1.������������������������
	//2.�����synchronized���ڷ�������  ������������this ��synchronized(this)
//public synchronized void sellTicket() {
////	synchronized(obj) { 
//		if(tickets >0) {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+tickets+"��Ʊ");
//			tickets--;
//		}
////		}
//}

	//ͬ����̬����
	//����Ӹ���̬������  ��Ա�������Ǿ�̬�� 
	//��̬�����ݺ�����ص� ���Բ�����synchronized(this) ��synchronized(SellTicket.class)���class
	public static synchronized void sellTicket() {
			if(tickets >0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+tickets+"��Ʊ");
				tickets--;
			}
	}
	
}
