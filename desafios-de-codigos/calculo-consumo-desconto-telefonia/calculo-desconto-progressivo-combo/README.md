## Descrição
Implemente um programa que calcule o valor total de um combo de serviços (telefonia móvel, banda larga e TV por assinatura) aplicando um desconto progressivo baseado na quantidade de serviços contratados. Cada serviço adicional contratado além do primeiro aumenta o desconto. A implementação deve utilizar Programação Orientada a Objetos (POO) para representar os serviços e os descontos.

Para resolver este desafio, considere:

Limite de Serviços: O combo pode ter no máximo três serviços.
Valores de Serviço: Cada serviço tem um valor individual.
Serviço Não Contratado: Se o valor de um serviço for 0, significa que o serviço não foi contratado.
Desconto Progressivo: O desconto é aplicado de forma progressiva conforme fornecido na entrada:
1 serviço contratado: desconto1% de desconto
2 serviços contratados: desconto2% de desconto
3 serviços contratados: desconto3% de desconto
Serviço Especial: Se o usuário contratar todos os três serviços, um desconto adicional fixo de R$ 20,00 é aplicado ao valor final após o desconto progressivo.

## Entrada
A entrada deve ser fornecida em duas linhas:

A primeira linha contém os valores dos serviços contratados separados por vírgulas (telefonia móvel, banda larga, TV por assinatura). Um valor 0 indica que o serviço não foi contratado.
A segunda linha contém os percentuais de desconto para 1, 2 e 3 serviços contratados respectivamente, também separados por vírgulas.
## Saída
Deverá retornar o valor total com o desconto aplicado.