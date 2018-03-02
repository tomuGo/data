package com.yiming.data;

import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E>,Iterator<E>{

    private int size;

    /*
    链表修改次数
     */
    private int modCount;

    private Node<E> begin;

    private Node<E> end;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }

    private static class Node<E>{
        public Node(E e,Node<E> p,Node<E> n){
            data=e;
            prev=p;
            next=n;
        }
        private E data;
        private Node<E> prev;
        private Node<E> next;


        public String toString() {
            return " data:" + data;
        }
    }

    public MyLinkedList(){
        clear();
    }

    public void clear(){
        doClear();
    }

    public void doClear(){
        begin = new Node(null,null,null);
        end = new Node(null,begin,null);
        begin.next=end;
        size = 0;
        modCount++;
    }

    public int size() {
        return size;
    }


    public Boolean isEmpty() {
        return size() == 0;
    }


    public E  remove(int index) {
        return remove(getNode(index));
    }

    @Override
    public Boolean add(E addElement) {
        add(size(),addElement);
        return true;
    }

    public void add(int index, E addElement) {
        addBefore(getNode(index,0,size()),addElement);
    }

    public E get(int index) {
        return getNode(index).data;
    }

    public E set(int index, E newElement) {
        Node<E>node=getNode(index);
        E old=node.data;
        node.data=newElement;
        modCount++;
        return old;
    }

    private Node<E> getNode(int index){
        return getNode(index,0,size()-1);
    }

    public void addBefore(Node<E>node,E e){
        Node<E>newNode=new Node<E>(e,node.prev,node);
        newNode.prev.next=newNode;
        node.prev=newNode;
        size++;
        modCount++;
    }

    public E remove(Node<E>node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
        size--;
        modCount++;
        return node.data;
    }

    private Node<E> getNode(int index,int lower,int upper){
        if(index<lower||index>upper){
            throw new IndexOutOfBoundsException();
        }
        Node<E>p;
        if(index<size()/2){
            p=begin.next;
            for(int i=0;i<index;i++){
                p=p.next;
            }
        }else{
            p=end;
            for(int j=size();j>index;j--){
                p=p.prev;
            }
        }
        return p;
    }

    public Boolean contain(E e){
        Node<E>node=begin;
        while (!node.equals(end)&&!node.equals(node.next)){

        }
        return false;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "size=" + size +
                ", modCount=" + modCount +
                ", begin=" + begin +
                ", end=" + end +
                '}';
    }
}
