import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int i;
        for (i = 0; i < 10; i++) {
            vetor[i] = x;
            x *= 2;
        }
        for (i = 0; i < 10; i++) {
            System.out.println("N[" + i + "] = " + vetor[i]);
        }
    
    
    }
}
