using System;

namespace Aufgabe1_Binarysearch
{
    class Binarysearch
    {
        public void bsearcher(int[] array, int wanted)
        {
            int i = array.Length/2;
            bool notfound=true;
            long milliseconds = DateTimeOffset.Now.ToUnixTimeMilliseconds();
            int n = 1;
            while(notfound)
            {
                if(array[i]==wanted)
                {
                    Console.WriteLine(DateTimeOffset.Now.ToUnixTimeMilliseconds()-milliseconds);
                    notfound=false;
                }
                else if(array[i]>wanted)
                {
                    i=i/2;
                Console.WriteLine(i+"down");
                Console.WriteLine(array[i]+" "+wanted);
                }
                else if (array[i]<wanted)
                {
                    int devid= 2*n;
                    i=i+(i/devid);
                Console.WriteLine(i+"up");
                Console.WriteLine(array[i]+" "+wanted);
                }

                System.Threading.Thread.Sleep(200);
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
            search.bsearcher(sarray,wanted);
        }
    }
}
