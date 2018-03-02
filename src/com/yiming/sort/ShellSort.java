package com.yiming.sort;

public class ShellSort {
    public static void main(String[] args) {
        Integer[]a={1,7,4,8,3,5,2,9};
        Integer[] b=ShellSort(a);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }

    public static Integer[] ShellSort(Integer[]list){

        for(int gap=list.length/2;gap>0;gap/=2){
            for(int i=gap;i<list.length;i++){
                Integer number=list[i];
                int j;
                for(j=i;j>=gap&&number.compareTo(list[j-gap])<0;j-=gap){
                    list[j]=list[j-gap];
                }
                list[j]=number;
            }
        }
        return list;
    }
}
