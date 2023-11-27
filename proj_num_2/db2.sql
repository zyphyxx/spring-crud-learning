DROP TABLE contatos;
DROP TABLE enderecos;
DROP TABLE lista_contatos;

CREATE TABLE contatos (
	id SERIAL PRIMARY KEY,
	celular VARCHAR (20),
	email VARCHAR (30)
);

CREATE TABLE enderecos (
	id SERIAL PRIMARY KEY,
	rua VARCHAR (255),
	cidade VARCHAR (255),
	estado VARCHAR (255)
);

CREATE TABLE usuarios (
	id SERIAL PRIMARY KEY,
	nome VARCHAR (255) NOT NULL,
	contato INT REFERENCES contatos(id),
	endereco INT REFERENCES enderecos(id)
);
ALTER TABLE usuarios RENAME COLUMN contatos TO contato;
ALTER TABLE usuarios RENAME COLUMN enderecos TO endereco;


INSERT INTO usuarios (nome) values ( 'Edgar Mendes');
INSERT INTO contatos (celular, email) values ('(11) 943245623', 'edgar@gmail.com');
INSERT INTO enderecos (rua, cidade, estado) VALUES ('Estrelas', 'Constelaçoes', 'Galaxias');

SELECT * FROM usuarios;
SELECT * FROM contatos;
SELECT * FROM enderecos;
