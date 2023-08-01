## Por que escolhi essa atividade?
> Escolhi essa atividade pois gostei de trabalhar com as alterações de tabelas.

```sql
DROP TABLE demo
CREATE TABLE usuario(
 email TEXT,
 senha VARCHAR(10),
 idade INT,
 altura DECIMAL(3,2),
 genero VARCHAR(1)
);
alter TABLE usuario ADD COLUMN usuario_pk VARCHAR(10)
ALTER TABLE usuario add PRIMARY KEY(usuario_pk)
alter TABLE usuario ADD COLUMN calendario_fg VARCHAR(10)
alter TABLE usuario ADD FOREIGN KEY(calendario_fg) REFERENCES calendario(calendariopk)
alter TABLE usuario ADD COLUMN peso_fk VARCHAR(10)
alter TABLE usuario ADD FOREIGN KEY(peso_fk) REFERENCES peso(Idpeso)

CREATE TABLE peso(
 peso DECIMAL(4,2),
 dataPeso DATE
);
alter TABLE peso ADD COLUMN idPeso VARCHAR(10)
ALTER TABLE peso add PRIMARY KEY(Idpeso)
ALTER TABLE peso ADD COLUMN categoria_fk VARCHAR(10)
ALTER TABLE peso add FOREIGN KEY(categoria_fk) REFERENCES categoria(idcategoria)


CREATE TABLE categoria(
 categoria TEXT,
 pesoMinNormal DECIMAL(4,2),
 pesoMaxNormal DECIMAL(4,2),
 difereca DECIMAL(2,1)
);
alter TABLE categoria ADD COLUMN idCategoria VARCHAR(10)
ALTER TABLE categoria add PRIMARY KEY(idCategoria)

CREATE TABLE calendario(
 dia INT,
 mes INT,
 ano INT,
 peso DECIMAL(4,2)
);
ALTER TABLE calendario add COLUMN calendarioPk VARCHAR(10)
ALTER TABLE calendario add PRIMARY KEY(calendariopk)
ALTER TABLE calendario add COLUMN peso_fk VARCHAR(10)
ALTER TABLE calendario add FOREIGN KEY(peso_fk) REFERENCES peso(idpeso)
ALTER TABLE calendario add COLUMN usuario_fk VARCHAR(10)
```