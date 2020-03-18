Feature: Calculo do Simples Nacional
  Saber para uma determinada receita o valor do simples nacional

  Scenario Outline: Calcular o valor final do Simples Nacional
    Given que eu tenho uma <receita>
    When Eu executar o calculo do imposto do Simples Nacional
    Then Eu devo ter um imposto a pagar de <imposto>

    Examples:
      | receita        | imposto    |
      | 100000.00      | 4000.00    |
      | 200000.00      | 14540.6    |
      | 400000.00      | 37861.4    |