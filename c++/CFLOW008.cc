#include <iostream>
using namespace std;

int main()
{
    int a, b;
    cin >> a;
    while (a > 0)
    {
        cin >> b;
        if (b < 10)
        {
            cout << "What an obedient servant you are!" << endl;
        }
        else
        {
            cout << "-1" << endl;
        }
        a -= 1;
    }
}