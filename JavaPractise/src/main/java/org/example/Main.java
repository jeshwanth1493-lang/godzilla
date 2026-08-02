package org.example;

import ImplementDataStructure.*;
import thread.*;

import java.util.*;

public class Main extends Thread {


    public static void main (String[] args) {

        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("Apple",10);
        map.put("Banana",3);
        map.put("Cap",1);
        map.put("Apple",1);
        map.put("A1",1);
        map.put("A2",1);
        map.put("A3",1);
        map.put("A4",1);
        map.put("A5",1);
        map.put("A6",1);
        map.put("A7",1);
        map.put("A8",1);
        map.put("A9",1);
        map.put("A10",1);
        map.put("A11",1);
        map.put("A14",1);
        map.put("A15",1);
        map.put("A16",1);
        map.put("A17",1);
        map.put("A18",1);

System.out.println(map.get("Apple"));



//        REverSeString
//        ReverseString reverseString = new ReverseString();
//        reverseString.reverseString("Jesh");

//Min Max Stack
//        MinMaxStack stack = new MinMaxStack();
//        stack.push(1);
//        System.out.println(stack.getMin());
//        stack.pop();
//        stack.push(6);
//        stack.push(10);
//        stack.push(3);
//        System.out.println(stack.getMin());
//        stack.pop();
//        System.out.println(stack.getMin());



//    A a = new A();
//    B b = new B();
//
//    public void m1() {
//        this.start();
//        a.d2(b);
//    }
//
//   public void run() {
//       b.d1(a);
//   }
//
//    public static void main(String[] args) {
//
//        Main main = new Main();
//        main.m1();



//        Display display = new Display();
//        MyThread myThread1 = new MyThread(display,"Jesh");
//        MyThread myThread2 = new MyThread(display,"yesh");
//        myThread2.start();
//        myThread1.start();

////        myThread.start();
//        for(int i=0;i<10;i++) {
//            System.out.println("Main Class:"+i);
//        }
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(9);
//        MyThread myThread = new MyThread();
//        System.out.println(myThread.getPriority());

//        System.out.println("Hello World!");
//
//        int[] a = new int[3];
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 3;
//
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
//
//        int size = a.length;
//        int[] temp = new int[size];
//        int i=0;
//        for(int k=size-1;k>=0;k--) {
//            temp[i] = a[k];
//            i++;
//        }
//
//        for(int j=0;j<temp.length;j++){
//            System.out.println(temp[j]);
//        }
//
//        String name = "Jesh";
//        System.out.println(name);
//        char[] charc = name.toCharArray();
//        String rev= "";
//        for(int h=charc.length-1;h>=0;h--){
//            System.out.print(charc[h]);
//            rev+=charc[h];
//        }
//        System.out.println(rev);
    }
}