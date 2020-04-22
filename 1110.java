import java.util.Scanner;
import java.util.ArrayDeque;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        ArrayDeque<Integer> fila = new ArrayDeque<>();
        ArrayDeque<Integer> fila_impressao = new ArrayDeque<>();
        
        int num = scanner.nextInt();
        int j = 0;
        int cont = 0;
        int carta;
        int remanescente = 0;
        while (num != 0) {
            for (int i = 1; i <= num; i++) {
                fila.addLast(i);
            }
            while (cont < num) {
                fila_impressao.addLast(fila.removeFirst());
                if (!fila.isEmpty()) {
                    carta = fila.removeFirst();
                    fila.addLast(carta);
                }
                cont++;
            }
            System.out.print("Discarded cards:");
            imprimir(cont, fila_impressao);
            num = scanner.nextInt();
            fila.clear();
            fila_impressao.clear();
            cont = 0;
        }
    }
    
    public static void imprimir(int cont, ArrayDeque<Integer> fila_impressao) {
        for (int i = 0; i < cont; i++) {
            if (cont == 1) {
                System.out.println("");
                System.out.println("Remaining card: " + fila_impressao.removeFirst());
            }
            else {
                if (i < (cont - 2)) {
                    System.out.print(" " + fila_impressao.peek() + ",");
                    fila_impressao.removeFirst();
                }
                else if (i < (cont - 1)) {
                    System.out.print(" " + fila_impressao.peek());
                    fila_impressao.removeFirst();
                }
                else {
                    System.out.println("");
                    System.out.println("Remaining card: " + fila_impressao.removeFirst());
                }
            }
        }
    }
}
