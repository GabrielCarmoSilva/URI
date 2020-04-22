#include <iostream>

using namespace std;

int main() {
	int N, P, Q, op;
	char C;
	cin >> N;
	cin >> P >> C >> Q;
	if (C == '+') {
		op = P + Q;
	}
	else if (C == '*') {
		op = P * Q;
	}
	if (op <= N) {
		cout << "OK" << endl;
	}
	else {
		cout << "OVERFLOW" << endl;
	}
}
