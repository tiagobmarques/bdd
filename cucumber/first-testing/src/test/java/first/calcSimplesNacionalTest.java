package first;

import first.testing.calcSimplesNacional;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class calcSimplesNacionalTest {
    private double receita;
    public double imposto;

    @Given("que eu tenho uma {double}")
    public void que_eu_tenho_uma(Double double1) {
        this.receita = double1;
    }

    @When("Eu executar o calculo do imposto do Simples Nacional")
    public void eu_executar_o_calculo_do_imposto_do_Simples_Nacional() {
        imposto = new calcSimplesNacional(receita).calcula();
    }

    @Then("Eu devo ter um imposto a pagar de {double}")
    public void eu_devo_ter_um_imposto_a_pagar_de(Double double1) {
        assertEquals(double1, imposto, 0.01);
    }

    @Then("Eu devo ter o valor de IRPJ do valor de {double}")
    public void eu_devo_ter_o_valor_de_IRPJ_do_valor_de(Double double1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}