import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Queue<Character> fila = new LinkedList<>();
        
        int time1, time2;
        int j = 0;
        char letra = 65, letra2;
        char chave1, chave2;
        char aux[] = new char[4];

        //Oitavas de final
        for (int i = 0; i < 8; i++) {
            time1 = scanner.nextInt();
            time2 = scanner.nextInt();
            letra2 = (char) ((char) letra + 1);
            if (time1 > time2) {
                fila.add(letra);
            } else {
                fila.add(letra2);
            }
            letra += 2;
        }
        
        //Quartas de final
        for (int i = 0; i < 4; i++) {
            chave1 = fila.peek();
            fila.remove();
            chave2 = fila.peek();
            fila.remove();
            time1 = scanner.nextInt();
            time2 = scanner.nextInt();
            if (time1 > time2) {
                aux[j] = chave1;
            } else {
                aux[j] = chave2;
            }
            j++;
        }
        j = 0;
        for (int i = 0; i < 4; i++) {
            fila.add(aux[i]);
            aux[i] = 0;
        }

        //Semi-final
        for (int i = 0; i < 2; i++) {
            chave1 = fila.peek();
            fila.remove();
            chave2 = fila.peek();
            fila.remove();
            time1 = scanner.nextInt();
            time2 = scanner.nextInt();
            if (time1 > time2) {
                aux[j] = chave1;
            } else {
                aux[j] = chave2;
            }
            j++;
        }
        j = 0;
        for (int i = 0; i < 2; i++) {
            fila.add(aux[i]);
            aux[i] = 0;
        }
        
        //Final
        chave1 = fila.remove();
        chave2 = fila.remove();
        time1 = scanner.nextInt();
        time2 = scanner.nextInt();
        if (time1 > time2) {
            fila.add(chave1);
        } else {
            fila.add(chave2);
        }
        
        //Campeão
        System.out.println(fila.peek());
    }
}    
