lista = []
N = int(input())
i = 0
while (i < N):
    lista.append(int(input()))
    i += 1
nova_lista = list(set(lista))
print(len(nova_lista))
