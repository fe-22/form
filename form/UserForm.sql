CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    cpf VARCHAR(14),
    data_nascimento DATE,
    endereco VARCHAR(100),
    telefone VARCHAR(20)
);	