using System;

namespace CSharp
{
    class Binarysearch
    {
        public long bsearcher(int[] array, int wanted, int low , int high)
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
                   return(DateTimeOffset.Now.ToUnixTimeMilliseconds()-milliseconds);
                }
            }
            return 0;
        }
        //recursive
        public int brsearcher(int[] array, int wanted, int low , int high)
        {
            long milliseconds = DateTimeOffset.Now.ToUnixTimeMilliseconds();
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
                    Console.WriteLine(DateTimeOffset.Now.ToUnixTimeMilliseconds()-milliseconds);
                    Console.WriteLine("Stelle:"+mid+" Gesucht:"+wanted);
                    return wanted;
                }
                else
                {
                    return 0;
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
            int lenght = 10000;
            var rand = new Random();
            int[] array = new int[lenght];
            for (int i = 0; i < array.Length; i++)
            {
                array[i]= rand.Next(1000);
            }
            

            return array;
        }

        //Today scripting in C#, because its new for me and I want to have a learn effect
        static void Main(string[] args)
        {
            Binarysearch search = new Binarysearch();
            Console.WriteLine(search.benchmark());
        }
        public long benchmark()
        {
            int benchmarklenght=10000;
            long time = 0;
            for (int i = 0; i < benchmarklenght; i++)
            {
            var rand = new Random();
            int[] sarray = fillup();
            int wanted = sarray[rand.Next(100)];
            Array.Sort(sarray);
            time = time + bsearcher(sarray,wanted,0,sarray.Length-1);
            Console.WriteLine(time);
            }
            time= time/benchmarklenght;
            return time;
        }

    }
}
