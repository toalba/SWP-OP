using System;

namespace Aufgabe1_Binarysearch
{
    class Binarysearch
    {
        public void bsearcher(int[] array, int wanted, int low , int high)
        {
            long milliseconds = DateTimeOffset.Now.ToUnixTimeMilliseconds();
            while(low <= high)
            {
                int mid = (low + high)/2;
                if(array[mid]<wanted)
                {
                    low = mid +1;
                }
                else if(array[mid]>wanted)
                {
                   high = mid - 1;
                }
                else if (array[mid]==wanted)
                {
                    Console.WriteLine(DateTimeOffset.Now.ToUnixTimeMilliseconds()-milliseconds);
                    break;
                }
            }
        }
        public void lsearcher(int[] array, int wanted)
        {
            long milliseconds = DateTimeOffset.Now.ToUnixTimeMilliseconds();
            for (int i = 0; i < array.Length; i++)
            {
                if (array[i]==wanted)
                {
                    Console.WriteLine(DateTimeOffset.Now.ToUnixTimeMilliseconds()-milliseconds);
                    break;
                }
            }
        }
        public int[] fillup()
        {
            int lenght = 100;
            var rand = new Random();
            int[] array = new int[lenght];
            for (int i = 0; i < array.Length; i++)
            {
                array[i]= rand.Next(100);
            }
            

            return array;
        }

        //Today scripting in C#, because its new for me and I want to have a learn effect
        static void Main(string[] args)
        {
            Binarysearch search = new Binarysearch();
            var rand = new Random();
            int[] sarray = search.fillup();
            int wanted = sarray[rand.Next(100)];
            Array.Sort(sarray);
            search.lsearcher(sarray,wanted);
            search.bsearcher(sarray,wanted,0,sarray.Length-1);
        }
    }
}
