package com.wang.cas.cas;

import java.io.*;


public class Test2 {


    public static void main(String[] args) throws FileNotFoundException {
        // TODO 自动生成的方法存根

        String path1="D:";
        String name="\\video";
        String end=".mp3";
        String path2;

        long l;
        long n=3;//设置分割数目
        File file = new File(path1+name+end);

        File file2;
        l=file.length();
        InputStream in = null;
        FileOutputStream out = null;
        try {

            in = new FileInputStream(file);
            int i=0;
            for(i=1;i<=n;i++) {
                path2=path1+name+i+end;
                file2=new File(path2);
                if(file2.exists()) {}
                else {
                    file2.createNewFile();
                }
                out=new FileOutputStream(file2);
                byte[] buf = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buf)) != -1) {

                    out.write(buf, 0, bytesRead);
//                    System.out.write(tempbyte);
                    if(file2.length()>l/n)break;//子文件到达指定大小就创建下一个文件；
                }


            }
            out.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;

        }
    }}