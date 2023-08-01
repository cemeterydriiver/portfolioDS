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