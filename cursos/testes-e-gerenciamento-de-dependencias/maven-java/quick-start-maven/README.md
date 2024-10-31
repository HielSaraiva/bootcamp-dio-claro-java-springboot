## Criando um Projeto básico via linha de comando

````
mvn archetype:generate -DgroupId="one.digitalinnovation" -DartifactId=quick-start-maven -Darchetype=maven-archetype-quickstart -DinteractiveMode=false
````

## Comandos mvn básicos

**mvn compile**: compila todos os arquivos .java

**mvn test**: realiza o teste da aplicação

**mvn package**: cria o arquivo .jar da aplicação

**mvn clean**: deleta o diretório \target

## Criando diferentes tipos de projetos

Existem vários tipos de templates maven para projetos, alguns deles podem ser vizualidados aqui: 
**[Maven Archetype List](https://maven.apache.org/archetypes/)**

## POM (Project Object Model)

* Detalha o projeto

* Detalha como construir o projeto

* Formato XML

* Maven sempre procura pelo pom.xml para realizar sua execução

### Detalhes pom.xml

* Nome do projeto

* Dependências

* Módulos

* Configurações de build

* Detalhes do projeto (nome, descrição, licença, url)

* Configurações de ambiente (repositórios, tracking, profiles)

### Pom.xml básico

``````apache
<project>
  <modelVersion>4.0.0</modelVersion>
  <groupId>one.digitalinnovation<groupId>
  <artifactId>quick-start-maven</artifactId>
  <version>1.0</version>
</project>
``````

### Super POM

As outras configurações não citadas no pom básico são herdadas do Super POM

Leia mais: **[Super POM - Maven 3.0.4](https://maven.apache.org/ref/3.0.4/maven-model-builder/super-pom.html)**

## Repositórios

* São locais onde podemos encontrar plugins e bibliotecas que o Maven provê

* Dois tipos: Local e Remoto

### Repositório Local

* É o repositório na máquina utilizado pelo Maven para buscar os artefatos

* Estratégia de caching

### Repositório Remoto

* Caso o artefato não esteja no repositório local, ele será buscado no repositório remoto

* É o local central utilizado pelo Maven para buscar os artefatos

* Configurado automaticamente pelo Super POM para utilizar o Maven Central

## Dependências

Devem ser colocadas dentro de:
``````apache
<dependencies></dependencies>
``````

Leia mais em: **[Maven Repository](https://mvnrepository.com/)**

##