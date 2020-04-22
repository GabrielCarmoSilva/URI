#include <iostream>

using namespace std;

int main() {
	int N, V[10000], cont=1, aux=0;
	cin >> N;
	for (int i = 0; i < N; i++) {
		cin >> V[i];
		if (i > 0) {
			if (V[i] == V[i-1]) {
				cont++;
				if (cont > aux) {
					aux = cont;
				}
			}
			else {
				cont = 1;
			}
		}
	}
	cout << aux << endl;
	return 0;
}
