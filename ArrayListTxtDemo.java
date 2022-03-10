package com.java.Deno_01;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeSet;
import java.io.InputStream;

public class ArrayListTxtDemo {
    public static void main(String[] args)throws Exception{

        //把ArrayList集合的字符串数据写入到文本文件
        /*
        ArrayList<String> array=new ArrayList<String>();
        array.add("hello");
        array.add("worle");
        array.add("helloworld");

        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\Java另一个软件\\练习\\myByteStream\\fos.txt"));
        for(String s: array){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
         */

        //把文本文件中的数据读取到集合中
        /*
        BufferedReader br=new BufferedReader(new FileReader("D:\\\\Java另一个软件\\\\练习\\\\myByteStream\\\\fos.txt"));
        ArrayList<String> array=new ArrayList<String>();
        String len;
        while((len=br.readLine())!=null){
            array.add(len);
        }
        br.close();
        for(String s:array){
            System.out.println(s);
        }

         */


        //public Static final InputStream in; 标准输入流 通常该流对应于键盘输入
//        InputStream is=System.in;
//        int by;
//        while((by=is.read())!=-1){
//            System.out.print((char)by);
//        }


        //如何把字节流转换为字符流？ 用转换流
        //InputStream is=System.in;
        //nputStreamReader isr=new InputStreamReader(is);
        //使用字符流能不能实现一次读取一行数据呢？ 可以  但是一次读取一行数据的方法是字符缓冲输入流的特有方法
        //BufferedReader br=new BufferedReader(isr);
        //优化上面三行代码
//        BufferedReader br=new BufferedReader(new InputStreamReader((System.in)));
//
//        System.out.println("请输入一行字符串");
//        String line=br.readLine();
//        System.out.println("你输入的字符串是+"+line);
//
//        System.out.println("请输入一个整数");
//        int i=Integer.parseInt(br.readLine());
//        System.out.println("你输入的整数是+"+line);

        PrintStream ps=System.out;
        //能够方便地打印各种数据值
        ps.println("hello");
        ps.println(100);

        //System.out的本质是一个字节输出流
        System.out.println("hello");
        System.out.println(100);

    }
}
