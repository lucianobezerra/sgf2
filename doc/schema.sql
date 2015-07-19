CREATE TABLE competencias(
  id serial NOT NULL,
  mes character(2) NOT NULL,
  ano character(4) NOT NULL,
  created_at date NOT NULL DEFAULT now(),
  operador_id integer NOT NULL,
  ativo boolean,
  CONSTRAINT pk_competencia PRIMARY KEY (id),
  CONSTRAINT fk_competencia_operador FOREIGN KEY (operador_id) REFERENCES operadores (id) MATCH SIMPLE ON UPDATE CASCADE ON DELETE NO ACTION,
  CONSTRAINT uk_mes_ano UNIQUE (mes, ano));

ALTER TABLE competencias OWNER TO postgres;

CREATE TABLE autorizacoes(
  id serial NOT NULL,
  competencia_id integer NOT NULL,
  estabelecimento_id integer NOT NULL,
  rubrica_id integer NOT NULL,
  operador_id integer NOT NULL,
  valor numeric(12,2) NOT NULL DEFAULT 0.00,
  created_at date NOT NULL DEFAULT now(),
  observacoes character varying(200),
  impressa boolean DEFAULT false,
  CONSTRAINT autorizacoes_pkey PRIMARY KEY (id),
  CONSTRAINT fk_competencia     FOREIGN KEY (competencia_id)     REFERENCES competencias (id)     MATCH SIMPLE ON UPDATE CASCADE ON DELETE NO ACTION,
  CONSTRAINT fk_estabelecimento FOREIGN KEY (estabelecimento_id) REFERENCES estabelecimentos (id) MATCH SIMPLE ON UPDATE CASCADE ON DELETE NO ACTION,
  CONSTRAINT fk_operador        FOREIGN KEY (operador_id)        REFERENCES operadores (id)       MATCH SIMPLE ON UPDATE CASCADE ON DELETE NO ACTION,
  CONSTRAINT fk_rubrica         FOREIGN KEY (rubrica_id)         REFERENCES rubricas (id)         MATCH SIMPLE ON UPDATE CASCADE ON DELETE NO ACTION);

ALTER TABLE autorizacoes OWNER TO postgres;

CREATE TABLE estabelecimentos(
  id serial NOT NULL,
  cnes character(7) NOT NULL,
  nome character varying(60) NOT NULL,
  nome_completo character varying(60) NOT NULL,
  tipo character(1) NOT NULL,
  cpf_cnpj character(14) NOT NULL,
  operador_id integer NOT NULL,
  created_at date DEFAULT now(),
  ativo boolean,
  CONSTRAINT pk_estabelecimento PRIMARY KEY (id),
  CONSTRAINT fk_estabelecimento_operador FOREIGN KEY (operador_id) REFERENCES operadores (id) MATCH SIMPLE ON UPDATE CASCADE ON DELETE NO ACTION,
  CONSTRAINT unique_cnes UNIQUE (cnes));
ALTER TABLE estabelecimentos OWNER TO postgres;

CREATE TABLE operadores(
  id serial NOT NULL,
  nome character varying(25) NOT NULL,
  nome_completo character varying(60) NOT NULL,
  email character varying(100) NOT NULL,
  senha character varying(120) NOT NULL,
  nivel integer NOT NULL DEFAULT 4,
  ativo boolean,
  created_at date DEFAULT now(),
  CONSTRAINT pk_operadores PRIMARY KEY (id),
  CONSTRAINT unique_login UNIQUE (nome));

CREATE TABLE parameters(
  id serial NOT NULL,
  code character varying(4) NOT NULL,
  description character varying(100) NOT NULL,
  response integer NOT NULL,
  about character varying(255),
  CONSTRAINT fk_parameters PRIMARY KEY (id));

CREATE TABLE rubricas(
  id serial NOT NULL,
  codigo character(4) NOT NULL,
  descricao character varying(100) NOT NULL,
  conta character varying(12) NOT NULL,
  operador_id integer NOT NULL,
  ativo boolean,
  created_at date DEFAULT now(),
  CONSTRAINT pk_rubrica PRIMARY KEY (id),
  CONSTRAINT fk_rubrica_operador FOREIGN KEY (operador_id) REFERENCES operadores (id) MATCH SIMPLE ON UPDATE CASCADE ON DELETE NO ACTION,
  CONSTRAINT unique_codigo UNIQUE (codigo)
);
