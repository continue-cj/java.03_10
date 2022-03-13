package com.java.zijieliu_03_09;
/*
 * Math数学类
 * 
 * */
public class MathTest {

	public static void main(String[] args) {
		// Math里面的两个常量
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		//方法
		System.out.println(Math.abs(-3.4));//绝对值
		System.out.println(Math.round(3.4));//四舍五入
		System.out.println(Math.sqrt(9));//平方根
		System.out.println(Math.pow(2, 3));//2的3次方
		System.out.println(Math.pow(3, 2));//3的2次方
		System.out.println(Math.ceil(3.4));//向上去整=4
		System.out.println(Math.ceil(3.0));//=3
		System.out.println(Math.floor(4.0));//向下取整=4
		System.out.println(Math.floor(4.5));//=4
		System.out.println(Math.max(45, 47));//取最大值
		System.out.println(Math.min(38, 47));//取最小值
		
		//生成随机数
		System.out.println(Math.random());//生成[0,1)大于等于0小于1
		System.out.println(Math.random()*10);//取1-10之间的随机数
		System.out.println(Math.floor(Math.random()*10));//取1-10向下取整数
		System.out.println((int)(Math.random()*10));//强制转换取整
		
		System.out.println((int)(Math.random()*3)+6);//取6-8的随机数 通过1-3的随机数加6
	}

}
