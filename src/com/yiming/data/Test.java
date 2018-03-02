package com.yiming.data;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {


    /*public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<String>();
        list.add(0,"1");
        list.add(1,"2");
        list.add(2,"3");
        list.add(1,"4");
        list.set(0,"5");
        list.set(3,"6");
        list.add(1,"4");
        list.add(1,"4");
        System.out.println(list.isEmpty());
        list.remove(0);
        System.out.println(list);
    }*/

    /*public static void main(String[] args) {
        MyLinkedList<String>list=new MyLinkedList<String>();
        list.add("1");
        list.add("2");
        System.out.println(list);
    }*/

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>(100000);

        for(int i=0;i<100000;i++){
            list.add(i);
        }
        List<Integer> list1=new ArrayList<Integer>(100000);
        for(int j=0;j<200200;j++){
            if(j%2==0){
                list1.add(j);
            }
        }
        printLots(list,list1);
    }

    public static void printLots(List<Integer> list,List<Integer> list1){
        long s=System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        for(int i=0;i<list.size();i++){
            System.out.println(list1.get(list.get(i)));
        }
        long e=System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        System.out.println(e-s);
    }

    public static void printLots1(List<Integer> list,List<Integer> list1){
        long s=System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        for(int i=0;i<list.size();i++){
            System.out.println(list1.get(list.get(i)));
        }
        long e=System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        System.out.println(e-s);


        Iterator<Integer>l=list.iterator();
        Iterator<Integer>p=list1.iterator();





    }



}
