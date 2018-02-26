package com.yiming.data;

public interface MyList<E> {

    int size();

    Boolean isEmpty();

    E remove(int index);

    void add(int index,E e);

    E get(int index);

    E set(int index,E e);

}
