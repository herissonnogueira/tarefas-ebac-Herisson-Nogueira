create sequence sq_cliente
start 1
increment 1
owned by tb_cliente.id;

create table tb_cliente (
	id bigint,
	nome varchar(50) not null,
	cpf bigint not null,
	tel bigint not null,
	endereco varchar(50) not null,
	numero bigint not null,
	cidade varchar(50) not null,
	estado varchar(50) not null,
	constraint pk_id_cliente primary key(id)
);

create sequence sq_cliente_2
start 2
increment 2
owned by tb_cliente_2.id;

create table tb_cliente_2 (
	id bigint,
	nome varchar (50) not null,
	codigo varchar(50) not null,
	constraint pk_id_cliente_2 primary key(id)
)

select * from tb_cliente;
drop table tb_cliente;

insert into tb_cliente values('Herisson', 102030);

CREATE TABLE Produto (

  produto_id SERIAL PRIMARY KEY,

  nome VARCHAR(255) NOT NULL,

  descricao TEXT,

  preco DECIMAL(10, 2) NOT NULL

);

INSERT INTO Produto (nome, descricao, preco) VALUES

  ('Produto A', 'Descrição do Produto A', 50.00),

  ('Produto B', 'Descrição do Produto B', 75.00),

  ('Produto C', 'Descrição do Produto C', 120.00);
