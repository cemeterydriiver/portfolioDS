# Autoria 2º trimestre

# GoogleHero
> Como autoria do 2º trimestre, fiz um site simples que consume uma [API de heróis](https://superheroapi.com/).

## Sobre a autoria:
> O GoogleHero como o nome diz, é basicamente um Google de super-heróis. Aqui você pode pesquisar qualquer super-heróis e o site retornará o mesmo com os status do super-herói pesquisado, biografia, aparência e conexões.

# API de livro
> Como autoria fiz essa API simples de livros.
> Como fiz uma API simples não utilizei um banco de dados, apenas fiz um dicionário.

- **Buscar livros (geral):**
  - **/livros [GET]**

- **Buscar livros (id):**
  - **/livros/<int:id> [GET]**

- **Editar livros:**
  - **/livros/<int:id> [PUT]**
 
- **Adicionar livros:**
  - **/livros [POST]**
 
- **Deletar livros:**
  - **/livros/<int:id> [DELETE]**

```python
from flask import Flask, jsonify, request

app = Flask(__name__)

livros = [
    {
        'id': 1,
        'Titulo': 'Harry Potter e o calice de fogo',
        'Autor': 'J.K Rowling'
    },
    {
        'id': 2,
        'Titulo': 'Harry Potter e a pedra filosofal',
        'Autor': 'J.K Rowling'
    },
    {
        'id': 3,
        'Titulo': 'Harry Potter e as reliquias da morte',
        'Autor': 'J.K Rowling'
    },
]

@app.route('/livros',methods=['GET'])
def getBooks():
    return jsonify(livros)

@app.route('/livros/<int:id>',methods=['GET'])
def getBooksId(id):
    for livro in livros:
        if livro.get('id') == id:
            return jsonify(livro)

@app.route('/livros/<int:id>', methods=['PUT'])
def editBookId(id):
    editedBook = request.get_json()
    for i,b in enumerate(livros):
        if b.get('id') == id:
            b[i].update(editedBook)
            return jsonify(livros[i])
        
@app.route('/livros', methods=['POST'])
def addBook():
    newBook = request.get_json()
    livros.append(newBook)

    return jsonify(livros)

@app.route('/livros/<int:id>', methods=['DELETE'])
def deletBook(id):
    for i,b in enumerate(livros):
        if b.get('id') == id:
            del livros[i]

    return jsonify(livros)


app.run(port=5000,host='localhost', debug=True)
```
     
