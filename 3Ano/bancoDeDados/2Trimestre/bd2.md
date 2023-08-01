# select

```sql
CREATE TABLE Clientes (
  id INT PRIMARY KEY,
  nome VARCHAR(50),
  email VARCHAR(50),
  telefone VARCHAR(15)
);
INSERT INTO Clientes (id, nome, email, telefone)
VALUES
  (20, 'ash', 'oemo@gmail.com', '(48) 9693-3325'),
  (21, 'vitinho', 'vitinho@gmail.com', '(22) 9876-5432'),
  (22, 'bernardo', 'bernardo@gmail.com', '(33) 5555-5555'),
  (15, 'daniel', 'daniel@gmail.com', '(44) 1234-5678'),
  (10, 'pedro', 'pedro@gmail.com', '(55) 9876-5432');


CREATE TABLE Pedidos (
  id INT PRIMARY KEY,
  cliente_id INT,
  produto VARCHAR(50),
  quantidade INT,
  FOREIGN KEY (cliente_id) REFERENCES Clientes(id)
);
INSERT INTO Pedidos (id, cliente_id, produto, quantidade)
VALUES
  (1, 20, 'Camiseta', 2),
  (2, 21, 'Calça', 1),
  (3, 22, 'Sapato', 1),
  (4, 15, 'Blusa', 3),
  (5, 10, 'Shorts', 2);

-- Atributos numéricos maiores que 20
SELECT *
FROM clientes
WHERE id > 20;

-- Atributos numéricos iguais a 15
SELECT *
FROM clientes
WHERE id = 15;

-- Ordenação crescente com números diferentes de 16
SELECT *
FROM clientes
WHERE id != 16
ORDER BY id ASC;

-- Ordenação decrescente de números
SELECT *
FROM clientes
ORDER BY id DESC;


```

# junção de tabelas

<a href="https://docs.google.com/document/d/1B7fu7XNim-TYQbHNyF0eiXipBP_sVtIse50e3zMsysM/edit">Atividade</a>
