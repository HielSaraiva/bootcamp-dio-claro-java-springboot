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

Leia mais: **[Super POM - Maven 3.0.4](https://maven.apache.org/ref/3.0.4/maven-model-builder/super-pom.html)**'

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

### Escopos de Dependências

```````apache
<scope></scope>
```````

* compile: este é o escopo padrão se nenhum for especificado. As dependências de tempo de compilação estão disponíveis no classpath do projeto.

* provided: Semelhante ao escopo compile, mas indica que o JDK ou o contêiner subjacente fornecerá a dependência no tempo de execução. A dependência estará disponível no momento da compilação, mas não empacotada no artefato.

* runtime: as dependências definidas com este escopo estarão disponíveis apenas em tempo de execução, mas não em tempo de compilação. Um exemplo de uso: Imagine se você estiver usando o driver MySQL dentro do seu projeto, você pode adicionar a dependência com escopo como tempo de execução, para garantir que a abstração da API JDBC seja usada em vez da API do driver MySQL durante a implementação. Se o código-fonte incluir qualquer classe que faça parte da API JDBC do MySQL, o código não será compilado, pois a dependência não está disponível no momento da compilação.

* test: as dependências estão disponíveis apenas no momento da execução dos testes, exemplos típicos incluem Junit.

* system: é semelhante ao escopo provided, mas a única diferença é que precisamos mencionar explicitamente onde a dependência pode ser encontrada no sistema, usando a tag systemPath:

```````
<systemPath>${basedir}/lib/some-dependency.jar</systemPath>
```````

**Você pode executar a fase de instalação do ciclo de vida digitando o comando abaixo:**

```````
mvn install
```````

A fase de instalação inclui também as fases anteriores do ciclo de vida, portanto, como parte desta fase maven:

* valida nosso pom.xml (validate)
* compila nosso código fonte (compile)
* executa nossos testes (test)
* empacota nosso código-fonte em JAR (package)
* instala o JAR em nosso repositório local (install)

### Ver o classpath

```````
mvn dependency:build-classpath -DincludeScope=compile
```````

```````
mvn dependency:build-classpath -DincludeScope=test
```````

```````
mvn dependency:build-classpath -DincludeScope=runtime
```````

### Dependências Opcionais

* Utilizado quando uma dependência não é necessária para os projetos que irão reutilizar seu componente

```````apache
<optional></optional>
```````

## Maven Build Lifecycle

* Composto por 3 ciclos de vida

* Cada ciclo possui fases

* Cada fase possui objetivos

### Default

* Principal ciclo

* Responsável pelo deploy local

* Composto por 23 fases

#### Principais Fases

* validate

* compile

* test-compile

* test

* integration-test

* package

* install

* deploy

--- 

### Clean

* Ciclo intermediário

* Responsável pela limpeza do projeto

* Composto por 3 fases

#### Fases

* pre-clean

* clean

* post-clean

---

### Site

* Ciclo final

* Responsável pela criação do site de documentação do projeto

* Composto por 4 fases

#### Fases

* pre-site

* site

* post-site

* site-deploy

## Projeto multi-módulos

```````
mvn archetype:generate -DgroupId=one.digital.innovation -DartifactId=project-parent -Darchetype=maven-quick-start
```````

Mudar o pom.xml

```````apache
<packaging>pom</packaging>
```````

Dentro da pasta do projeto project-parent:

```````
mvn archetype:generate -DgroupId=one.digital.innovation -DartifactId=core -Darchetype=maven-quick-start
```````

```````
mvn archetype:generate -DgroupId=one.digital.innovation -DartifactId=service -Darchetype=maven-quick-start
```````

```````
mvn archetype:generate -DgroupId=one.digital.innovation -DartifactId=controller -Darchetype=maven-quick-start
```````

## Plugins

* Ficam dentro da tag build

Uso:

```````
mvn [plugin-name]:[goal-name]
```````

### Gerando Javadoc

Adicionando o plugin ao projeto

```````apache
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-javadoc-plugins</artifactId>
  <version>3.3.1</version>
</plugin>
```````

---

Gerando documentação na pasta target
```````
mvn javadoc:javadoc
```````

