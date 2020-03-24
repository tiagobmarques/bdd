package bdd.tax.calculation;

import bdd.tax.calculation.service.TaxCalculation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TaxCalculationTest {
    private double receita;
    public BigDecimal imposto;

   /* @Given("que eu tenho uma receita de {double}")
    public void que_eu_tenho_uma_receita_de(Double double1) {
        this.receita = double1;
    }

    @When("Eu executar o calculo do Simples Nacional")
    public void eu_executar_o_calculo_do_Simples_Nacional() {
        TaxCalculation tax = new TaxCalculation(BigDecimal.valueOf(receita));
        tax.calculate();
        imposto = tax.tax;
    }

    @Then("Eu devo ter um imposto a pagar de {double}")
    public void eu_devo_ter_um_imposto_a_pagar_de(Double double1) {
        assertTrue(BigDecimal.valueOf(double1).compareTo(imposto) == 0);
    }*/
/*

    @Given("que eu tenho uma receita de {double}")
    public void que_eu_tenho_uma_receita_de(Double double1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Eu executar o calculo do Simples Nacional")
    public void eu_executar_o_calculo_do_Simples_Nacional() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Eu devo ter um imposto a pagar de {double}")
    public void eu_devo_ter_um_imposto_a_pagar_de(Double double1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
*/

}
