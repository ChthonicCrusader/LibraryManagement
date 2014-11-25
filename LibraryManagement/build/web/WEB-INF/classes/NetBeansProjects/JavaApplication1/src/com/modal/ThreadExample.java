package com.modal;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.sql

class MyThread1 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
           /* try {
                sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread1.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }
            
    }
}

class MyThread2 extends Thread
{
    public void run()
    {
        for(char j='a';j<'f';j++)
        {
            System.out.println(j);
           /* try {
                sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread2.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }
            
    }
}
/*
 * 
 * 
 * 
 */
class ThreadDemo
{
    public void display(String name)
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Good Morning "+name);
            try{
                Thread.sleep(100);  
                
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

class MyThread extends Thread
{
    ThreadDemo d;
    String name;
   
    public MyThread(ThreadDemo d, String name)
    {
        this.d=d;
        this.name=name;
    }
    
    public void run()
    {
        d.display(name);
    }
}
public class ThreadExample 
{
    public static void main(String args[])
    {
/*        MyThread1 t= new MyThread1();
        MyThread2 t2= new MyThread2();
        System.out.println("T is alive:"+t.isAlive());
        
        t.setPriority(1);
        t2.setPriority(10);
        
        t.start();
        t2.start();
        
        System.out.println("Current thread status "+Thread.currentThread().isAlive());
        System.out.println("T is alive "+t.isAlive());
        System.out.println("Current thread status "+Thread.currentThread().isAlive());
        * /
        */
        
        ThreadDemo d=new ThreadDemo();
        MyThread newThread1=new MyThread(d,"Sachin");
        MyThread newThread2=new MyThread(d,"Ganguly");
        newThread2.setPriority(Thread.MAX_PRIORITY);
        newThread1.setPriority(Thread.MIN_PRIORITY);

        newThread1.start();
        newThread2.start();
    }

}
