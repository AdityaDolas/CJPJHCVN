#include <iostream>

using namespace std;

int main(){
    int a,b,c;
    int result = 0;
    cin >> a;
    cin >> b;
    while (a>0)
    {
        cin >> c;
        if (c%b==0)
        {
            result++;
        }
        
        a--;
    }

    cout << result << endl;

    return 0;
}