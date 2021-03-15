package Selctionsort.Java;

import java.util.Random;

public class Selectionsort {
    final int arrayanz=100;
    final int elem=100;
    final int range=1000;
    private int[] bubblesortarr = new int[arrayanz];
    private int[] selectionsortarr = new int[arrayanz];
    private int[] insertionsortarr = new int[arrayanz];

    public int myselectionsort(int[] sortieren) {
        int anz=0;
		for (int i = 0; i < sortieren.length - 1; i++) {
			for (int j = i + 1; j < sortieren.length; j++) {
				if (sortieren[i] > sortieren[j]) {
					int temp = sortieren[i];
					sortieren[i] = sortieren[j];
					sortieren[j] = temp;
                    anz++;
				}
			}
		}
		return anz;
	}

    public int mybubblesort(int[] array) {
        int anz=0;
        for (int n = array.length; n > 1; n--) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    int a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                    anz++;
                }
            }
        }
        return anz;
    }
    public int[] generaterandomarray()
    {
        int[] arr = new int[elem];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(range);
         }
        return arr;
    }
    public int calcAVG(int[] resarray)
    {  
        int calc=0;
        for (int i=0 ;i<resarray.length;i++) {
            calc=resarray[i]+calc;
        }
        return calc/resarray.length;
    }
    public int calcMED(int[] resarray)
    {
        int calc=resarray[resarray.length/2];
        return calc;
    }
    public void loop()
    {
        for (int i = 0; i < arrayanz; i++) {
            int ianz = insertionsort(generaterandomarray());
            int sanz=myselectionsort(generaterandomarray());
            int banz= mybubblesort(generaterandomarray());
            selectionsortarr[i]=sanz;
            bubblesortarr[i]=banz;
            insertionsortarr[i]=ianz;
        }
    }
    int insertionsort(int arr[])
    {
        int n = arr.length;
        int anz=0;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                anz++;
            }
            arr[j + 1] = key;
        }
        return anz;
    }

    public void Sysoutput(String type,int AVG,int MED)
    {
        System.out.println(type);
        System.out.printf("AVG of %d and MED of %d %n",AVG,MED);
    }
    
    public static void main(String[] args) {
        Selectionsort ss = new Selectionsort();
        ss.loop();   
        ss.Sysoutput("Selectionsort",ss.calcAVG(ss.selectionsortarr),ss.calcMED(ss.selectionsortarr));
        ss.Sysoutput("Bubblesort",ss.calcAVG(ss.bubblesortarr),ss.calcMED(ss.bubblesortarr));
        ss.Sysoutput("Insertionsort", ss.calcAVG(ss.insertionsortarr), ss.calcMED(ss.insertionsortarr));
    }
}   
