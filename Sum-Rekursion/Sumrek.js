// used node js
function berechnersumrek(wert) {
    if (wert>0) {
        return wert +=berechnersumrek(wert-1)
    }
    else return 0
}
function berechnersumita(wert) {
    var sum = 0
    while (wert>0) {
        sum+=wert
        wert-=1
    }
    return sum
}

console.log(berechnersumrek(10))
console.log(berechnersumita(10))