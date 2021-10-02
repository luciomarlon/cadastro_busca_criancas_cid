#drop database bd_crei2
#create database bd_crei2;
use bd_crei2;


create table if not exists tbl_cid(
id_cid 			int primary key auto_increment,
cid			 	varchar(100),
descricao		varchar (250)

);

create table if not exists tbl_cid_hd(
id_cid_hd 			int primary key auto_increment,
cid_hd			varchar(100),
descricao		varchar (250)

);

select * from tbl_professor;
select * from tbl_escola;

create table if not exists tbl_escola(
id_escola 		int primary key auto_increment,
ano_escolar		int (4),
nome_escola 	varchar(250),
setor 			int(2),
dt_cria_escola	date default now() 
);

create table if not exists tbl_professor(
id_professor 		int primary key auto_increment,
professor_aee 		varchar(250) not null,
escola_vinculada	varchar(250) default '',
prof_regular 		varchar(250) default '',
auxiliar_sala 		varchar(250),
turno_professor		char(11),
dt_cria_professor 	date default now(),
estatusprofessor	char(01) default '',
fk_professor 		int not null,
constraint fk_professor foreign key fk_escola(fk_professor) references tbl_escola(id_escola)
);

create table if not exists tbl_beneficios(
id_beneficios			int primary key auto_increment,
beneficio_recebido 		varchar (200),
secretaria			 	varchar(30),
autarquia				varchar(20)

);
insert into tbl_beneficios(beneficio_recebido, secretaria, autarquia, telefone) values
('BPC E LOAS','ASSISTENCIA SOCIAL','MUNICIPAL/FEDERAL','353534664'),
('BPC','ASSISTENCIA SOCIAL','MUNICIPAL/FEDERAL','353534664'),
('LOAS','ASSISTENCIA SOCIAL','MUNICIPAL/FEDERAL','343424245'),
('NENHUM','','','');


create table if not exists tbl_escola(
id_escola 		int primary key auto_increment,
ano_escolar		int (4),
nome_escola 	varchar(250),
setor 			int(2),
dt_cria_escola	date default now() 
);


create table if not exists tbl_professor(
id_professor 		int primary key auto_increment,
professor_aee 		varchar(250) not null,
escola_vinculada	varchar(250) default '',
prof_regular 		varchar(1000) default '',
auxiliar_sala 		char(7),
turno_professor		char(8),
dt_cria_professor 	date default now(),
estatusprofessor 			char(01) default '',
fk_professor 		int not null,
constraint fk_professor foreign key fk_escola(fk_professor) references tbl_escola(id_escola)
);

create table if not exists tbl_aluno (
id_aluno int primary key auto_increment,
cpf 				varchar(13),
data_cadastro		date  default now(), # verificar se cria data automaticamente
ano_escolar_aluno	varchar(40),
nome_aluno 			varchar(250) not null,
sexo 				varchar(09) not null,
data_nasc 			date not null,
nome_responsavel 	varchar(250) not null,
telefone 			varchar (40),
suspeita 			varchar(9),
laudo				varchar(3),
tipo_diag			varchar(10),
descricao_diag		varchar(250) default '',
tipo_hd				varchar(10),	
descricao_hd		varchar(250),
turno_escolar 		varchar(5) not null,
turno_aee 			varchar(20) not null,
profregular 		varchar(50),
estatus 			char(01) default '',
observacoes 		text,
transporte 			char(3),
auxiliar			char(7),
mobilidade 			varchar(250),
fk_cid_aluno		int not null,
fk_cid_aluno_hd		int,
fk_beneficios		int not null,
fk_professor_escola int not null,
CONSTRAINT fk_cid_hd 				FOREIGN KEY (fk_cid_aluno_hd) 					REFERENCES tbl_cid(id_cid),
constraint fk_cid_aluno 			foreign key  fk_aluno_cid(fk_cid_aluno) 		references tbl_cid(id_cid),
constraint fk_beneficios_aluno		foreign key  fk_beneficio(fk_beneficios) 		references tbl_beneficios(id_beneficios),
constraint fk_professor_escola 		foreign key  fk_escola(fk_professor_escola) 	references tbl_professor(id_professor)
);

ALTER TABLE tbl_aluno add transporte char(3) after observacoes;
ALTER TABLE tbl_aluno add auxiliar char(7) after transporte;
ALTER TABLE tbl_aluno add mobilidade varchar(40) after auxiliar;
ALTER TABLE tbl_aluno add profregular varchar(20) after turno_aee;


select * from tbl_aluno;

create table if not exists tbl_acompanhamentos(
id_acompanha 			int primary key auto_increment,
acompanhamento	 		varchar (250),
instrumento				varchar(250),
natureza		 		varchar(25),
observacoes				varchar(250),	
fk_acompanhamento 		int not null, 
constraint fk_acompanhamentos foreign key fk_acompanhamento_aluno(fk_acompanhamento) 
references tbl_aluno(id_aluno)
);

-- CADASTRAR ALUNOS PARA CRIAR A TABELA
create table if not exists tbl_endereco_aluno(
id_endereco	int primary key auto_increment,
rua 				varchar(250) not null,
numero 				int(4) not null,
cep					varchar (9)  not null,
bairro 				varchar (100) not null,
cidade				varchar (100) not null, 
estado 				varchar(02) not null,
estatus 			char(01) default '',
fk_endereco_aluno 	int not null,
constraint fk_endereco_aluno foreign key fk_endereco(fk_endereco_aluno) references tbl_aluno(id_aluno)
);

select * from tbl_professor;
select * from tbl_escola;
select * from tbl_aluno;
select * from tbl_acompanhamentos;
select * from tbl_escola where setor like '1';
select * from tbl_escola;
 
 drop database br_crei2;