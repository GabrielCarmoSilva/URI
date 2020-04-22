#include <iostream>

using namespace std;

int main() {
	int N, maior;
	cin >> N;
	maior = N;
	while (N != 0) {
		cin >> N;
		if (N > maior) {
			maior = N;
		}
	}
	cout << maior << endl;
	return 0;
}
