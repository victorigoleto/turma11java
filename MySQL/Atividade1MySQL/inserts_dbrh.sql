CREATE DATABASE db_rh;

use db_rh;

CREATE TABLE funcionarios (
	re int not null auto_increment,
    nome varchar(30) not null,
    nascimento date not null,
    salario double not null,
    setor varchar(30) not null,
    primary key (re)
    )engine=innodb;
    
INSERT INTO funcionarios (nome, nascimento, salario, setor) VALUES 
		('João Victor', '1997-01-03', 3500, 'TI'),
		('Astolfa', '1987-01-02', 1500, 'Almoxarifado'),
		('Josivaldo', '1965-02-05', 2000, 'Operação'),
		('Betania', '1970-03-04', 15000, 'Gerencia'),
		('Claudinelson', '1975-05-03', 2500, 'Recursos Humanos');
        
 SELECT * FROM funcionarios WHERE salario > 2000;
 SELECT * FROM funcionarios WHERE salario < 2000;