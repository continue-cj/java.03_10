package com.java.zijieliu_03_09;
/*
 * Math��ѧ��
 * 
 * */
public class MathTest {

	public static void main(String[] args) {
		// Math�������������
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		//����
		System.out.println(Math.abs(-3.4));//����ֵ
		System.out.println(Math.round(3.4));//��������
		System.out.println(Math.sqrt(9));//ƽ����
		System.out.println(Math.pow(2, 3));//2��3�η�
		System.out.println(Math.pow(3, 2));//3��2�η�
		System.out.println(Math.ceil(3.4));//����ȥ��=4
		System.out.println(Math.ceil(3.0));//=3
		System.out.println(Math.floor(4.0));//����ȡ��=4
		System.out.println(Math.floor(4.5));//=4
		System.out.println(Math.max(45, 47));//ȡ���ֵ
		System.out.println(Math.min(38, 47));//ȡ��Сֵ
		
		//���������
		System.out.println(Math.random());//����[0,1)���ڵ���0С��1
		System.out.println(Math.random()*10);//ȡ1-10֮��������
		System.out.println(Math.floor(Math.random()*10));//ȡ1-10����ȡ����
		System.out.println((int)(Math.random()*10));//ǿ��ת��ȡ��
		
		System.out.println((int)(Math.random()*3)+6);//ȡ6-8������� ͨ��1-3���������6
	}

}
