package com.assingment;

import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int[] arr = {6, 9, 1, 5, 12, 65, 3, 10};
        arr = merge_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] merge_sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        } else {
            int mid = arr.length / 2;
            int[] left = merge_sort(Arrays.copyOfRange(arr, 0, mid));
            int[] right = merge_sort(Arrays.copyOfRange(arr, mid, arr.length));
            return merge2(left, right);
        }
    }

    private static int[] merge2(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //coping the remaining element
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}

