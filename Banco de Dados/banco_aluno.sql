create schema if not exists escola;
use escola;

drop table if exists tb_notas;
drop table if exists tb_faltas;
drop table if exists tb_professor;
drop table if exists tb_aluno;
drop table if exists tb_materias;
drop table if exists tb_unidade;

create table tb_professor(
	id_professor int,
	nome varchar(50) not null,
    login varchar(100) not null,
	senha varchar(100) not null,
    id_unidade int,
    id_materia int,
	constraint pk_professor primary key(id_professor)
);
create table tb_aluno(
	id_aluno int,
    turma varchar(4) not null,
    cod_ra int,
	nome varchar(50) not null,
	senha varchar(100) not null,
    id_unidade int,
	constraint pk_aluno primary key(id_aluno, cod_ra)
);
create table tb_materias(
	id_materia int,
	nome varchar (50) not null,
	constraint pk_materia primary key (id_materia)
);
create table tb_notas(
	id_aluno int,
    id_materia int,
	nota_primeiro_bimestre int,
    nota_segundo_bimestre int,
    nota_terceiro_bimestre int,
    nota_quarto_bimestre int,
    nota_final int,
	constraint pk_notas primary key(id_aluno, id_materia)
);
create table tb_faltas(
	id_aluno int,
    id_materia int,
	faltas_primeiro_bimestre int,
    faltas_segundo_bimestre int,
    faltas_terceiro_bimestre int,
    faltas_quarto_bimestre int,
    total_faltas int,
	constraint pk_faltas primary key(id_aluno, id_materia)
);
create table tb_unidade(
	id_unidade int,
    id_professor int,
    id_aluno int,
	nome varchar (50) not null,
	constraint pk_unidade primary key (id_unidade)
);

alter table tb_professor
add(constraint professor_materia_FK foreign key (id_materia)
references tb_materias (id_materia),

constraint professor_unidade_FK foreign key (id_unidade)
references tb_unidade(id_unidade));

alter table tb_aluno
add(constraint aluno_unidade_FK foreign key (id_unidade)
references tb_unidade(id_unidade));

alter table tb_notas
add(constraint notas_aluno_FK foreign key (id_aluno)
references tb_aluno (id_aluno),

constraint notas_materia_FK foreign key (id_materia)
references tb_materias(id_materia));

alter table tb_faltas
add(constraint faltas_aluno_FK foreign key (id_aluno)
references tb_aluno (id_aluno),

constraint faltas_materia_FK foreign key (id_materia)
references tb_materias(id_materia));

INSERT INTO tb_materias VALUES (1, 'Análise de Sistemas');
INSERT INTO tb_unidade VALUES (1, 1, 1, 'Barra Funda');
INSERT INTO tb_professor VALUES (1, 'Adriano', 'adriano', 123456, 1, 1);
INSERT INTO tb_aluno VALUES (1, '3/C', 917108728, 'Lucas Lima', 123456, 1);