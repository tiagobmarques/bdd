#language: pt
Funcionalidade: Calcular o Simples Nacional

  Delineação do Cenário: Calcular o valor final do imposto Simples Nacional
    Dado que eu tenho uma receita de <receita>
    Quando Eu executar o calculo do Simples Nacional
    Então Eu devo ter um imposto a pagar de <imposto>

    Exemplos: :
    |receita    |imposto    |
    |100000.00  | 4000.00   |
    |200000.00  |14540.60   |
    |400000.00  |37861.40   |
#    |800000.00  |85375.00   |
    |2800000.00 |0.00       |