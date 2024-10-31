## O que são mocks

* Mockar com o Mockito significa criar objetos simulados, chamados de "mocks", para substituir componentes reais durante os testes unitários

## Para usar o Mockito e integrá-lo com JUnit 5

1. Mockito JUnit Jupiter Dependency
2. Mockito Core Dependency

## Annotations

```````java
@ExtendWith(MockitoExtension.class) // Para ser possível usar o Mockito

@Mock // Mocks são imitações ou unidades falsas que simulam o comportamento de unidades reais

@InjectMocks // Injetando o Mock em outra classe

@Spy // Captura mensagens enviadas para a camada seguinte do código (um teste mais real)

@Stub // Parecido com o Mock, mas vai nos dizer se o resultado do código retorna de acordo com os parâmetros passado, se retorna sucesso, erro ou exceção
```````


