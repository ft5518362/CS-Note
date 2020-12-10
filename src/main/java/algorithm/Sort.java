package algorithm;

import java.util.Arrays;

public class Sort {
    /*冒泡排序*/
    public static void bubbleSortArray(int[] a){
        int temp;
        for (int i = 0; i < a.length; i++) {
            boolean flag = true;
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
        System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
    }
    /*二分查找：key  前提是数组必须是有序的*/
    public static int binarySearch(int[] a, int key){
        int low = 0;
        int high = a.length-1;

        while (low <= high){
            int middle = (low+high)/2;
            if (key == a[middle]){
                return middle;
            }
            if (key < a[middle]){
                high = middle -1;
            }
            if (key > a[middle]){
                low = middle +1;
            }

        }
        return -1;
    }
}
