--------- POPULAR O BANCO

INSERT INTO public."tb_funcao"(fu_nome)	VALUES ('Administrador');
INSERT INTO public."tb_funcao"(fu_nome)	VALUES ('Vendedor');
INSERT INTO public."tb_funcao"(fu_nome)	VALUES ('Estoquista');


INSERT INTO public."tb_funcionario"(
	func_cpf, func_nome, func_endereco, func_telefone, func_email, fu_id, func_cod_acesso, func_total_vendas)
	VALUES ('145.568.198-12', 'Rua UFMS Cidade Universitária', 'Juan Carvalho', '(67)94002-8922', 'juanccl@todoeletronicos.com', 1, '87123', 0);
INSERT INTO public."tb_funcionario"(
	func_cpf, func_nome, func_endereco, func_telefone, func_email, fu_id, func_cod_acesso, func_total_vendas)
	VALUES ('813.123.871-98', 'Leonardo Esperança', 'Rua Portugal 123 - Jd Europa', '(67)97667-9812', 'leonardoesp@todoeletronicos.com', 2, '98134', 0);
INSERT INTO public."tb_funcionario"(
	func_cpf, func_nome, func_endereco, func_telefone, func_email, fu_id, func_cod_acesso, func_total_vendas)
	VALUES ('541.891.081-54', 'Patrick Escorsi', 'Rua Ipê 8123 - Bosque Das Árvores', '(67)96671-6211', 'patrick@todoeletronicos.com', 2, '65123', 0);
INSERT INTO public."tb_funcionario"(
	func_cpf, func_nome, func_endereco, func_telefone, func_email, fu_id, func_cod_acesso, func_total_vendas)
	VALUES ('671.901.031-61', 'Calel Becassi', 'Rua Paraná 513 - Jd Dos Estados', '(67)97612-6543', 'calelbecassi@@todoeletronicos.com', 3, '66290', 0);


INSERT INTO public."tb_cliente"(
	cli_cpf, cli_endereco, cli_telefone, cli_email, cli_nome, cli_pontos_fidelidade)
	VALUES ('812.543.871-91', 'Avenida Afonso Pena 21 - Centro', '(67)98765-4321', 'malubeal@hotmail.com', 'Maria Luiza', 0);

INSERT INTO public."tb_cliente"(
	cli_cpf, cli_endereco, cli_telefone, cli_email, cli_nome, cli_pontos_fidelidade)
	VALUES ('612.091.871-65', 'Rua Dos Girassóis 912 - Jd. Botânico', '(67)99143-0912', 'seitir@gmail.com', 'Rodrigo Seiti', 0);


INSERT INTO public."tb_marca"(marca_nome, marca_sigla) VALUES ('Dell Eletronics', 'DELL');

INSERT INTO public."tb_marca"(marca_nome, marca_sigla) VALUES ('Multilaser', 'ML');

INSERT INTO public."tb_marca"(marca_nome, marca_sigla) VALUES ('Motorola', 'MOTO');

INSERT INTO public."tb_marca"(marca_nome, marca_sigla) VALUES ('Razer', 'RZR');

INSERT INTO public."tb_marca"(marca_nome, marca_sigla) VALUES ('Samsumg', 'SMSG');

INSERT INTO public."tb_marca"(marca_nome, marca_sigla) VALUES ('Xiaomi', 'XIA');

INSERT INTO public."tb_marca"(marca_nome, marca_sigla) VALUES ('Edifier', 'EDF');

INSERT INTO public."tb_marca"(marca_nome, marca_sigla) VALUES ('Apple', 'APL');



INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('A2172A', 'iPhone 12', 'Preto', 7999, 'iPhone 12 64GB Preto', 100, 8);
INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('A2172B', 'iPhone 12', 'Roxo', 8499, 'iPhone 12 128GB Roxo', 100, 8);
INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('A2341A', 'iPhone 12 Pro', 'Grafite', 9999, 'iPhone 12 Pro 256GB Prateado', 100, 8);
INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('A2341B', 'iPhone 12 Pro', 'Branco', 9999, 'iPhone 12 Pro 256GB Prateado', 100, 8);
INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('A2342', 'iPhone 12 Pro Max', 'Dourado', 12999, 'iPhone 12 Pro Max 512GB Dourado', 100, 8);
INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('B08FF9QQ3B', 'Razer Basilisk', 'Preto Colorido', 859.78, 'Mouse Razer Basilisk Ultimate Preto RGB 14 Leds Pilha Sem Fio', 50, 4);
INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('B07ZK6R8JF', 'Razer Kraken', 'Preto', 1182.34, 'Razer Kraken Ultimate RGB Fone de ouvido USB para jogos: THX 7.1 Spatial Surround Sound - Iluminação Chroma RGB', 120, 4);
INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('B08BFF4C7J', 'Razer Huntsman', 'Preto RGB', 984.30, 'Teclado Razer Huntsman Mini-Click Purple Switch Preto', 80, 4);
INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('i3501m10pfmp', 'Dell Inspiron', 'Chumbo', 2599.0, 'Novo Inspiron 15 3000', 300, 1);
INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('v3500w3004wh', 'Dell Vostro', 'Preto', 4010.0, 'Notebook Vostro 15 3000 6GB RAM', 200, 1);
INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('v3500w3008wh', 'Dell Vostro', 'Preto', 4690.0, 'Notebook Vostro 15 3000 10GB RAM', 200, 1);
INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('cto01o3080mffbcc_p3', 'Dell OptiPlex', 'Cinza', 3821.0, 'OptiPlex Micro 3080 Com Mouse e Teclado - Cinza', 1000, 1);
INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('cto01o3080mffbcc_p4', 'Dell OptiPlex', 'Branco', 3821.0, 'OptiPlex Micro 3080 Com Mouse e Teclado - Branco', 1000, 1);
INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('B07Q3WJTQQ', 'Tws2', 'Preto', 260.0, 'Edifier Tws2 Fone Intra Auricular Bluetooth 5.0 - P E', 400, 7);
INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('B07TDT6DFB', 'TWS 1', 'Branco', 239.90, 'Fone TWS1 Bluetooth 5.0 aptX e cVc EDIFIER - Branco', 200, 7);
INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('B07TDT6DFC', 'TWS 1', 'Preto', 239.90, 'Fone TWS1 Bluetooth 5.0 aptX e cVc EDIFIER - Preto', 450, 7);
INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('B07TDT6DFA', 'TWS 1', 'Azul', 239.90, 'Fone TWS1 Bluetooth 5.0 aptX e cVc EDIFIER - Azul', 450, 7);
INSERT INTO public."tb_produto"(
	prod_codigo, prod_modelo, prod_cor, prod_preco, prod_descricao, prod_estoque, marca_id)
	VALUES ('B089NS9JW2', 'Mi Band', 'Preto', 198.50, 'Xiaomi Mi Band 5 - Versão Global', 80, 6);


------- ZERAR O BANCO

DELETE FROM public."tb_funcionario";
ALTER SEQUENCE "tb_funcionario_func_id_seq" RESTART WITH 1;
DELETE FROM public."tb_funcao";
ALTER SEQUENCE "tb_funcao_fu_id_seq" RESTART WITH 1;
DELETE FROM public."tb_cliente";
ALTER SEQUENCE "tb_cliente_cli_id_seq" RESTART WITH 1;
DELETE FROM public."tb_produto";
ALTER SEQUENCE "tb_produto_prod_id_seq" RESTART WITH 1;
DELETE FROM public."tb_marca";
ALTER SEQUENCE "tb_marca_marca_id_seq" RESTART WITH 1;
DELETE FROM public."tb_orcamento";
ALTER SEQUENCE "tb_orcamento_orc_id_seq" RESTART WITH 1;
DELETE FROM public."tb_orcamento_produto";
ALTER SEQUENCE "tb_orcamento_produto_op_id_seq" RESTART WITH 1;
DELETE FROM public."tb_venda";
ALTER SEQUENCE "tb_venda_ven_id_seq" RESTART WITH 1;
DELETE FROM public."tb_venda_produto";
ALTER SEQUENCE "tb_venda_produto_vp_id_seq" RESTART WITH 1;


------- CONTAR OS REGISTROS
SELECT COUNT(*) FROM public."tb_funcionario";
SELECT COUNT(*) FROM public."tb_funcao";
SELECT COUNT(*) FROM public."tb_cliente";
SELECT COUNT(*) FROM public."tb_produto";
SELECT COUNT(*) FROM public."tb_marca";
SELECT COUNT(*) FROM public."tb_orcamento";
SELECT COUNT(*) FROM public."tb_orcamento_produto";
SELECT COUNT(*) FROM public."tb_venda";
SELECT COUNT(*) FROM public."tb_venda_produto";


DROP TABLE tb_cliente;
DROP TABLE tb_orcamento;
DROP TABLE tb_orcamento_produto;
DROP TABLE tb_produto;
DROP TABLE tb_marca;
DROP TABLE tb_funcionario;
DROP TABLE tb_funcao;
DROP TABLE tb_venda;
DROP TABLE tb_venda_produto;

