#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int compare(const void * a, const void * b) {
    return (strcmp((char *) a, (char *) b));
}

int main()
{
    char nome[100][21];
    int N, K, i;
    scanf("%d %d", &N, &K);
    for (i = 0; i < N; i++) {
        scanf("%s", nome[i]);
    }
    qsort(nome, N, sizeof(nome[0]), compare);
    printf("%s\n", nome[K-1]);
    return 0;
}
