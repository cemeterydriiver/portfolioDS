## Por que escolhi essa atividade?
> Escolhi essa atividade pois gostei de trabalhar com o serial.

```sql
DROP TABLE demo
CREATE TABLE cadastro(
telefone VARCHAR(11) not NULL,
  senha VARCHAR(20) not NULL,
  nome VARCHAR(20) not NULL,
  email_PK VARCHAR(45) not NULL,
  PRIMARY KEY(email_PK)
)
alter TABLE cadastro ADD COLUMN login_FK VARCHAR(20)
alter TABLE cadastro ADD FOREIGN KEY(login_fk) REFERENCES login(login_pk)
INSERT INTO cadastro (telefone, senha, nome, email_pk)
VALUES ('11111111111', 'senhaumm', 'Cleiton Rasta', 'rastinhadj@gmail.com'),
  ('66666666666', 'trintapraum', 'tue gnomio', 'cuidadotuegnomio@gmail.com')
SELECT * from cadastro

CREATE TABLE login(
login_PK VARCHAR(20) not NULL,
  senha VARCHAR(20) NOT NULL,
  PRIMARY KEY(login_PK)
)
INSERT INTO login (login_pk, senha)
VALUES ('vitinho', 'eitasenha'),
  ('ash', 'catapimbas')
SELECT * from login

alter TABLE login ADD COLUMN email_fk VARCHAR(20)
alter TABLE login ADD FOREIGN KEY(email_fk) REFERENCES cadastro(email_pk)

CREATE TABLE pets(
  pesokg DECIMAL(5,3),
  nascimento DATE not NULL,
  raca VARCHAR(30) not NULL,
  tipo VARCHAR(20) not NULL,
  nome VARCHAR(30) not NULL,
  PK_idPet serial,
  PRIMARY KEY(PK_idPet)
)
INSERT into pets (pesokg, nascimento, raca, tipo, nome)
VALUES (00.098, '2009-05-10', 'calopsita', 'pássaro', 'Dj Cleiton Rasta'),
      (07.545, '2005-02-18', 'dachshund', 'cachorro', 'Toninho'),
           (09.014, '2005-05-10', 'dachshund', 'cachorro', 'Porronto')
  SELECT * from pets

alter TABLE pets ADD COLUMN tipo_FK VARCHAR(20)
alter TABLE pets ADD FOREIGN KEY(tipo_fk) REFERENCES rotina(tipo_pk)
alter TABLE pets ADD COLUMN fk_nome VARCHAR(20)
alter TABLE pets ADD FOREIGN KEY(fk_nome) REFERENCES eventos(pk_nome)
alter TABLE pets ADD COLUMN tipovacina_fk VARCHAR(20)
alter TABLE pets ADD FOREIGN KEY(tipovacina_fk) REFERENCES vacina(tipo_pk)

CREATE TABLE rotina(
  afazeres TEXT not NULL,
  tipo_PK VARCHAR(10) not NULL,
  periodo VARCHAR(10) not NULL,
  PRIMARY KEY(tipo_PK)
)
INSERT INTO rotina (afazeres, tipo_pk, periodo)
VALUES('Comer, água, xixi & cocô', 'dia a dia', 'Matutina'),
     ('Correr e brincar com amigos no parque','Exercícios','Vespertina'),
          ('Soninho de beleza','Descanso','Verpertina')
          SELECT * from rotina
          
alter TABLE rotina ADD COLUMN fk_nome VARCHAR(20)
alter TABLE rotina ADD FOREIGN KEY(fk_nome) REFERENCES eventos(pk_nome)
alter TABLE rotina ADD COLUMN fk_idPet serial
alter TABLE rotina ADD FOREIGN KEY(fk_idPet) REFERENCES pets(pk_idpet)

CREATE TABLE eventos(
  urgencia VARCHAR(10) not NULL,
  hora TIME not NULL,
  dia DATE not NULL,
  PK_nome VARCHAR(20) not NULL,
  PRIMARY KEY(PK_nome)
)
INSERT into eventos(urgencia, hora, dia, pk_nome)
VALUES('Alta', '09:30:00','2023-03-14', 'Passear Porronto'),
     ('Comum', '21:00:00', '2023-05-10', 'Aniversário Porronto'),
          ('baixa', '12:00:00', '2023-03-16', 'Almoço especial')
 SELECT * from eventos

alter TABLE eventos ADD COLUMN fk_tipo VARCHAR(20)
alter TABLE eventos ADD FOREIGN KEY(fk_tipo) REFERENCES rotina(tipo_pk)
alter TABLE eventos ADD COLUMN fk_idPets serial
alter TABLE eventos ADD FOREIGN KEY(fk_idPets) REFERENCES pets(pk_idpet)

CREATE TABLE vacina(
  vacinasPendentes TEXT not NULL,
  vacinasTomadas TEXT not NULL,
  tipo_PK VARCHAR(15) not NULL,
  PRIMARY KEY(tipo_PK)
);

INSERT INTO vacina(vacinasPendentes, vacinasTomadas, tipo_PK)
VALUES('Cinomose', 'Parvovirose', 'Cão'),
      ('Antirrábica', 'Clamidiose', 'Gato');

SELECT * FROM vacina;

alter TABLE vacina ADD COLUMN fk_idPets serial
alter TABLE vacina ADD FOREIGN KEY(fk_idPets) REFERENCES pets(pk_idpet)
```