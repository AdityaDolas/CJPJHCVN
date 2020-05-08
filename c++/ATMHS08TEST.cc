#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    double n1, n2;
    cin >> n1;
    cin >> n2;
    if (int(n1) % 5 == 0)
    {

        cout << fixed << setprecision(2);
        if ((n1 + 0.5) < n2)
        {
            cout << (n2 - n1) - 0.5 << endl;
        }
        else
        {
            cout << fixed << setprecision(2);
            cout << n2 + 0.00 << endl;
        }
    }
    else
    {
        cout << fixed << setprecision(2);
        cout << n2 + 0.00 << endl;
    }

    return 0;
}
