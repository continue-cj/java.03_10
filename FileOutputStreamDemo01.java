package com.java.zijieliu_03_09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

/*
  IO概念 	O流用来处理设备之间的数据传输,Java对数据的操作是通过流的方式
		Java用于操作流的类都在IO包中，
			
		输入流（读取数据）
		输出流（写数据）	
		
		流按操作类型分为两种
		字节流 : 字节流可以操作任何数据,因为在计算机中任何数据都是以字节的形式存储的
		字符流 : 字符流只能操作纯字符数据，比较方便。

  FileOutputStream 文件输出流用于将数据写入File
  FileOutputStream(String name); 创建文件输出流以指定的名称写入文件
  
 */
public class FileOutputStreamDemo01 {

	public static void main(String[] args) throws IOException {
		//创建文本文件
//		File f1=new File("D:\\\\Java另一个软件\\\\练习\\\\myByteStream\\fos.txt");
//        System.out.println(f1.createNewFile());
//	//创建字节流输出对象
//	FileOutputStream fos=new  FileOutputStream("D:\\Java另一个软件\\练习\\myByteStream\\fos.txt");
//
//	//void write (int b) 将指定的字节写入此文件输出流
//	fos.write(97);
//	fos.write(57);
//	fos.write(55);
//	
//	//最后都要释放资源
//	//void close() 关闭此文件输出流并释放与此流相关的任何系统资源
//	fos.close();
		
		//public Static final InputStream in; 标准输入流  通常该流对应于键盘输入
//		InputStream is=System.in;
//        int by;
//        while((by=is.read())!=-1){
//            System.out.print((char)by);
//        }
		
		
		//标准输入输出流
		
		//public Static final InputStream in; 标准输入流 通常该流对应于键盘输入
		/*
//      InputStream is=System.in;
//      int by;
//      while((by=is.read())!=-1){
//          System.out.print((char)by);
//      }
		
		//如何把字节流转换为字符流？ 用转换流
        //InputStream is=System.in;
        //nputStreamReader isr=new InputStreamReader(is);
        //使用字符流能不能实现一次读取一行数据呢？ 可以  但是一次读取一行数据的方法是字符缓冲输入流的特有方法
        //BufferedReader br=new BufferedReader(isr);
        //优化上面三行代码
		 BufferedReader br=new BufferedReader(new InputStreamReader((System.in)));

	        System.out.println("请输入一行字符串");
	        String line=br.readLine();
	        System.out.println("你输入的字符串是+"+line);

	        System.out.println("请输入一个整数");
	        int i=Integer.parseInt(br.readLine());
	        System.out.println("你输入的整数是+"+i);
	        
	        //自己实现键盘输入太麻烦了，所以java 就提供了一个类供我们使用
	        Scanner sc=new Scanner(System.in);
	        
	        */
		
		//public Static final InputStream out; 标准输出流 通常该流对应于键盘输出或者由主机环境或者用户指定的另外一个输出目标
		 PrintStream ps=System.out;
	        //能够方便地打印各种数据值
	        ps.println("hello");
	        ps.println(100);

	        //System.out的本质是一个字节输出流
	        System.out.println("hello");
	        System.out.println(100);
	}

}
