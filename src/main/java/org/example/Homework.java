package org.example;

public class Homework {
    public static int[] array(int[] arr) {
        int indexOfLastFour = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) indexOfLastFour = i;
        }
        if (indexOfLastFour == -1) throw new RuntimeException("exception");
        if (indexOfLastFour == arr.length-1) return new int[]{};

        int[] newArr = new int[arr.length-indexOfLastFour-1];

        for (int i = (indexOfLastFour+1), k = 0; k < (arr.length-indexOfLastFour-1); i++, k++) {
            newArr[k] = arr[i];
        }
        return newArr;

    }
    public static boolean oneAndFour(int[] arr){
        boolean oneExists = false;
        boolean fourExists = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) return false;
            if (arr[i] == 1) oneExists = true;
            if (arr[i] == 4) fourExists = true;
        }
        return oneExists&&fourExists;

    }
}
