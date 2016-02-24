CREATE TABLE person(
  id BIGINT not null auto_increment PRIMARY KEY,
  name VARCHAR(20) NOT NULL DEFAULT '',
  phone VARCHAR(15) NOT NULL DEFAULT '',
  email VARCHAR(50) NOT NULL DEFAULT '',
  ctime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  mtime TIMESTAMP DEFAULT 0 ON UPDATE CURRENT_TIMESTAMP
)ENGINE=innodb;

INSERT INTO person (name, phone, email) VALUES ('Jack', '13838384438','jack@note4code.com');
INSERT INTO person (name, phone, email) VALUES ('Mark', '13939394439','mark@note4code.com');