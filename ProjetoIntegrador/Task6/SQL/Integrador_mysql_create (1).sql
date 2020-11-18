CREATE TABLE `Produto` (
	`id_produto` INT(255) NOT NULL AUTO_INCREMENT,
	`Nome` varchar(255) NOT NULL,
	`Tamanho` varchar(255) NOT NULL,
	`Quantidade` INT NOT NULL,
	`Preco` DECIMAL(6, 2) NOT NULL,
	`Foto` VARCHAR(255) NOT NULL,
	`id_categoria` INT NOT NULL,
	PRIMARY KEY (`id_produto`)
);

CREATE TABLE `Categoria` (
	`id_categoria` INT NOT NULL AUTO_INCREMENT,
	`Tipo` varchar(255) NOT NULL,
	`Destino` varchar(255) NOT NULL,
	`Classificacao` varchar(255) NOT NULL,
	PRIMARY KEY (`id_categoria`)
);

CREATE TABLE `Usuário` (
	`id_usuario` INT NOT NULL AUTO_INCREMENT,
	`Nome` varchar(255) NOT NULL,
	`Email` varchar(255) NOT NULL,
	`Senha` varchar(255) NOT NULL,
	PRIMARY KEY (`id_usuario`)
);

ALTER TABLE `Produto` ADD CONSTRAINT `Produto_fk0` FOREIGN KEY (`id_categoria`) REFERENCES `Categoria`(`id_categoria`);

