#include <iostream>

using namespace std;

int main() {
	int A, B, C;
	cin >> A >> B >> C;
	if (A + B == C || A + C == B || B + C == A) {
		cout << "S" << endl;
	}
	else if (A == C || A == B || B == C) {
		cout << "S" << endl;
	}
	else {
		cout << "N" << endl;
	}
	return 0;
}
