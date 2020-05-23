package com.hg.transation.controller;

public class threadtest extends Thread {
    public static String a="1";
    public static String b="2";

    public static void main(String [] args){
        Thread tt1 = new threadtest();
        Thread tt2 = new threadtest();
        tt1.start();
        tt2.start();
    }
    public void run(){
        while (true) {
            synchronized (threadtest.a) {
                System.out.println(this.getName() + ":" + a);

                synchronized (threadtest.b) {
                    System.out.println(this.getName() + ":" + b);
                }
            }
        }
    }
}
