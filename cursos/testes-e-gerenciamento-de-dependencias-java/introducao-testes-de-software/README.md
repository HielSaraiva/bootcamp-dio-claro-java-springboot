## Evolução de Testes na Engenharia de Software

* Modelo Cascata

   Especificação -> Projeto de Software -> Implementação -> Testes Unitários -> Integração -> Testes de Sistema -> Operação e Manutenção

* Desenvolvimento Ágil: os testes não são uma fase separada realizada após o desenvolvimento, mas ocorrem continuamente durante todo o ciclo de desenvolvimento, contribuindo para a entrega de software de alta qualidade em ciclos curtos

## Níveis de Testes

**1. Testes de unidade (Testes unitários)**

* Testes de pequenas partes do código (método, função)

**2. Testes de integração**

* Teste de alto nível (conectando com banco de dados, APIs)

**3. Teste de sistema**

* Deploy no ambiente de testes, abrir o aplicativo ou site

**4. Teste de regreção**

* Validando se as novas features não quebram o código já escrito

* Alpha (mais inical, gama reduzida de pessoas), Beta (número maior de pessoas), Cannary (segmenta o público que vai ver a versão em produção antes de liberar para o público geral)

**5. Teste de aceitação**

* O usuário/cliente testa o software e vê se está satisfeito

* Automatizado pelo BDD 

## Técnicas de Teste

**1. Caixa Branca**

* Teste Estrutural

* Validar dados, controles, fluxos, chamadas

* Garantir a qualidade da implementação

* Níveis: Unidade, Integração, Regressão

**2. Caixa Preta**

* Teste Funcional

* Verificar saídas usando vários tipos de entrada

* Teste sen conhecer a estrutura interna do software

* Níveis: Integração, Sistema, Aceitação

**3. Caixa Cinza**

* Mescla de Caixa Branca e Preta

* Analisa parte lógica e também funcionalidade

* Exemplo: Ter acesso a documentação do funcionamento do código

* Engenharia Reversa

## Testes não funcionais

* Estão ligados a requisitos não funcionais:

   1. Comportamento do Sistema
   2. Performance
   3. Escalabilidade
   4. Segurança
   5. Infraestrutura

   Ex.: "Qual plataforma o sistema deverá rodar?"

* Tem o objetivo de testar aspectos do software que não são associados as regras de negócio, mas sim a requisitos não funcionais

**1. Teste de carga**

* Realizado para verificar qual o volume de transações, acessos simultâneos ou usuários que um servidor/software/sistema suporta

* Gatling e Apache JMeter

**2. Teste de stress**

* Realizado para submeter o software a situações extremas. Testar os limites do software e avaliar seu comportamento

* Apache JMeter

**3. Teste de segurança**

* É um processo crítico  de segurança cibernética que visa detectar vulnerabilidade em sistemas, software, redes e aplicativo

* ZAP (Zed Attack Proxy)

## Pirâmides de testes

Topo do pirâmide (lento/maior integração)

0. Manual de Testes
1. Teste UI/Teste end-to-end (sistema/regreção)
2. Teste de serviço (integração)
3. Teste de unidade (unitário)

Base da pirâmide (rápido/mais isolado)

Obs.: Evitar Antipattern (pirâmide invertida)