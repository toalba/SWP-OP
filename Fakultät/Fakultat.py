def fakurek(wert):
    if (wert==0):
        return 1
    
    return wert*fakurek(wert-1)

print(fakurek(10))