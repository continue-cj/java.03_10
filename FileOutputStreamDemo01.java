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
  IO���� 	O�����������豸֮������ݴ���,Java�����ݵĲ�����ͨ�����ķ�ʽ
		Java���ڲ��������඼��IO���У�
			
		����������ȡ���ݣ�
		�������д���ݣ�	
		
		�����������ͷ�Ϊ����
		�ֽ��� : �ֽ������Բ����κ�����,��Ϊ�ڼ�������κ����ݶ������ֽڵ���ʽ�洢��
		�ַ��� : �ַ���ֻ�ܲ������ַ����ݣ��ȽϷ��㡣

  FileOutputStream �ļ���������ڽ�����д��File
  FileOutputStream(String name); �����ļ��������ָ��������д���ļ�
  
 */
public class FileOutputStreamDemo01 {

	public static void main(String[] args) throws IOException {
		//�����ı��ļ�
//		File f1=new File("D:\\\\Java��һ�����\\\\��ϰ\\\\myByteStream\\fos.txt");
//        System.out.println(f1.createNewFile());
//	//�����ֽ����������
//	FileOutputStream fos=new  FileOutputStream("D:\\Java��һ�����\\��ϰ\\myByteStream\\fos.txt");
//
//	//void write (int b) ��ָ�����ֽ�д����ļ������
//	fos.write(97);
//	fos.write(57);
//	fos.write(55);
//	
//	//���Ҫ�ͷ���Դ
//	//void close() �رմ��ļ���������ͷ��������ص��κ�ϵͳ��Դ
//	fos.close();
		
		//public Static final InputStream in; ��׼������  ͨ��������Ӧ�ڼ�������
//		InputStream is=System.in;
//        int by;
//        while((by=is.read())!=-1){
//            System.out.print((char)by);
//        }
		
		
		//��׼���������
		
		//public Static final InputStream in; ��׼������ ͨ��������Ӧ�ڼ�������
		/*
//      InputStream is=System.in;
//      int by;
//      while((by=is.read())!=-1){
//          System.out.print((char)by);
//      }
		
		//��ΰ��ֽ���ת��Ϊ�ַ����� ��ת����
        //InputStream is=System.in;
        //nputStreamReader isr=new InputStreamReader(is);
        //ʹ���ַ����ܲ���ʵ��һ�ζ�ȡһ�������أ� ����  ����һ�ζ�ȡһ�����ݵķ������ַ����������������з���
        //BufferedReader br=new BufferedReader(isr);
        //�Ż��������д���
		 BufferedReader br=new BufferedReader(new InputStreamReader((System.in)));

	        System.out.println("������һ���ַ���");
	        String line=br.readLine();
	        System.out.println("��������ַ�����+"+line);

	        System.out.println("������һ������");
	        int i=Integer.parseInt(br.readLine());
	        System.out.println("�������������+"+i);
	        
	        //�Լ�ʵ�ּ�������̫�鷳�ˣ�����java ���ṩ��һ���๩����ʹ��
	        Scanner sc=new Scanner(System.in);
	        
	        */
		
		//public Static final InputStream out; ��׼����� ͨ��������Ӧ�ڼ�������������������������û�ָ��������һ�����Ŀ��
		 PrintStream ps=System.out;
	        //�ܹ�����ش�ӡ��������ֵ
	        ps.println("hello");
	        ps.println(100);

	        //System.out�ı�����һ���ֽ������
	        System.out.println("hello");
	        System.out.println(100);
	}

}
