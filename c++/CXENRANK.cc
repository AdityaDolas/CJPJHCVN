#include <iostream>
using namespace std;

int main()
{
    int z, result, temp, temp2;
    cin >> z;
    while (z > 0)
    {
        int u, v;
        cin >> u;
        cin >> v;
        temp = (u + v) + 1;
        temp2 = temp * (temp - 1) / 2 + 1;
        result = temp2 + u;
        cout << result << endl;

        z -= 1;
    }
}