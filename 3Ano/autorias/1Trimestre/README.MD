# __Autoria primeiro trimestre do terceiro ano__
_Esta autoria é composta por um diagrama de atividades e um teste de sistema._

> Tanto o diagrama de atividades e o teste de sistema são sobre [este repositório](https://github.com/cemeterydriiver/QRCode).

# 🏃 __Diagrama de atividades:__
![diagramaDeAtividadesQRCode drawio](https://user-images.githubusercontent.com/102593108/233812171-c39c5f49-c3f0-4ea6-bcc7-ba1db1c055d6.png)


# 📝 __Testes de sistema:__

## ✍️ __Nome do teste:__ 
> __Verificar geração de QR Code a partir de texto ou URL.__

## 🎯 __Objetivo:__ 
> __Verificar se a aplicação é capaz de gerar corretamente um QR Code a partir de um texto ou URL fornecido pelo usuário.__

## ⚠️ __Pré-condições:__

> __1. A aplicação QRCode está instalada e funcionando corretamente;__

> __2. O dispositivo utilizado possui câmera para leitura de QR Code.__

### 👣 __Passos:__

1. Abrir a aplicação QRCode.

2. Inserir uma URL para ser codificado em um QR Code.

3. Validar a URL inserido pelo usuário.

4. Gerar o QR Code a partir da URL.

5. Exibir o QR Code gerado na tela.

6. Verificar se o QR Code gerado contém a mesma URL inserido pelo usuário.

7. Salvar o QR Code gerado em um arquivo e verificar se é possível lê-lo com a função de leitura de QR Code.

8. Caso o usuário escolha "limpar", exluir o QR code.

### ✅ __Resultado esperado:__

- __No passo 1:__
  - A aplicação QRCode é aberta corretamente.
 
- __No passo 2:__
  - O usuário é capaz de inserir uma URL para ser codificada em um QR Code.
 
- __No passo 3:__
  - A URL inserido pelo usuário é validado corretamente, impedindo a geração de um QR Code inválido.
 
- __No passo 4:__
  - O QR Code é gerado corretamente a partir da URL inserido pelo usuário.
 
- __No passo 5:__
  - O QR Code gerado é exibido corretamente na tela da aplicação.
 
- __No passo 6:__
  - O QR Code gerado contém a mesma URL inserido pelo usuário.
 
- __No passo 7:__
  - O QR Code gerado é salvo corretamente em um arquivo e pode ser lido pela mesma aplicação através da leitura de QR Code.
 
## 👍 __Critérios de aceitação:__

> - O QR Code gerado contém a mesma URL inserido pelo usuário.
> - O QR Code gerado é legível pela mesma aplicação, através da leitura de QR Code.

## 🏛️ __Cenários de teste:__

### __Cenário de teste 1:__

- __Passo 2:__
  - Inserir o texto "Teste de geração de QR Code".
 
__✅ Resultado esperado:__

> - O QR Code gerado contém o texto "Teste de geração de QR Code".
> - O QR Code gerado é legível por um aplicativo de leitura de QR Code.

### __Cenário de teste 2:__

- __Passo 2:__
  - Inserir a URL "https://github.com/cemeterydriiver".
 
__✅ Resultado esperado:__

> - O QR Code gerado contém a URL "https://github.com/cemeterydriiver".
> - O QR Code gerado é legível por um aplicativo de leitura de QR Code.

### __Cenário de teste 3:__

- __Passo 3:__ 
  - Inserir o texto "Teste de geração de QR Code".
 
__✅ Resultado esperado:__

> - O texto é validado corretamente e a geração do QR Code é permitida.

### __Cenário de teste 4:__

- __Passo 3:__
  - Inserir o texto inválido "Teste de geração de QR Code com mais de 100 caracteres".
 
__✅ Resultado esperado:__

> - O texto é invalidado corretamente e a geração do QR Code é impedida

