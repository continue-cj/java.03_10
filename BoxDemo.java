package com.java.zijieliu_03_09;
/*
 ���������Ѱ���
 */
public class BoxDemo {

	public static void main(String[] args) {
		//����������� ���ǹ�����������
		Box b=new Box();
		
		//���������߶��� �����������Ϊ���췽��������ֵ ��Ϊ���������Ҫ���ô洢ţ�̵Ĳ���
		Producer p=new Producer(b);
		
		//���������߶��� �����������Ϊ���췽��������ֵ ��Ϊ���������Ҫ���ô洢ţ�̵Ĳ���
		Customer c=new Customer(b);
		
		//����2���̶߳��� �ֱ�������߶���������߶�����Ϊ���췽����������
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		
		//�����߳�
		t1.start();
		t2.start();
	}

}
