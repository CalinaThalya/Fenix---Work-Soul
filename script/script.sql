CREATE TABLE cliente ( 
    id INT IDENTITY(1,1) PRIMARY KEY, 
    nome VARCHAR(100), 
    cpf CHAR(11) 
); 
 
CREATE TABLE movimentacao_financeira ( 
    id INT IDENTITY(1,1) PRIMARY KEY, 
    descricao VARCHAR(255), 
    valor DECIMAL(10,2),
    hora TIME, 
    data DATE, 
    cliente_id INT, 
    FOREIGN KEY (cliente_id) REFERENCES cliente(id) 
); 
 
-- INSERÇÕES DE CLIENTES 
INSERT INTO cliente (nome, cpf) 
VALUES ('Maria Oliveira', '12345678901'); 
 
-- Outro cliente (id será 21) 
INSERT INTO cliente (nome, cpf) 
VALUES ('Carlos Mendes', '32165498700'); 
 
-- INSERÇÕES DE MOVIMENTAÇÕES 
INSERT INTO movimentacao_financeira (descricao, valor, data, cliente_id) 
VALUES ('Depósito inicial', 1500.00, '2025-10-02', 20); 
 
INSERT INTO movimentacao_financeira (descricao, valor, data, cliente_id) 
VALUES ('Transferência recebida', 250.00, '2025-10-05', 21); 
 
-- ATUALIZAÇÕES 
UPDATE cliente 
SET nome = 'João Souza', cpf = '98765432100' 
WHERE id = 4; 
 
UPDATE movimentacao_financeira 
SET descricao = 'Depósito corrigido', valor = 1600.00, data = '2025-10-03' 
WHERE id = 22; 
 
-- EXCLUSÕES 
DELETE FROM movimentacao_financeira WHERE id = 22; 
DELETE FROM cliente WHERE id = 20; 
 
-- CONSULTAS  
SELECT * FROM cliente; 
SELECT * FROM movimentacao_financeira;
