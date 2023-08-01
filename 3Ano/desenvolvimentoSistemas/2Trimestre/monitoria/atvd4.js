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