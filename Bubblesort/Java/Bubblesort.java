package Bubblesort.Java;

import java.util.Random;

public class Bubblesort {
    
    public int[] mybubblesort(int[] array) {
        for (int n = array.length; n > 1; n--) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    int a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                }
            }
        }
        return array;
    }

    public int[] quickerbubblesearch(int[] array) {
        int n = array.length;
        boolean tausch;
        do {
            tausch = false;
            for (int i = 0; i < n-1; i++) {
                if (array[i] > array[i + 1]) {
                    int a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                    tausch=true;
                }
            }
            n--;
        } while (tausch);
        return array;
    }

    public static void main(String[] args) {
        Bubblesort bubblesort = new Bubblesort();
        Random rd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
           arr[i] = rd.nextInt(100000);
        }

        long startTime = System.nanoTime();
        bubblesort.mybubblesort(arr);
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        startTime = System.nanoTime();
        bubblesort.quickerbubblesearch(arr);
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);

    }
}
