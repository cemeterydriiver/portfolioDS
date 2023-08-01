
function gerarRandom (tamanho, min, max){
    var seq = []
    for (var i = 0; i < tamanho; i++){
        var n = Math.floor(Math.random() * (max - min + 1)) + min
        seq.push(n)
    }
    return seq
}

//exemplo:
var tamanho = 10
var min = 1
var max = 100

var exemplo = gerarRandom(tamanho, min, max)
console.log(exemplo)



