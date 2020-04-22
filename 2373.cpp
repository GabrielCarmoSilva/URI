#include <iostream>

using namespace std;

int main() {
	int N, L, C, soma=0;
	cin >> N;
	for (int i=0; i < N; i++) {
		cin >> L >> C;
		if (L > C) {
			soma += C;
		}
	}
	cout << soma << endl;
	return 0;
}
