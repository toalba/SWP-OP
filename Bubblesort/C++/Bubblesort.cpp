#include <iostream>
using namespace std;

void bubblesort(int array[]) 
{
    cout<< sizeof(array) / sizeof(*array) <<"\n";
    for (size_t i = sizeof(array); i > 1 ; i--)
    {
        for (size_t i = 0; i < sizeof(array)-1; i++)
        {
            int a = array[i];
            array[i] = array[i + 1];
            array[i + 1] = a;
        }
    }
    for (size_t i = 0; i < sizeof(array); i++)
    {
        cout<<array[i]<<"\n";
    }
}

int main()
{
    int array[10] = {1,43,2,6,42,7,54,0,9,10};
    cout << "Hello World!\n";
    bubblesort(array);
    return 0;
}



