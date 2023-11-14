## Códigos feitos para a atividade de escolha de monitor

## Por que escolhi essa atividade?
> Escolhi essa atividade pois foi legal realizar os desafios propostos.

## atividade 1
Crie um programa que gere uma sequência de números aleatórios e exiba-os no console. A função deve permitir que seja definido o tamanho da sequência e o intervalo de números a serem gerados.

Dicas:

Use a função Math.random() para gerar números aleatórios entre 0 e 1.
Utilize a função Math.floor() para arredondar os números para baixo.

```js

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
```

## atividade 2
```js
function contarPalavras(texto) {
    texto = texto.trim();
    if (texto === '') {
      return 0;
    }
    var palavras = texto.split(/\s+/);
    return palavras.length;
  }
  
  
  var textoExemplo = 'Eu odeio JavaScript';
  var numeroPalavras = contarPalavras(textoExemplo);
  console.log(numeroPalavras);
  ```

  ## atividade 3
  ```js
  function verificaPrimo(n){
    if (n <= 1){
        return false
    }
    for ( var i = 2; i <=Math.sqrt(n); i++){
        if ( n % i === 0){
            return false
        }
    }
    return true
}
```

## atividade 4
```js
function verificarPalindromo(palavra) {
    palavra = palavra.toLowerCase().replace(/\s/g, '');
  
    var tamanho = palavra.length;
    var metade = Math.floor(tamanho / 2);
  
    for (var i = 0; i < metade; i++) {
      if (palavra[i] !== palavra[tamanho - 1 - i]) {
        return false;
      }
    }
  
    return true;
  }
  
  var palavraExemplo = 'arara';
  
  if (verificarPalindromo(palavraExemplo)) {
    console.log(palavraExemplo + ' é um palíndromo.');
  } else {
    console.log(palavraExemplo + ' não é um palíndromo.');
  }
  ```

  ## atividade 5

```js
function ordenarLista(lista) {
  var tamanho = lista.length;
  var trocou;

  do {
    trocou = false;
    for (var i = 0; i < tamanho - 1; i++) {
      if (lista[i] > lista[i + 1]) {
        var temp = lista[i];
        lista[i] = lista[i + 1];
        lista[i + 1] = temp;
        trocou = true;
      }
    }
  } while (trocou);

  return lista;
}

// Exemplo
var numeros = [10, 5, 8, 2, 1];
var numerosOrdenados = ordenarLista(numeros);
console.log(numerosOrdenados);
```