lista = input().split(' ')
HI = int(lista[0])
MI = int(lista[1])
HF = int(lista[2])
MF = int(lista[3])
if HI < HF:
    if MI == MF:
        horas = HF - HI
        minutos = MF - MI
    elif MI < MF:
        horas = HF - HI
        minutos = MF - MI
    elif MI > MF:
        horas = (HF-HI) - 1
        minutos = 60 - (MI-MF)
elif HI == HF:
    if MI == MF:
        horas = 24
        minutos = 0
    elif MI < MF:
        horas = 0
        minutos = MF-MI
    elif MI > MF:
        horas = 23
        minutos = 60 - (MI-MF)
elif HI > HF:
    if MI == MF:
        horas = 24 - (HI-HF)
        minutos = MF - MI
    elif MI < MF:
        horas = 24 - (HI-HF)
        minutos = MF - MI
    elif MI > MF:
        horas = 24 - (HI-HF) - 1
        minutos = 60 - (MI - MF)
print('O JOGO DUROU {} HORA(S) E {} MINUTO(S)'.format(horas, minutos))
