#include <iostream>
using namespace std;

int main()
{
    int z;
    int count = 0;
    cin >> z;
    while (z > 0)
    {
        int a;
        cin >> a;
        while (a > 0)
        {
            int b = a % 10;
            if (b == 4)
            {
                count = count + 1;
            }

            a = a / 10;
        }
        cout << count << endl;
        count = 0;
        z = z - 1;
    }
}