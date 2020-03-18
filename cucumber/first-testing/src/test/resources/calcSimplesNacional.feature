# language: pt
Característica: Calculo do Simples Nacional
  Saber para uma determinada receita o valor do simples nacional

  #Este é o cenário responsável por testar se o valor do imposto calculo pelo sistema é o correto.
  Cenário: Calcular o valor final do Simples Nacional
    Dado que eu tenho uma <receita>
    Quando Eu executar o calculo do imposto do Simples Nacional
    Então Eu devo ter um imposto a pagar de <imposto>

    Exemplos:
      | receita        | imposto    |
      | 100000.00      | 4000.00    |
      | 200000.00      | 14540.6    |
      | 400000.00      | 37861.4    |