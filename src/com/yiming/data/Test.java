package com.yiming.data;


public class Test {

    public static void main(String[] args) {
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
    }

}
