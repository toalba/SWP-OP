package Binärsuche.Java;

import java.util.Random;

public class Binarsuche {

    public void suche(int[] array, int wanted, int low, int high) {
        long start = System.currentTimeMillis();
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] < wanted) {
                low = mid + 1;
            } else if (array[mid] > wanted) {
                high = mid - 1;
            } else if (array[mid] == wanted) {
                System.out.println(System.currentTimeMillis() - start);
                System.out.println("Stelle:"+mid+" Gesucht:"+wanted);
                break;
            }
        }
    }
    public int brsearcher(int[] array, int wanted, int low , int high)
        {
            long milliseconds = System.currentTimeMillis();
            int mid = (low + high)/2;
            if(array[mid]<wanted)
            {
                return brsearcher(array,wanted,low+1,high);
            }
            else if(array[mid]>wanted)
            {
                return brsearcher(array,wanted,low,high-1);
            }
            else if (array[mid]==wanted)
            {
                System.out.println(System.currentTimeMillis()-milliseconds);
                System.out.println("Stelle:"+mid+" Gesucht:"+wanted);
                return wanted;
            }
            else
            {
                return 0;
            }
        }

    public int[] fillup() {
        int lenght = 100;
        Random rand = new Random();
        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }

    public static void main(String[] args) {
        Binarsuche binearsuche = new Binarsuche();
        Random rand = new Random();
        int[] array = binearsuche.fillup();
        int wanted = array[rand.nextInt(100)];
        binearsuche.suche(array, wanted, 0, array.length-1);
        binearsuche.brsearcher(array, wanted, 0, array.length-1); 
    }
    
}
