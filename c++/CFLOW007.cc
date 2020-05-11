#include <iostream>
using namespace std;

int main()
{
    int z;
    cin >> z;
    int result = 0;
    while (z > 0)
    {
        int a;
        cin >> a;
        while (a > 0)
        {
            int b = a % 10;
            result = (result * 10) + b;
            a /= 10;
        }
        cout << result << endl;
        result = 0;
        z -= 1;
    }
}