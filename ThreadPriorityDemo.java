package com.java.zijieliu_03_09;
/*
 Thread�������úͻ�ȡ�߳����ȼ��ķ���
  	pubilc final void setPriority(int newPriority) ���Ĵ��̵߳����ȼ�
  	public final int getPriority() ���ش��̵߳����ȼ�
 
 */

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		ThreadPriority tp1=new ThreadPriority();
//		ThreadPriority tp2=new ThreadPriority();
//		ThreadPriority tp3=new ThreadPriority();
//		
//		tp1.setName("����");
//		tp2.setName("�ɻ�");
//		tp3.setName("����");
		
		//public final int getPriority() ���ش��̵߳����ȼ�  ��ȡ���ȼ�
//		System.out.println(tp1.getPriority());//Ĭ�����ȼ� 5
//		System.out.println(tp2.getPriority());//5
//		System.out.println(tp3.getPriority());//5
		
		//pubilc final void setPriority(int newPriority) ���Ĵ��̵߳����ȼ�
//		tp1.setPriority(1000);//IllegalArgumentException �Ƿ������쳣  ���ȼ�����MAx_Priority��MIN_Priority��Χ��
//		System.out.println(Thread.MAX_PRIORITY); //������ȼ�10
//		System.out.println(Thread.MIN_PRIORITY);//���Ϊ1
//		System.out.println(Thread.NORM_PRIORITY);//Ĭ��Ϊ5
		
		//������ȷ�����ȼ�
//		tp1.setPriority(5);
//		tp2.setPriority(10);
//		tp3.setPriority(1);
		
//		tp1.start();
//		tp2.start();
//		tp3.start();
		
		
		//�߳̿�����������
		//�߳̿��ƶ� void  join(); �ȴ�����߳�����

//				ThreadPriority tp1=new ThreadPriority();
//				ThreadPriority tp2=new ThreadPriority();
//				ThreadPriority tp3=new ThreadPriority();
//				
//				tp1.setName("����");
//				tp2.setName("�ɻ�");
//				tp3.setName("����");
//				
//				tp1.start();
//				try {
//					tp1.join(); //��ִ��tp1  ִ�н�������ִ�к����
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				tp2.start();
//				tp3.start();
		
		
		//�߳̿����� void setDaemon (boolean on) �����̱߳��Ϊ�ػ��߳� �����е��̶߳����ػ��߳�ʱ java��������˳�
		ThreadPriority tp1=new ThreadPriority();
		ThreadPriority tp2=new ThreadPriority();
		ThreadPriority tp3=new ThreadPriority();
		
		tp1.setName("����");
		tp2.setName("�ɻ�");
//�������߳�Ϊ����
		Thread.currentThread().setName("����");
//�����ػ��߳�
		tp1.setDaemon(true);
		tp2.setDaemon(true);
		
		tp1.start();
		tp2.start();

		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
