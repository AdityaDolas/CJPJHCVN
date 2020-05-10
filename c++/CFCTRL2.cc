#include <iostream>
using namespace std;

int main()
{
    int z, x;
    cin >> z;
    long long count=1;
    if (z >= 1 && z <= 100)
    {
        while (z > 0)
        {
            cin >> x;
            if (x >= 1 && x <= 100)
            {
                while (x > 0)
                {
                    count = count * x;
                    x = x - 1;
                }
            }
            cout << count << endl;
            count = 1;
            z = z - 1;
        }
    }
}