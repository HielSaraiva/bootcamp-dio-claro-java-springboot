## O que são testes unitários

* Testar a menor unidade de código possível

* Unidade: função, método, classes

* Geralmente escrito em tempo de desenvolvimento 

## Por que escrever testes unitários?

* Compreender o código fonte

* Corrigir bugs com segurança

* Refator código sem introduzir bugs

* Entregar com segurança uma nova feature

## Um pouco de história

* JUnit é um framework open source para criação de testes unitários criado por Erich Gamma e Kent Beck

* Kent Beck (TDD)

* Erich Gamma (Gang of Four, Design Patterns)

## Estrutura básica

```````java
class PessoaTeste {
   @Test //--> Anotação é primordial para testar
   void validaVerificacaoDeMaioridade() {
      Pessoa joaozinho = new Pessoa("Joao", LocalDate.of(2024, 1, 1));  //--> Cria um cenário
      Assertions.assertTrue(joaozinho.ehMaiorDeIdade()); //--> Executa as validacoes
   }
}
```````

## Divisão de testes

1. Assertions
2. After e Before
3. Assumptions e Condicionais
4. Exceptions
5. Ordenando

## Boas práticas

* Busque simplicidade

* Preocupe-se com a facilidade de leitura

* Comece a testar cedo (veja um pouco sobre TDD)

* Testes precisam ser determinísticos

* Ferramentas de cobertura de código (Jacoco)

* Automatize a execução dos seus testes