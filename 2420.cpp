#include <iostream>

using namespace std;

int main() {
	int V[100000], N, soma=0, indice, aux;
	cin >> N;
	for (int i = 0; i < N; i++) {
		cin >> V[i];
		soma += V[i];
	}
	aux = V[0];
	for (int i = 1; i < N; i++) {
		if (aux == (soma/2)) {
			indice = i;
			break;
		}
		aux += V[i];
	}
	cout << indice << endl;
	return 0;
}
