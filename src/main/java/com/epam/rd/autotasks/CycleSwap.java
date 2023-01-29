package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if(array.length!=0){
            int temp=array[array.length-1];
            for(int i=array.length-1;i>0;i--){
                array[i]=array[i-1];
            }
            array[0]=temp;
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if(array.length!=0){
        for(int n=1;n<=shift;n++){
            int temp=array[array.length-1];
            for(int i=array.length-1;i>0;i--){
                array[i]=array[i-1];
            }
            array[0]=temp;
        }
    }
    }
}
