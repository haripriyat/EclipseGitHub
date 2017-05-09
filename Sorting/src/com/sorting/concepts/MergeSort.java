package com.sorting.concepts;

public class MergeSort {
    
    private int[] array;
    private int[] tempMergArr;
    private int length;
 
    public static void main(String a[]){
         
        int[] inputArr = {7, 8, 9, 3 , 2, 1};
        MergeSort mms = new MergeSort();
        mms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
     
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int start, int end) {
         
        if (start < end) {
            int middle = (end + start) / 2;
            // Below step sorts the left side of the array
            doMergeSort(start, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, end);
            // Now merge both sides
            mergeParts(start, middle, end);
        }
    }
 
    private void mergeParts(int start, int middle, int end) {
 
        for (int i = start; i <= end; i++) {
            tempMergArr[i] = array[i];
        }
        int i = start;
        int j = middle + 1;
        int k = start;
        
        while (i <= middle && j <= end) {
            if (tempMergArr[i] <= tempMergArr[j]) {
            	array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
}
