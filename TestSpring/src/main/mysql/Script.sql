--<ScriptOptions statementTerminator=";"/>

CREATE TABLE account (
	id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(45),
	money DECIMAL(10 , 0),
	PRIMARY KEY (id)
) ENGINE=InnoDB;

