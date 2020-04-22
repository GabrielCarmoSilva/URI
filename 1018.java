import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
				
		int valor = scanner.nextInt();
		int resto = 0;

		int notas_100, notas_50, notas_20, notas_10, notas_5, notas_2, notas_1 = 0;
		notas_100 = valor / 100;
		resto = valor % 100;

		notas_50 = resto / 50;
		resto = resto % 50;

		notas_20 = resto / 20;
		resto = resto % 20;

		notas_10 = resto / 10;
		resto = resto % 10;

		notas_5 = resto / 5;
		resto = resto % 5;

		notas_2 = resto / 2;
		resto = resto % 2;

		notas_1 = resto;

		System.out.println(valor);
		System.out.println(notas_100 + " nota(s) de R$ 100,00");
		System.out.println(notas_50 + " nota(s) de R$ 50,00");
		System.out.println(notas_20 + " nota(s) de R$ 20,00");
		System.out.println(notas_10 + " nota(s) de R$ 10,00");
		System.out.println(notas_5 + " nota(s) de R$ 5,00");
		System.out.println(notas_2 + " nota(s) de R$ 2,00");
		System.out.println(notas_1 + " nota(s) de R$ 1,00");
		
	}
}
