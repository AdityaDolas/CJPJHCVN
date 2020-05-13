#include <iostream>
#include <math.h>
using namespace std;

int main()
{
	int z;
	cin >> z;
	while(z>0)
	{
		int a;
		cin >> a;
		cout << int(sqrt(a)) << endl;
		z-=1;
	}
}
