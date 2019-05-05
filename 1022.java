import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int numero_operacoes = 0, cont = 0;
        String operacao = null;
        StringBuilder numero;
        char operador = '\u0000';
        int n1 = 0, n2 = 0, d1 = 0, d2 = 0, nfinal = 0, dfinal = 0, j = 0, aux = 0;
        numero_operacoes = scanner.nextInt();
        char palavras[][] = new char[numero_operacoes][14];
        scanner.nextLine();
        int naturais[] = new int[1001];
        String numeros[] = new String[4];
        for (int i = 0; i < palavras.length; i++) {
            operacao = scanner.nextLine();
            palavras[i] = operacao.toCharArray();
        }
        for (int i = 1; i <= 1000; i++) {
           naturais[i] = i;
        }
        for (int i = 0; i < palavras.length; i++) {
            numero = new StringBuilder();
            for (int k = 0; k < palavras[i].length; k++) {
                if ((palavras[i][k] >= 48 && palavras[i][k] <= 57) || palavras[i][k] == 32) {
                    numero.append(palavras[i][k]);
                }
                else if (palavras[i][k] == 42 || palavras[i][k] == 43 || palavras[i][k] == 45 || palavras[i][k]
                        == 47) {
                    cont++;
                    if (cont == 2) {
                        operador = palavras[i][k];
                    }
                }
            }
            cont = 0;
            String num = numero.toString();
            numeros = num.split(" ");
            n1 = Integer.parseInt(numeros[0]);
            d1 = Integer.parseInt(numeros[2]);
            n2 = Integer.parseInt(numeros[4]);
            d2 = Integer.parseInt(numeros[6]);
            switch (operador) {
                case '+':
                    nfinal = n1*d2 + d1*n2;
                    dfinal = d1*d2;
                    break;
                case '-':
                    nfinal = n1*d2 - n2*d1;
                    dfinal = d1*d2;
                    break;
                case '*':
                    nfinal = n1*n2;
                    dfinal = d1*d2;
                    break;
                case '/':
                    nfinal = n1*d2;
                    dfinal = n2*d1;
                default:
                    break;
            }
            if (nfinal > dfinal) {
                j = nfinal;
            } else {
                j = dfinal;
            }
            for (; j > 0; j--) {
                if (nfinal%j == 0 && dfinal%j == 0) {
                    int nfinal2 = nfinal / j;
                    int dfinal2 = dfinal / j;
                    System.out.println(nfinal + "/" + dfinal + " = " + nfinal2 + "/" + dfinal2);
                    aux++;
                    break;
                }
            }
            if (aux < 1) {
                System.out.println(nfinal + "/" + dfinal + " = " + nfinal + "/" + dfinal);
            }
        }
    }
}
