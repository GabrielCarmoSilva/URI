#include <iostream>

using namespace std;

int main() {
	int N, S, D, menor, i=0;
	cin >> N >> S;
	menor = S;
	while (i < N) {
		cin >> D;
		S += D;
		if (S < menor) {
			menor = S;
		}
		i++;
	}
	cout << menor << endl;
	return 0;
}
