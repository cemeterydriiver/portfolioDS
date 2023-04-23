
# 🎲Fundamentos de banco de dados

Aqui você encontrará algumas atividades sobre fundamentos de banco de dados, realizadas no primeiro ano do técnico em desenvolvimento de sistemas.


## Atividades

- [Diagrama](https://github.com/cemeterydriiver/portfolioDS/blob/main/2Ano/fundamentoBancoDeDados/Diagrama%20sem%20nome.drawio)

- [Sql Lite](https://github.com/cemeterydriiver/portfolioDS/blob/main/2Ano/fundamentoBancoDeDados/dump.sqlite%20(1).sql):

```Sql
    CREATE TABLE cliente(
	CPF longtext NOT NULL,
  	produtosConsumidos longtext,
  	nome longtext,
  	nWhatsaap int,
  	PRIMARY KEY(CPF)
);
CREATE TABLE produto(
	id int NOT NULL,
  	preco decimal(2,2) NOT NULL,
  	ingredientes longtext NOT NULL,
  	tipo longtext NOT NULL,
  	nome longtext NOT NULL,
  	CPFCliente longtext NOT NULL,
  	CPFVendedor longtext NOT NULL,
	PRIMARY KEY(id)
);
CREATE TABLE vendedor(
	CPF longtext not NULL,
  	nome longtext not NULL,
  	vendas longtext not NULL,
  	salario Bigint not NULL,
  	telefone bigInt NOT NULL,
  PRIMARY KEY(CPF)
);
```

[Universidade]()







