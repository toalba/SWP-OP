def berechnesumreko(wert):
    if (wert>0):
        return wert +berechnesumreko(wert-1)
    else:
        return 0

def berechnesumita(wert):
    summe=0
    while wert>0:
        summe+=wert
        wert-=1
    return summe

print(berechnesumreko(10))
print(berechnesumita(10))