package com.java.Deno_01;

import java.io.*;

public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
//        File f1=new File("D:\\\\Java另一个软件\\\\练习\\\\myByteStream\\bos.txt");
//        System.out.println(f1.createNewFile());
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\\\Java另一个软件\\\\练习\\\\myByteStream\\\\fos.txt"));
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\\\Java另一个软件\\\\练习\\\\myByteStream\\\\bos.txt"));
//        int ch;
//        while((ch=isr.read())!=-1){
//            osw.write(ch);
//        }
//        isr.close();
//        osw.close();


        //字符缓冲输出流
//        BufferedWriter bw=new BufferedWriter(new FileWriter("myByteStream\\bos.txt"));
//        bw.write("hello\r\n");
//        bw.write("world\r\n");
//        bw.close();

        //字符缓冲输入流
        BufferedReader br=new BufferedReader(new FileReader("\\bos.txt"));
        //一次读一个数据
//        int ch;
//        while((ch=br.read())!=-1){
//            System.out.println((char)ch);
//        }
        //一次读一个数组数据
        char[] chs=new char[1024];
        int len;
        while ((len=br.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }
        br.close();
    }
}