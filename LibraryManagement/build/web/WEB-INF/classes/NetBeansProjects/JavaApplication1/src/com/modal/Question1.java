/*
 * 
 * One counter starts from 5 and increments with the step of 5.
Second counter starts from 10 and increments with the step of 10.
Third counter starts with 100 and increments with the step of 100.
Assign proper priority to the threads and then run the threads.
 */
package com.modal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


class Thread2 extends Thread
{
    static int sum=1;
    
    public void fact(int j)
    {
        for(int i=1;i<j;i++)
        {
            sum*=i;
        
        }
        
        System.out.println("Fact"+sum);
        
    }
}

class Thread1 extends Thread
{
    Thread2 th=new Thread2();
    
    FileInputStream in;
    FileOutputStream out;
    int c;
    Thread1(FileInputStream in, FileOutputStream out)
    {
        this.in=in;
        this.out=out;
    }
    
    public void run()
    {
        try{
           
                while((c=in.read())!=-1)
                {
//                    out.write(c);                
                    System.out.println((char)c);
                    th.fact(c);
                }
                
                 if (in != null) 
                 {
                     in.close();
                 }              
            }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
       
    }
}


public class Question1 
{
    public static void main(String args[]) throws Exception
    {
        
        FileInputStream fin1=new FileInputStream("C:/in1.txt");
     //   FileInputStream fin2=new FileInputStream("C:/in2.txt");
        FileOutputStream fout=new FileOutputStream("C:/out.txt");
        Thread1 t1=new Thread1(fin1,fout);
       // Thread1 t2=new Thread1(fin2,fout);
        t1.start();
       // t2.start();
        
    }
    
}
