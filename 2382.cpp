#include <iostream>
#include <cmath>

using namespace std;

int main() {
	int L, A, P, R, d;
	cin >> L >> A >> P >> R;
	d = sqrt((pow(L, 2)) + (pow(A, 2)) + (pow(P, 2)));
	if (d <= 2*R) {
		cout << "S" << endl;
	}
	else if (d > 2*R) {
		cout << "N" << endl;
	}
}
