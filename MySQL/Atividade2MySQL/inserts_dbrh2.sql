CREATE DATABASE db_RH2;

use db_RH2;


CREATE TABLE tb_cargo ( 
	id_cargo int primary key not null auto_increment,
    nome_cargo varchar(30),
    setor_cargo varchar(30)
    );


CREATE TABLE tb_funcionarios (
	re_fn int primary key not null auto_increment,
    nome_fn varchar(30) not null,
    nascimento_fn date not null,
    salario_fn double not null,
    sexo_fn enum('M','F'),
	id_cargo integer,
    CONSTRAINT fk_cargo FOREIGN KEY (id_cargo) REFERENCES tb_cargo (id_cargo)
    );
    
INSERT INTO tb_cargo (nome_cargo, setor_cargo) VALUES 
		('Desenvolvedor Java Jr', 'TI - Desenvolvimento'),
		('Suporte Técnico', 'TI - Suporte'),
		('Desenvolvedor Full Stack', 'TI - Desenvolvimento'),
		('Desenvolvedor Back End', 'TI - Desenvolvimento'),
		('Desenvolvedor Front End', 'TI - Desenvolvimento');
        
INSERT INTO tb_funcionarios (nome_fn, nascimento_fn, salario_fn, sexo_fn, id_cargo) VALUES 
		('Victor Rigoleto', '1997-01-01', 6500, 'M', 3),
		('Matheus Thorok', '1997-06-26', 1800, 'M', 1),
		('Natália Moreno', '1995-04-15', 4500, 'F', 4),
		('Carla Cristina', '1992-03-26', 3000, 'F', 5),
		('Bruno Sousa', '1987-05-01', 2000, 'M', 2),
		('Cleiton Ortega', '1999-02-03', 2000, 'M', 1),
		('Bruno Costa', '1996-01-06', 6500, 'M', 3),
		('Sarah Braia', '1995-07-03', 3000, 'F', 5),
		('Victor Tavares', '1994-03-02', 4500, 'M', 4),
		('Gabriel Ritter', '1992-04-02', 2500, 'M', 2),
		('Vivian Nakano', '1997-03-01', 3000, 'F', 5),
		('Zaine Queiros', '1989-03-01', 1900, 'F', 1),
		('Guilherme Silva', '2000-05-15', 6500, 'M', 3),
		('Christian Garcia', '1996-04-10', 4500, 'M', 4),
		('Matheus Fernandes', '1995-02-15', 1700, 'M', 2);

 SELECT * FROM tb_funcionarios WHERE salario_fn > 2000;
 
 SELECT * FROM tb_funcionarios WHERE salario_fn <= 2000 and salario_fn >= 1000;
 
 SELECT * FROM tb_funcionarios WHERE nome_fn LIKE 'C%';
        