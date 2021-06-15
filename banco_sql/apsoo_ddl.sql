-- Create db and user section -------------------------------------------------
------ EXECUTAR INDEPENDENTE DE BANCO
CREATE DATABASE "APSOO";

CREATE USER "gerenciador_banco" WITH PASSWORD '#leitor963@';

GRANT ALL PRIVILEGES ON DATABASE "APSOO" to gerenciador_banco;
GRANT ALL PRIVILEGES ON SCHEMA public to gerenciador_banco;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public to gerenciador_banco;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public to gerenciador_banco;

--------------------------------------------------------------------------------
-- Create tables section -------------------------------------------------

-- Table public.tb_produto

CREATE TABLE "public"."tb_produto"
(
  "prod_id" Serial NOT NULL,
  "prod_codigo" Character varying(20) NOT NULL,
  "prod_modelo" Character varying(50),
  "prod_cor" Character varying(20),
  "prod_preco" Numeric(30,6) NOT NULL,
  "prod_descricao" Character varying(200) NOT NULL,
  "prod_estoque" Integer NOT NULL,
  "marca_id" Integer NOT NULL
)
WITH (
  autovacuum_enabled=true)
;

ALTER TABLE "public"."tb_produto" ADD CONSTRAINT "PK_tb_produto" PRIMARY KEY ("prod_id","marca_id")
;

-- Table public.tb_marca

CREATE TABLE "public"."tb_marca"
(
  "marca_id" Serial NOT NULL,
  "marca_nome" Character varying(30) NOT NULL,
  "marca_sigla" Character varying(5)
)
WITH (
  autovacuum_enabled=true)
;

ALTER TABLE "public"."tb_marca" ADD CONSTRAINT "PK_tb_marca" PRIMARY KEY ("marca_id")
;

-- Table public.tb_cliente

CREATE TABLE "public"."tb_cliente"
(
  "cli_id" Serial NOT NULL,
  "cli_cpf" Character varying(14) NOT NULL,
  "cli_endereco" Text,
  "cli_telefone" Character varying(15) NOT NULL,
  "cli_email" Character varying(100),
  "cli_nome" Character varying(80) NOT NULL,
  "cli_pontos_fidelidade" Integer
)
WITH (
  autovacuum_enabled=true)
;

ALTER TABLE "public"."tb_cliente" ADD CONSTRAINT "PK_tb_cliente" PRIMARY KEY ("cli_id")
;

-- Table public.tb_funcionario

CREATE TABLE "public"."tb_funcionario"
(
  "func_id" Serial NOT NULL,
  "func_cpf" Character varying(20) NOT NULL,
  "func_nome" Character varying(20) NOT NULL,
  "func_endereco" Text,
  "func_telefone" Character varying(20) NOT NULL,
  "func_email" Character varying(100) NOT NULL,
  "fu_id" Integer NOT NULL,
  "func_cod_acesso" Character varying(5) NOT NULL,
  "func_total_vendas" Integer NOT NULL
)
WITH (
  autovacuum_enabled=true)
;

ALTER TABLE "public"."tb_funcionario" ADD CONSTRAINT "PK_tb_funcionario" PRIMARY KEY ("func_id","fu_id")
;

-- Table public.tb_funcao

CREATE TABLE "public"."tb_funcao"
(
  "fu_id" Serial NOT NULL,
  "fu_nome" Character varying(50) NOT NULL
)
WITH (
  autovacuum_enabled=true)
;

ALTER TABLE "public"."tb_funcao" ADD CONSTRAINT "PK_tb_funcao" PRIMARY KEY ("fu_id")
;

-- Table public.tb_venda

CREATE TABLE "public"."tb_venda"
(
  "ven_id" Serial NOT NULL,
  "ven_cod" Character varying(20) NOT NULL,
  "ven_data_hora" Date NOT NULL,
  "ven_qtde_prod" Integer NOT NULL,
  "ven_subtotal" Numeric(30,6) NOT NULL,
  "ven_desconto" Numeric(30,6),
  "ven_total" Numeric(30,6) NOT NULL,
  "cli_id" Integer NOT NULL,
  "func_id" Integer NOT NULL,
  "fu_id" Integer NOT NULL
)
WITH (
  autovacuum_enabled=true)
;

CREATE INDEX "IX_FK_FUNC_VENDA" ON "public"."tb_venda" ("func_id","fu_id")
;

CREATE INDEX "IX_FK_CLIENTE_VENDA" ON "public"."tb_venda" ("cli_id")
;

ALTER TABLE "public"."tb_venda" ADD CONSTRAINT "PK_tb_venda" PRIMARY KEY ("ven_id")
;

-- Table public.tb_venda_produto

CREATE TABLE "public"."tb_venda_produto"
(
  "vp_id" Serial NOT NULL,
  "vp_qtd_item" Integer NOT NULL,
  "vp_total_item" Numeric(30,6) NOT NULL,
  "ven_id" Integer NOT NULL,
  "prod_id" Integer NOT NULL,
  "marca_id" Integer NOT NULL
)
WITH (
  autovacuum_enabled=true)
;

ALTER TABLE "public"."tb_venda_produto" ADD CONSTRAINT "PK_tb_venda_produto" PRIMARY KEY ("vp_id","ven_id","prod_id","marca_id")
;

-- Table public.tb_orcamento

CREATE TABLE "public"."tb_orcamento"
(
  "orc_id" Serial NOT NULL,
  "orc_codigo" Character varying(6) NOT NULL,
  "orc_qtde_prod" Integer NOT NULL,
  "orc_data_hora" Date NOT NULL,
  "orc_data_validade" Date NOT NULL,
  "orc_subtotal" Numeric NOT NULL,
  "cli_id" Integer NOT NULL,
  "func_id" Integer NOT NULL,
  "fu_id" Integer NOT NULL
)
WITH (
  autovacuum_enabled=true)
;

CREATE INDEX "IX_FK_CLIENTE_ORCAMENTO" ON "public"."tb_orcamento" ("cli_id")
;

CREATE INDEX "IX_FK_FUNC_ORCAMENTO" ON "public"."tb_orcamento" ("func_id","fu_id")
;

ALTER TABLE "public"."tb_orcamento" ADD CONSTRAINT "PK_tb_orcamento" PRIMARY KEY ("orc_id")
;

-- Table public.tb_orcamento_produto

CREATE TABLE "public"."tb_orcamento_produto"
(
  "op_id" Serial NOT NULL,
  "op_qdt_item" Integer NOT NULL,
  "op_total_item" Numeric(30,6) NOT NULL,
  "orc_id" Integer NOT NULL,
  "prod_id" Integer NOT NULL,
  "marca_id" Integer NOT NULL
)
WITH (
  autovacuum_enabled=true)
;

ALTER TABLE "public"."tb_orcamento_produto" ADD CONSTRAINT "PK_tb_orcamento_produto" PRIMARY KEY ("op_id","orc_id","prod_id","marca_id")
;

-- Create foreign keys (relationships) section -------------------------------------------------

ALTER TABLE "public"."tb_produto"
  ADD CONSTRAINT "FK_PRODUTO_MARCA"
    FOREIGN KEY ("marca_id")
    REFERENCES "public"."tb_marca" ("marca_id")
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
;

ALTER TABLE "public"."tb_funcionario"
  ADD CONSTRAINT "FK_FUNC_FUN"
    FOREIGN KEY ("fu_id")
    REFERENCES "public"."tb_funcao" ("fu_id")
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
;

ALTER TABLE "public"."tb_venda_produto"
  ADD CONSTRAINT "FK_VP_VENDA"
    FOREIGN KEY ("ven_id")
    REFERENCES "public"."tb_venda" ("ven_id")
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
;

ALTER TABLE "public"."tb_venda_produto"
  ADD CONSTRAINT "FK_VP_PRODUTO"
    FOREIGN KEY ("prod_id", "marca_id")
    REFERENCES "public"."tb_produto" ("prod_id", "marca_id")
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
;

ALTER TABLE "public"."tb_venda"
  ADD CONSTRAINT "FK_CLIENTE_VENDA"
    FOREIGN KEY ("cli_id")
    REFERENCES "public"."tb_cliente" ("cli_id")
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
;

ALTER TABLE "public"."tb_venda"
  ADD CONSTRAINT "FK_FUNC_VENDA"
    FOREIGN KEY ("func_id", "fu_id")
    REFERENCES "public"."tb_funcionario" ("func_id", "fu_id")
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
;

ALTER TABLE "public"."tb_orcamento"
  ADD CONSTRAINT "FK_CLIENTE_ORCAMENTO"
    FOREIGN KEY ("cli_id")
    REFERENCES "public"."tb_cliente" ("cli_id")
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
;

ALTER TABLE "public"."tb_orcamento"
  ADD CONSTRAINT "FK_FUNC_ORCAMENTO"
    FOREIGN KEY ("func_id", "fu_id")
    REFERENCES "public"."tb_funcionario" ("func_id", "fu_id")
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
;

ALTER TABLE "public"."tb_orcamento_produto"
  ADD CONSTRAINT "FK_OP_ORCAMENTO"
    FOREIGN KEY ("orc_id")
    REFERENCES "public"."tb_orcamento" ("orc_id")
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
;

ALTER TABLE "public"."tb_orcamento_produto"
  ADD CONSTRAINT "FK_OP_PRODUTO"
    FOREIGN KEY ("prod_id", "marca_id")
    REFERENCES "public"."tb_produto" ("prod_id", "marca_id")
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
;
