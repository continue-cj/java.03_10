package com.java.Deno_01;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        /*
        //创建文件
        File f1=new File("D:\\\\Java另一个软件\\\\练习\\\\myByteStream\\fos.txt");
        System.out.println(f1.createNewFile());
        //创建字节流输出对象
        //FileOutputStream fos=new FileOutputStream("D:\Java另一个软件\练习\myByteStream\fos.txt");
        FileOutputStream fos=new FileOutputStream("D:\\Java另一个软件\\练习\\myByteStream\\fos.txt",true);
        //写数据
        for(int i=0;i<10;i++){
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }
        //释放资源
        fos.close();
         */

        //字节流写数据加入异常处理
        /*
        //加入 finally来实现释放资源
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\Java另一个软件\\练习\\myByteStream\\fos.txt", true);
            fos.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos !=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
         */


/*
        //使用字节流输入读数据
        //1.创建字节输入流对象  FileFileOutputStream(String name)
        FileInputStream fis=new FileInputStream("D:\\Java另一个软件\\练习\\myByteStream\\fos.txt");

        //2.调用字节输入流对象的读数据方法
        //iny read() 从该输入流读取一个字节的数据
//        int by=fis.read();
//        System.out.println(by);
//        System.out.println((char)by);

//        int by= fis.read();
//        while(by !=-1){
//            System.out.print((char)by);
//            by=fis.read();
//        }


//        fis.read() 读数据
//        by=fis.read() 把读到的数据赋值给by
//        by!=-1 判断读取到的数据是否为-1

        //优化上面的循环代码
        int by;
        while((by=fis.read()) !=-1){
            System.out.print((char)by);
            System.out.print(by);
        }

        //3.释放资源
        fis.close();
 */



        //使用字节流输入读数组数据 (一次读取一个字节数组数据)
        /*
        //1.创建字节输入流对象  FileFileOutputStream(String name)
        FileInputStream fis=new FileInputStream("D:\\Java另一个软件\\练习\\myByteStream\\fos.txt");
        //调用字节流输入对象的读数方法  int read(byte[] b) 从该输入流读取最多 b.lenth个字节的数据到一个字节数组
//        byte[] bys=new byte[5];
//        int len=fis.read(bys);
//        System.out.println(len);
//        System.out.println(new String(bys,0,len));

        //使用循环改进代码
        byte[] bys=new byte[1024]; //1024及其整数倍
        int len;
        while((len=fis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }

        //释放资源
        fis.close();

         */

        //字节缓冲流

        //字节缓冲输出流：BufferedOutputStream(OutputStream out)
//        FileOutputStream fos=new FileOutputStream("D:\\Java另一个软件\\练习\\myByteStream\\fos.txt");
//        BufferedOutputStream bos=new BufferedOutputStream(fos); //合并如下
//        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\Java另一个软件\\练习\\myByteStream\\bos.txt"));
//        //写数据
//        bos.write("hello\r\n".getBytes());
//        bos.write("world\r\n".getBytes());
//        //释放资源
//        bos.close();

        //字节缓冲输入流 BufferedIntputStream(InputStream in)
//        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\Java另一个软件\\练习\\myByteStream\\bos.txt"));
//        //读数据
//        //一次读取一个字节数据
//        int by;
//        while((by=bis.read())!=-1){
//            System.out.println((char)by);
//        }
//        bis.close();



    }
}

