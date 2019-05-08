import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        Pilha<Character> pilha = new Pilha<>();
        String expressao;
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean ok = false;
        scanner.nextLine();
        
        first: for (int k = 0; k < n; k++) {
             pilha.esvaziar();
             expressao = scanner.nextLine();
             char[] vet_expressao = expressao.toCharArray();
             if (!ehAbertura(vet_expressao[0])) {
                    System.out.println("N");
                    ok = false;
                    continue;
             }
             else {
                pilha.inserir(vet_expressao[0]);
            }
             second: for (int i = 1; i < vet_expressao.length; i++) {
                if (ehAbertura(vet_expressao[i])) {
                    pilha.inserir(vet_expressao[i]);
                    ok = true;
                }
                if (ehFechamento(vet_expressao[i])) {
                    if (pilha.estaVazia()) {
                        System.out.println("N");
                        continue first;
                    }
                    if (ehCorrespondente(pilha.inspecionar(), vet_expressao[i])) {
                        pilha.remover();
                        ok = true;
                    }
                    else {
                        System.out.println("N");
                        ok = false;
                        continue first;
                    }
                }
             }
            if (!pilha.estaVazia()) {
                System.out.println("N");
                ok = false;
            }
            if (ok) {
                System.out.println("S");
            }
        }
    }
    
    
    
    public static boolean ehAbertura(char c) {
        return c == '{' || c == '(' || c == '[';
    }
    
    public static boolean ehFechamento(char c) {
        return c == '}' || c == ')' || c == ']';
    }
    
    public static boolean ehCorrespondente(char abertura, char fechamento) {
        return (abertura == '{' && fechamento == '}') || (abertura == '(' && fechamento == ')') ||
                (abertura == '[' && fechamento == ']');
    }
    
}

class Pilha<Tipo> {
    
    private Stack<Tipo> pilha = new Stack<>();

    public boolean estaVazia() {
        return pilha.empty();
    }
    
    public void esvaziar() {
        pilha.clear();
    }
    
    public void inserir(Tipo item) {
        pilha.push(item);
    }
    
    public Tipo inspecionar() {
        return pilha.peek();
    }
    
    public Tipo remover() {
        return pilha.pop();
    }
}
