#include <iostream>

using namespace std;

int fatorial(int v) {
	if (v == 0) {
		return 1;
	}
    else {
    	return v*fatorial(v-1);
	}
}
 
int main() {
    int n, j;
    cin >> n;
   	j = fatorial(n);
   	cout << j << endl;
    return 0;
}
