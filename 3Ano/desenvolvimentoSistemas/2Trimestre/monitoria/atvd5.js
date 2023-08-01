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
