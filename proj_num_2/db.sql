CREATE TABLE contatos (
	id SERIAL PRIMARY KEY,
	nome VARCHAR (30) NOT NULL,
	email VARCHAR (30),
	numero_cel VARCHAR (15)
);	
	DROP TABLE contatos;
	SELECT * FROM contatos; 
	
CREATE TABLE endereco (
	id SERIAL PRIMARY KEY,
	rua VARCHAR (30),
	cidade VARCHAR (30),
	estado VARCHAR (30)
);

ALTER TABLE endereco RENAME TO enderecos;

CREATE TABLE lista_contatos (
	id SERIAL PRIMARY KEY,
	id_contatos INT REFERENCES contatos (id),
	id_enderecos INT REFERENCES enderecos (id)
);

SELECT * FROM contatos 
LEFT JOIN lista_contatos ON contatos.id = lista_contatos.id_contatos;

SELECT * FROM lista_contatos;


INSERT INTO contatos (nome, email, numero_cel) VALUES ('Edgar Mendes', 'edgar@gmail.com', '(11) 94321-2343');
INSERT INTO enderecos (rua, cidade, estado) VALUES ('Av.das Estrelas', 'Mogi', 'São Paulo');
INSERT INTO lista_contatos (id_contatos, id_enderecos) VALUES (1, 1);

SELECT *
FROM lista_contatos
JOIN contatos ON lista_contatos.id = contatos.id
JOIN enderecos ON contatos.id = enderecos.id;


	