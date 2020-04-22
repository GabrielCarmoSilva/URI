#include <iostream>

using namespace std;

int main() {
	int H1, M1, H2, M2, T1, T2;
	while (cin >> H1 >> M1 >> H2 >> M2) {
		T1 = (H1*60) + M1;
		T2 = (H2*60) + M2;
		if (M1 == 0 && H1 == 0 && H2 == 0 && M2 == 0) {
			break;
		}
		if (T1 > T2) {
			cout << T2 + (1440 - T1) << endl;
		}
		else if (T2 > T1) {
			cout << T2-T1 << endl;
		}		
		else if (T2 == T1) {
			cout << 1440 << endl;
		}	
	}
	return 0;
}
