# __Autoria segundo trimestre do terceiro ano__
_Esta autoria é composta por tabelas e códigos SQL, que estão sendo passadas da 1FN até a 2FN._
> Base de dados utilizada como exemplo: [CLIQUE AQUI](https://www.kaggle.com/datasets/chaditya95/epileptic-seizures-dataset).


__Passando para a 2FN:__

| ID_Paciente | X1 | X2 | X3 | X4 | X5 | X6 | X7 | X8 | X9 | X10 | X11 | X12 | X13 | X14 | X15 | X16 | y |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | -0.0069 | 0.0009 | 0.0034 | -0.0054 | -0.0052 | -0.0096 | 0.0033 | -0.0096 | 0.0053 | -0.0096 | -0.0038 | -0.0049 | -0.0048 | -0.0046 | -0.0042 | -0.0043 | -0.0042 | 1 |
| 2 | -0.0052 | 0.0017 | 0.0046 | -0.0046 | -0.0044 | -0.0077 | 0.0015 | -0.0074 | 0.0032 | -0.0073 | -0.0018 | -0.0025 | -0.0035 | -0.0035 | -0.0033 | -0.0031 | -0.0033 | 1 |
| 3 | -0.0065 | 0.0005 | 0.0031 | -0.0044 | -0.0044 | -0.0084 | 0.0018 | -0.0089 | 0.0022 | -0.0083 | -0.001 | -0.0016 | -0.0025 | -0.0033 | -0.0025 | -0.0025 | -0.0025 | 1 |
| 4 | -0.0065 | 0.0005 | 0.0031 | -0.0044 | -0.0044 | -0.0084 | 0.0018 | -0.0089 | 0.0022 | -0.0083 | -0.001 | -0.0016 | -0.0025 | -0.0033 | -0.0025 | -0.0025 | -0.0025 | 0 |
| 5 | -0.0065 | 0.0005 | 0.0031 | -0.0044 | -0.0044 | -0.0084 | 0.0018 | -0.0089 | 0.0022 | -0.0083 | -0.001 | -0.0016 | -0.0025 | -0.0033 | -0.0025 | -0.0025 | -0.0025 | 0 |

__Código SQL:__

```
-- Cria tabela "Paciente"
CREATE TABLE Paciente (
    ID_Paciente INT PRIMARY KEY,
    y INT
);

-- Cria tabela "Sinais_EEG"
CREATE TABLE Sinais_EEG (
    ID_Sinal INT PRIMARY KEY,
    ID_Paciente INT,
    X1 FLOAT,
    X2 FLOAT,
    X3 FLOAT,
    X4 FLOAT,
    X5 FLOAT,
    X6 FLOAT,
    X7 FLOAT,
    X8 FLOAT,
    X9 FLOAT,
    X10 FLOAT,
    X11 FLOAT,
    X12 FLOAT,
    X13 FLOAT,
    X14 FLOAT,
    X15 FLOAT,
    X16 FLOAT,
    FOREIGN KEY (ID_Paciente) REFERENCES Paciente(ID_Paciente)
);
```

__Pasando para a 3FN:__



**Tabela Paciente**

| ID_Paciente | y |
|-------------|---|
| 1000        | 1 |
| 1001        | 1 |
| 1002        | 1 |


**Tabela Sinal EEG**

| ID_Sinal | X1      | X2      | X3      | X4      | X5      | X6      | X7      |
|----------|---------|---------|---------|---------|---------|---------|---------|
| 1        | 0.05198 | 0.26296 | 0.26296 | 0.31197 | 0.24468 | 0.22652 | 0.21526 |
| 2        | 0.77589 | 0.60087 | 0.42218 | 0.18650 | 0.07859 | 0.00101 | -0.08016 |
| 3        | 0.03725 | 0.07345 | 0.06928 | 0.06313 | 0.05626 | 0.06150 | 0.05751 |


**Tabela Sinais Paciente**

| ID_Paciente | ID_Sinal |
|-------------|----------|
| 1000        | 1        |
| 1000        | 2        |
| 1000        | 3        |


__Código SQL:__


```
-- Criar tabela Paciente
CREATE TABLE Paciente (
    ID_Paciente INT PRIMARY KEY,
    y INT NOT NULL
);

-- Inserir registro na tabela Paciente
INSERT INTO Paciente (ID_Paciente, y) VALUES (1000, 1);

-- Criar tabela Tipo_Epilepsia
CREATE TABLE Tipo_Epilepsia (
    ID_Tipo_Epilepsia INT PRIMARY KEY,
    Descricao VARCHAR(50) NOT NULL
);

-- Inserir registro na tabela Tipo_Epilepsia
INSERT INTO Tipo_Epilepsia (ID_Tipo_Epilepsia, Descricao) VALUES (1, 'Epilepsia do Lobo Temporal');

-- Criar tabela Sinal_EEG
CREATE TABLE Sinal_EEG (
    ID_Sinal INT PRIMARY KEY,
    X1 FLOAT NOT NULL,
    X2 FLOAT NOT NULL,
    X3 FLOAT NOT NULL,
    X4 FLOAT NOT NULL,
    X5 FLOAT NOT NULL,
    X6 FLOAT NOT NULL,
    X7 FLOAT NOT NULL
);

-- Inserir registro na tabela Sinal_EEG
INSERT INTO Sinal_EEG (ID_Sinal, X1, X2, X3, X4, X5, X6, X7) 
VALUES (1, 0.05198, 0.26296, 0.26296, 0.31197, 0.24468, 0.22652, 0.21526);

-- Criar tabela Sinais_Paciente
CREATE TABLE Sinais_Paciente (
    ID_Paciente INT,
    ID_Sinal INT,
    PRIMARY KEY (ID_Paciente, ID_Sinal),
    FOREIGN KEY (ID_Paciente) REFERENCES Paciente(ID_Paciente),
    FOREIGN KEY (ID_Sinal) REFERENCES Sinal_EEG(ID_Sinal)
);

-- Inserir registro na tabela Sinais_Paciente
INSERT INTO Sinais_Paciente (ID_Paciente, ID_Sinal) VALUES (1000, 1);
```





