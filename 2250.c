#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define TAM 1001

typedef struct {
    char nome[16];
    int pontuacao[12];
    int soma_pontuacao;
} Jogador;

int compare_1(const void * a, const void * b) {
    if ( ((*(Jogador*)a).soma_pontuacao < (*(Jogador*)b).soma_pontuacao)) {
        return 1;
    } else if ( ((*(Jogador*)a).soma_pontuacao > (*(Jogador*)b).soma_pontuacao)) {
        return -1;
    } else if ( ((*(Jogador*)a).soma_pontuacao == (*(Jogador*)b).soma_pontuacao)) {
        a = (strcmp((*(Jogador *) a).nome, (*(Jogador *) b).nome));
        return a;
    }
     return 0;
}

int compare_2(const void * a, const void * b) {
    if ( *(int*)a > *(int*)b) {
        return 1;
    }
    else if ( *(int*)a > *(int*)b) {
        return -1;
    }
    else return 0;
}

int main() {
    Jogador jogadores[TAM];
    int J, i, k, n=1;
    scanf("%d", &J);
    while (J > 0) {
        for (i = 0; i < J; i++) {
            scanf("%s", &jogadores[i].nome);
            jogadores[i].soma_pontuacao = 0;
            for (k = 0; k < 12; k++) {
                scanf("%d", &jogadores[i].pontuacao[k]);
            }
            qsort(jogadores[i].pontuacao, 12, sizeof(jogadores[i].pontuacao[0]), compare_2);
            for (k = 0; k < 12; k++) {
                if (k != 0 && k != 11) {
                    jogadores[i].soma_pontuacao += jogadores[i].pontuacao[k];
                }
            }
        }
        qsort(jogadores, J, sizeof(jogadores[0]), compare_1);
        printf("Teste %d\n", n);
        i = 0;
        int indice = i + 1;
        while (i < J) {
            if (i == 0 || jogadores[i].soma_pontuacao != jogadores[i-1].soma_pontuacao) {
                printf("%d", i+1);
                indice = i + 1;
            }
            else if (jogadores[i].soma_pontuacao == jogadores[i-1].soma_pontuacao) {
                printf("%d", indice);
            }
            printf(" %d", jogadores[i].soma_pontuacao);
            printf(" %s", jogadores[i].nome);
            printf("\n");
            i++;
        }
        printf("\n");
        scanf("%d", &J);
        n++;
    }
}
