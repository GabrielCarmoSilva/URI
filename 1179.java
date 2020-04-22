import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        int[] par = new int[5];
        int[] impar = new int[5];
        int[] geral = new int[15];
        int n = 0, j = 0, k = 0, temp = 0, n_resto_pares = 0, n_resto_impares = 0;
        boolean encheu_par = false, encheu_impar = false;
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 15; i++) {
            n = scanner.nextInt();
            if (encheu_par) {
                if (n % 2 == 0) {
                    n_resto_pares++;
                }
            }
            if (encheu_impar) {
                if (n % 2 != 0) {
                    n_resto_impares++;
                }
            }
            if (n % 2 == 0) {
                par[j] = n;
                j++;
            }
            else {
                impar[k] = n;
                k++;
            }
            if (j == 5) {
                while (temp < 5) {
                    System.out.println("par[" + temp + "] = " + par[temp]);
                    par[temp] = 0;
                    temp++;
                }
                temp = 0;
                j = 0;
                encheu_par = true;
            }
            if (k == 5) {
                while (temp < 5) {
                    System.out.println("impar[" + temp + "] = " + impar[temp]);
                    impar[temp] = 0;
                    temp++;
                }
                temp = 0;
                k = 0;
                encheu_impar = true;
            }
        }
        
        if (encheu_impar) {
            for (int i = 0; i < n_resto_impares; i++) {
                System.out.println("impar[" + i + "] = " + impar[i]);
            }
        }
        if (encheu_par) {
            for (int i = 0; i < n_resto_pares; i++) {
                System.out.println("par[" + i + "] = " + par[i]);
            }
        }
        
    }
    
}
