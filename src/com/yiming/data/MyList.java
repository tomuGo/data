package com.yiming.data;

public interface MyList<E> {

    int size();

    Boolean isEmpty();

    E remove(int index);

    Boolean add(E e);

    E get(int index);

    E set(int index,E e);

}
