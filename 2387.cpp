#include <iostream>
#include <algorithm>
#define MAX 1000000

using namespace std;

struct compromisso {
	int ini, fim;
};

bool compara(compromisso a, compromisso b) {
	return a.fim < b.fim;
}

compromisso consulta[MAX];
int n, x, y, livre, qtd;

int main() {
	cin >> n;
	for (int i = 1; i <= n; i++) {
		cin >> consulta[i].ini >> consulta[i].fim;
	}
	
	sort(consulta+1, consulta+n+1, compara);
	
	for (int i = 1; i <= n; i++) {
		if (consulta[i].ini >= livre) {
			qtd++;
			livre = consulta[i].fim;
		}
	}
	
	cout << qtd << endl;
}
