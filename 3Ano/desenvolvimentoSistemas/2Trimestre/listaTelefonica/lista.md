## Por que escolhi essa atividade?
> Escolhi essa atividade pois foi interessante de codificar

```js
function getTelefone(nome) {
   
    const telefones = {
      'Vitinho': '123456789',
      'Ash': '987654321',
      'Pedro': '555555555',
      'Felipe': '999999999'
    };
    

    if (nome in telefones) {
      return `O telefone de ${nome} é: ${telefones[nome]}`;
    } else {
      return `Não foi possível encontrar o telefone de ${nome}`;
    }
  }
  
  //Exemplo:
  nome = 'Ash';
  const telefone = getTelefone(nome);
  console.log(telefone); 
  ```