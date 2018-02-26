package com.yiming.data;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<E> implements Iterator<E> {

    private static final int INIT_CAPACITY =10;

    private int size;

    private E [] element;

    public MyArrayList(){
        init();
    }

    public void clear(){
        size=0;
        ensureCapacity(INIT_CAPACITY);
    }

    private void init(){
        clear();
    }

    //获取集合长度
    public int size(){
        return size;
    }

    public E get(int index){
        if(index>size){
            throw new IndexOutOfBoundsException();
        }
        return element[index];
    }

    public E set(int index,E newE){
        if(index>size){
            throw new IndexOutOfBoundsException();
        }
        E old=element[index];
        element[index]=newE;
        return old;
    }

    //集合扩容
    public void ensureCapacity(int newCapacity){
        if(size<newCapacity){
            return;
        }
        E[]old=element;
        element=(E[])new Object[newCapacity];
        for(int i=0;i<size;i++){
            element[i]=old[i];
        }
    }

    //是否是空集合
    public Boolean isEmpty(){
        return size==0;
    }

    //移除
    public E remove(int index){
        E removeElement=element[index];
        for(int i=index;i<size;index++){
            element[i]=element[i+1];
        }
        size--;
        return removeElement;
    }

    public void add(int index,E addElement){
        if(size==element.length){
            ensureCapacity(2*size+1);
        }
        element[index]=addElement;
        for(int i=size;i>index;i--){
            element[i+1]=element[i];
        }
        size++;
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }

    public Iterator<E> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<E>{
        private int current =0;
        @Override
        public boolean hasNext() {
            return current<size;
        }

        @Override
        public E next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            return element[current+1];
        }

        public void remove(){
            MyArrayList.this.remove(current);
        }
    }

}
