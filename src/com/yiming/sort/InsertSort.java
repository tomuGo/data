package com.yiming.sort;

import java.util.List;

public class InsertSort {
    public static void main(String[] args) {
        Integer[]list={1,7,2,8,3};
        Integer[]l=insertSort(list);
        for(int i=0;i<l.length;i++){
            System.out.println(l[i]);
        }
    }

    public static Integer[] insertSort(Integer[]list){
        int p;
        for(int i=1;i<list.length;i++){
            Integer number=list[i];
            for(p=i;p>0&&p>0&&(number.compareTo(list[p-1]))<0;p--){
                list[p]=list[p-1];
            }
            list[p]=number;
        }
        return list;
    }
}
