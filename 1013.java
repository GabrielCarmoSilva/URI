import java.io.IOException;			
import java.util.Scanner;

	public class Main {
		public static void main(String[] args) throws IOException {
			
			Scanner scanner = new Scanner(System.in);

			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			int maior = (a + b + (Math.abs(a - b))) / 2;

			int maior2 = (c + maior + (Math.abs(c - maior))) / 2;

			System.out.println(maior2 + " eh o maior");

	}
}
