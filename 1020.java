import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		int ndias = scanner.nextInt();
		
		int anos = ndias / 365;
		int meses = (ndias % 365) / 30;
		int dias = ((ndias % 365) % 30);

		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
	}
}
