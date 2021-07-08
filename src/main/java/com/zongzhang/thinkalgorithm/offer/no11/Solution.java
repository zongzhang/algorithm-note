package com.zongzhang.thinkalgorithm.offer.no11;

/**
 * @since 1.0
 */
public class Solution {
    //public int minArray(int[] numbers) {
    //    for (int i = 0; i < numbers.length-1; i++) {
    //        if (numbers[i] > numbers[i + 1]) {
    //            return numbers[i + 1];
    //        }
    //    }
    //    return numbers[0];
    //}

    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
            } else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else {
                high--;
            }
        }
        return numbers[low];
    }
}

