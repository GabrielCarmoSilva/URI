import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
 
        int n;
        
        n = scanner.nextInt();
        scanner.nextLine();
        String string;
        char[][] palavras = new char[n][1001];
        
        for (int i = 0; i < n; i++) {
            string = scanner.nextLine();
            palavras[i] = string.toCharArray();
        }
        
        for (int i = 0; i < n; i++) {
            Main.somaTres(palavras[i]);
            palavras[i] = Main.inverterString(palavras[i]);
            Main.diminuirUm(palavras[i]);
            System.out.println(palavras[i]);
        }
    }
    
    public static void somaTres(char[] vetor) {
	for (int i = 0; i < vetor.length; i++) {
		if (vetor[i] >= 'a' && vetor[i] <= 'z' || vetor[i] >= 'A' && vetor[i] <= 'Z') {
			vetor[i] += 3;
		}
	}
    }
    
    public static char[] inverterString(char[] vetor) {
        StringBuilder builder = new StringBuilder();
        String string;
        for (int i = 0; i < vetor.length; i++) {
            builder.append(vetor[i]);
        }
        string = builder.reverse().toString();
        return string.toCharArray();
    }
    
    public static void diminuirUm(char[] vetor) {
        for (int i = vetor.length - 1; i >= (vetor.length / 2); i--) {
            vetor[i] -= 1;
        }
    }
}
