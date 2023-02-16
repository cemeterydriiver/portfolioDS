CREATE TABLE loja(
	CNPJ_PK VARCHAR(15) NOT NULL,
    cod_barras_fk VARCHAR(100) NOT NULL,
  	cnpj_fornecedor_fk VARCHAR(15) NOT NULL,
  	id_estoque_fk VARCHAR(15) not NULL,
  	cpf_vendedor_fk VARCHAR(15) not NULL,
  	cpf_cliente_fk VARCHAR(15) not NULL,
  	NOME VARCHAR(50) NOT NULL,
  	ENDERECO VARCHAR(100) NOT NULL,
	PRIMARY KEY(CNPJ_PK),
  	FOREIGN KEY(cod_barras_fk) REFERENCES produto(COD_BARRAS_pk),
  	FOREIGN KEY(id_estoque_fk) REFERENCES estoque(ID_ESTOQUE_PK),
  	FOREIGN KEY(cnpj_fornecedor_fk) REFERENCES fornecedor(CNPJ_FORNECEDOR_PK),
  	FOREIGN KEY(cpf_cliente_fk) REFERENCES cliente(cpf_cliente_pk),
  	FOREIGN KEY(cpf_vendedor_fk) REFERENCES vendedor(cpf_vendedor_pk)
);
INSERT INTO loja(CNPJ_PK, NOME, ENDERECO)
VALUES('12.345.678/0001-90', 'Loja', 'São José SC')
SELECT * from loja

 CREATE TABLE fornecedor(
  	CNPJ_LOJA_FK VARCHAR(15) not NULL,
    CNPJ_FORNECEDOR_PK VARCHAR(15) not NULL,
    nome VARCHAR(50) not NULL,
    localizacao VARCHAR(100) not NULL,
    primary key(CNPJ_FORNECEDOR_PK),
   	FOREIGN KEY(CNPJ_LOJA_FK) REFERENCES loja(CNPJ_PK)
  );
INSERT INTO fornecedor(CNPJ_FORNECEDOR_PK, nome, localizacao)
VALUES('12.345.678/0001-90', 'Fornecedor', 'São José SC')
SELECT * from fornecedor

CREATE TABLE estoque(
  	cnpj_loja_fk VARCHAR(15) not NULL,
    cod_barras_fk VARCHAR(100) NOT NULL,
    ID_ESTOQUE_PK VARCHAR(15) not NULL,
    CNPJ_LOJA_FK VARCHAR(15) not NULL,
    qntd VARCHAR(100) not NULL,
    primary key(ID_ESTOQUE_PK),
    FOREIGN KEY(cod_barras_fk) REFERENCES produto(COD_BARRAS_pk),
    FOREIGN KEY(CNPJ_LOJA_FK) REFERENCES loja(CNPJ_PK)
  ); 
INSERT INTO estoque(ID_ESTOQUE_PK, quantidade)
VALUES('1', '100'),
SELECT * from estoque

CREATE TABLE produto(
    COD_BARRAS_pk VARCHAR(100) NOT NULL,
    cpf_cliente_fk VARCHAR(15) not NULL,
    qntd VARCHAR(100) NOT NULL,
    descricao VARCHAR(100) not NULL,
    valor VARCHAR(100) NOT NULL,
    PRIMARY KEY(COD_BARRAS_pk),
    FOREIGN KEY(cpf_cliente_fk) REFERENCES cliente(cpf_cliente_pk)
);
  INSERT INTO produto(COD_BARRAS_PK, qntd, descricao, valor)
  VALUES('7895491353772', '15', 'Bota demonia', '150'),
  SELECT * from produto

create TABLE vendedor(
	CPF_vendedor_pk VARCHAR(15) not NULL,
  	CNPJ_LOJA_FK VARCHAR(15) not NULL,
  	id_venda_fk VARCHAR(15) not NULL,
  	nome VARCHAR(50) not NULL,
  	telefone VARCHAR(15) not NULL,
  	PRIMARY KEY(CPF_vendedor_pk),
  	FOREIGN KEY(CNPJ_LOJA_FK) REFERENCES loja(CNPJ_PK),
  	FOREIGN KEY(id_venda_fk) REFERENCES venda(ID_VENDA_PK)
);
INSERT INTO vendedor(cpf_vendedor_pk, nome, telefone)
VALUES('12345678901', 'fornecedor', '5548940028922'),
SELECT * from vendedor

CREATE TABLE venda(
	ID_VENDA_PK VARCHAR(15) not NULL,
  	cod_barras_fk VARCHAR(100) NOT NULL,
  	cpf_cliente_fk VARCHAR(15) not NULL,
  	cpf_vendedor_pk VARCHAR(15) not NULL,
  	valor VARCHAR(15) not NULL,
  	PRIMARY KEY(ID_VENDA_PK),
  	FOREIGN KEY(cod_barras_fk) REFERENCES produto(COD_BARRAS_pk),
  	FOREIGN KEY(cpf_cliente_fk) REFERENCES cliente(cpf_cliente_pk),
  	FOREIGN KEY(cpf_vendedor_fk) REFERENCES vendedor(cpf_vendedor_pk)
);
INSERT INTO venda(ID_VENDA_PK, valor)
VALUES('01', '150'),
SELECT * from venda
  
CREATE TABLE cliente(
	cpf_cliente_pk VARCHAR(15) not NULL,
  	cod_barras_fk VARCHAR(100) NOT NULL,
  	CNPJ_LOJA_FK VARCHAR(15) not NULL,
  	id_compra_fk VARCHAR(15) not NULL,
  	id_venda_fk VARCHAR(15) not NULL,
    telefone VARCHAR(15) not NULL,
  	nome VARCHAR(50) not NULL,
  	PRIMARY KEY(cpf_cliente_pk),
  	FOREIGN KEY(cod_barras_fk) REFERENCES produto(COD_BARRAS_pk),
  	FOREIGN KEY(CNPJ_LOJA_FK) REFERENCES loja(CNPJ_PK),
  	FOREIGN KEY(id_compra_fk) REFERENCES compra(id_compra_pk),
  	FOREIGN KEY(id_venda_fk) REFERENCES venda(ID_VENDA_PK)
);

INSERT INTO cliente(cpf_cliente_pk, telefone, nome)
VALUES('12345678901', '554840028922', 'ash'),
SELECT * from cliente

CREATE TABLE compra (
	id_compra_pk VARCHAR(15) not NULL,
  	cpf_cliente_fk VARCHAR(15) not NULL,
  	valor VARCHAR(10) NOT NULL,
  	PRIMARY KEY(id_compra_pk),
  	FOREIGN KEY(cpf_cliente_fk) REFERENCES cliente(cpf_cliente_pk)
);

INSERT INTO cliente(id_compra_pk, valor)
VALUES('01', '150'),
SELECT * from compra
