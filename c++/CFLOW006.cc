#include <iostream>
using namespace std;

int main()
{
    int count = 0;
    int a, b, c;
    cin >> a;
    while (a > 0)
    {
        cin >> b;
        while (b > 0)
        {
            c = b % 10;
            count = count + c;
            b = b / 10;
        }
        cout << count << endl;
        count = 0;
        a = a - 1;
    }
}