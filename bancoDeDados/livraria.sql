CREATE TABLE livro(
  genero VARCHAR(100) not NULL,
  autor VARCHAR(100) not NULL,
  ISBN_PK VARCHAR(13) not NULL,
  editora VARCHAR(100) not NULL,
  titulo VARCHAR(100) not NULL,
  PRIMARY KEY (ISBN_PK)
  )