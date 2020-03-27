package com.wang.algorithm;

import java.util.Arrays;

/**
 * 常见的排序算法:
 */
public class Order {


    /**
     * 冒泡排序:
     */
    public  void bubbleSort() {
        int[] sortArr = new int[]{5, 2, 3, 7, 9, 10};
        int temp;
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = i; j < sortArr.length - 1; j++) {
                if (sortArr[j] > sortArr[j + 1]) {
                    temp = sortArr[j + 1];
                    sortArr[j + 1] = sortArr[j];
                    sortArr[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        new Order().bubbleSort();
    }
}
