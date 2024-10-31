## Introdução aos Bancos de Dados Relacionais

### Funcionalidades Básicas

- Create, Read, Update e Delete (CRUD)

### Características

- Relacionamento entre tabelas
- Linguagem de Consulta (SQL)
- Integridade referencial
- Normalização de dados
- Segurança (acesso apenas aos dados requisitados)
- Flexibilidade e extensibilidade
- Suporte a transações ACID (garantia da consistência)

### Operações ACID

- Atomicidade (garante que todas as operacoes sejam executadas com sucesso, ou que nenhuma seja executada. **Ex.: transações bancárias**)
- Consistência (garante que o banco de dados transite entre estados consistentes)
- Isolamento (cada operação é executada de forma isolada. **Ex.: recebendo duas trasferências bancárias ao mesmo tempo**)
- Durabilidade (uma vez que a operação é confirmada, a alteração de informações deve ser permanente)

### SQL - Structured Query Language

#### Organização

- DQL - Linguagem de Consulta de Dados: **SELECT**
- DML - Linguagem de Manipulação de Dados: **INSERT, UPDATE e DELETE**
- DDL - Linguagem de Definição de Dados: **CREATE, ALTER, DROP**
- DCL - Linguagem de Controle de Dados: **GRANT, REVOKE**
- DTL - Linguagem de Transação de Dados: **BEGIN, COMMIT, ROLLBACK**

#### Sintaxe Básica: Nomenclatura

- Os nomes devem começar com uma letra ou com um caractere de sublinhado (_)
- Os nomes podem conter letras, números e caracteres de sublinhado (_)
- Sensibilidade a maiúsculas e minúsculas 

### MER e DER

- O Modelo Entidade-Relacionamento (MER) é representado através de diagramas chamados Diagramas Entidade-Relacionamento (DER)

- Desenvolver DERs: [**Creately**](https://app.creately.com/)
- Desenvolver DERs com IA (Plotagem): [**QuickDatabaseDiagrams**](https://app.quickdatabasediagrams.com/)

#### DERs

1. Entidades

- São nomeadas com substantivos concretos ou abstratos que representem de forma clara sua função dentro do domínio (**forma: retângulos**)

2. Atributos

- São as características ou propriedades das entidades. Eles descrevem informações específicas sobre uma entidade (**forma1: elipses ligadas à entidade; forma2: retângulos anexados inferiormente à entidade**)

3. Relacionamentos

- Representam as associações entre entidades (**forma: losangos**)

4. Cardinalidade

- 1..1 (um para um)
- 1..n ou 1..* (um para muitos)
- n..n ou * .. * (muitos para muitos)

## Modelagem de Dados Relacionais

### Componentes 

#### Tabelas

- Usada para armazenar dados de forma organizada. Cada tabela em um banco de dados relacional tem um nome único e é dividida em colunas e linhas

#### Colunas

- É uma estrutura dentro de uma tabela que representa um atributo específico dos dados armazenados. Cada coluna tem um nome único e um tipo de dados associado que define o tipo de informação que pode ser armazenado nela, como número, textos, datas, etx

#### Registros

- Também conhecido como linha ou tupla, é uma instância individual de dados em uma tabela

### Comandos

#### CREATE TABLE

```````java
CREATE TABLE {{nome}}
   ({{coluna}}{{tipo}}{{opcoes}} COMMENT
   {{'COMENTARIO'}});
```````

#### CREATE TABLE - Opções

1. Restrições de valor:
   - **NOT NULL**
   - **UNIQUE**
   - **DEFAULT**

2. Chaves primárias e estrangeiras

3. Auto incremento

#### INSERT

```````java
INSERT INTO
   {{nome-tabela}}
   ([coluna1, coluna2,...]) *** você pode ocultar as colunas
VALUES
   ([valor-coluna1, valor-coluna2,...]);
```````

#### SELECT 

```````java
SELECT {{lista_colunas}}

FROM tabela

WHERE {{condicao}};
```````

#### SELECT - Operadores

- = (igualdade)
- <> ou != (diferente)
- <, >, <=, >= (desigualdade)
- LIKE (comparação de padrões)
- IN (pertence a uma lista de valores)
- BETWEEN (dentro de um intervalo)
- AND (e lógico)
- OR (ou lógico)

#### UPDATE

```````java
UPDATE {{tabela}}

SET
   {{coluna_1}} = {{novo_valor_1}},
   {{coluna_2}} = {{novo_valor_2}}
WHERE
   {{condicao}};
```````

#### DELETE

```````java
DELETE FROM
   {{tabela}}
WHERE
   {{condicao}};
```````

#### DROP TABLE

É usado no SQL para remover uma tabela existente de um banco de dados relacional. Ele exclui permanentemente a tabela.

```````java
DROP TABLE {{tabela}}
```````

#### ALTER TABLE

É usada no SQL para modificar a estrutura de uma tabela existente em um banco de dados relacional. Ela permite:

1. Adicionar, alterar ou excluir colunas
2. Modificar as restrições, índices
3. Renomear a tabela entre outras alterações

### Tipos de Dados

- Podem variar muito entre os diversos SGDB, os mais comuns são:

1. Integer
2. Decimal / Numeric
3. Character / Varchar
4. Date / Time
5. Boolean
6. Text

### Chaves Primárias

- Identifica exclusivamente 
- Não pode conter valores nulos (NULL)
- Uma tabela pode ter apenas uma chave primária

```````java
CREATE TABLE {{tabela}}
(ID PRIMARY KEY AUTOINCREMENT,...);

ALTER TABLE {{tabela}}
MODIFY COLUMN ID INT PRIMARY KEY;
```````

### Chaves Estrangeiras

- Usada para estabelecer e manter a integridade dos dados entre tabelas relacionadas
- Pode ser nula (NOT NULL) **registro órfão
- É possível ter mais de uma (ou nenhuma) em uma tabela

```````java
CREATE TABLE {{tabela}} (
  id INT PRIMARY KEY,
  chave_estrangeira INT,
  FOREIGN KEY(chave_estrangeira) REFERENCES {{outra tabela}}(id)
);
```````

```````java
ALTER TABLE{{tabela}}
ADD CONSTRAINT {{nome_constraint}}
FOREIGN KEY(ID_)
REFERENCES{{outra_tabela}}(ID)
```````

### Chaves Estrangeiras - Restrições

- ON DELETE especifica o que acontece com os registros dependentes quando um registro pai é excluído
- ON UPDATE define o comportamento dos registros dependentess quando um registro pai é atualizado
- CASCADE, SET NULL, SET DEFAULT e RESTRICT

### Normalização de dados

- É um processo no qual se organiza e estrutura um banco de dados relacional de forma a eliminar redundâncias e anomalias, garantindo a consistência e integridade dos dados

#### Formas Normais

1. **1FN: Atomicidade de dados:** cada valor em uma tabela deve ser atômico, ou seja, indivisível. Nenhum campo deve conter múltiplos valores ou listas. 

2. **2FN:** estabelece que uma tabela deve estar na 1FN. Todos os atributos não chave devem depender totalmente da chave primária.

3. **3FN:** estabelece que uma tabela deve estar na 2FN. Nenhuma coluna não-chave depender de outra coluna não-chave.

### Consultas Avançadas

#### Junções: JOINs

- Usadas no SQL para combinar dados de duas ou mais tabelas relacionadas em uma única consulta

#### Sub Consultas

- Permitem realizar consultas mais complexas permitindo que você use o resultado de uma consulta como entrada para outra consulta

### Funções Agregadas

1. COUNT
2. SUM
3. AVG
4. MIN
5. MAX

### Agrupamento de Resultados

- SELECT...
- FROM...
- GROUP BY...

### Ordenação de Resultados

- SELECT...
- FROM...
- ORDER BY...

### Análise do Plano de Execução

- Permite examinar as operações realizadas, as tabelas acessadas, os índices utilizados e outras informações importantes para identificar possíveis melhorias de desempenho.

