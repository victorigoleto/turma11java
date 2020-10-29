CREATE DATABASE db_cidade_das_carnes;

use db_cidade_das_carnes;

CREATE TABLE tb_categoria(
	id_categoria int primary key not null auto_increment,
    tipo_categoria enum('Carne Vermelha', 'Carne Branca'),
    qualidade_categoria enum('Primeira', 'Segunda', 'Terceira')
    );

CREATE TABLE tb_produto(
	id_produto int primary key not null auto_increment,
    nome_produto varchar(30) not null,
    marca_produto varchar(30) not null,
    peso_produto float not null,
    preco_produto double not null,
    id_categoria int,
	CONSTRAINT fk_categoria FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria)
    );
    
INSERT INTO tb_categoria (tipo_categoria, qualidade_categoria) VALUES
	('Carne Vermelha', 'Primeira'),
    ('Carne Vermelha', 'Segunda'),
    ('Carne Vermelha', 'Terceira'),
    ('Carne Branca', 'Primeira'),
    ('Carne Branca', 'Segunda');

INSERT INTO tb_produto (nome_produto, marca_produto, peso_produto, preco_produto, id_categoria) VALUES
	('Filé mignon', 'Friboi', 30.54, 150.60, 1),
	('Alcatra', 'Seara', 15.00, 25.00, 2),
	('Acem com Osso', 'Novicarnes', 10.00, 15.00, 3),
	('Filé de Frango', 'Sadia', 15.00, 13.00, 4),
	('Asa', 'Perdigão', 25.00, 20.00, 5),
	('Picanha', 'Swift', 50.00, 160.00, 1),
	('Fraldinha', 'Angus', 30.00, 80.00, 2),
	('Carne Moida', 'Novicarnes', 10.00, 11.00, 3);

SELECT * FROM tb_produto WHERE tb_produto.preco_produto > 50;

SELECT * FROM tb_produto WHERE tb_produto.preco_produto >= 3 and tb_produto.preco_produto <= 60;

SELECT * FROM tb_produto WHERE tb_produto.nome_produto LIKE '%CO%';
    
    

