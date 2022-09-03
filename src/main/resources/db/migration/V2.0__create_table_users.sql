CREATE TABLE users (
	id INT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	documento VARCHAR(20) NOT NULL,
	data_criacao DATE NOT NULL,
	data_atualizacao DATE NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;