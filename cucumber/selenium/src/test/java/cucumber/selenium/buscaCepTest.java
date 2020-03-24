package cucumber.selenium;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

public class buscaCepTest {

    WebDriver dr;

    @Given("Que eu navegue para o site do correios")
    public void que_eu_navegue_para_o_site_do_correios() {
        dr = new ChromeDriver();
        dr.get("http://www.buscacep.correios.com.br/sistemas/buscacep/buscaLogBairro.cfm");
    }

    @When("eu informar o estado de {string}, localidade {string}, bairro {string}")
    public void eu_informar_o_estado_de_localidade_bairro(String estado, String cidade, String bairro) {
        Select selectUF = new Select(dr.findElement(By.name("UF")));
        selectUF.selectByVisibleText(estado);

        WebElement inputLocalidade = dr.findElement(By.name("Localidade"));
        inputLocalidade.sendKeys(cidade);

        WebElement inputBairro = dr.findElement(By.name("Bairro"));
        inputBairro.sendKeys(bairro);
    }

    @When("clicar no botao Buscar")
    public void clicar_no_botão_Buscar() {
        WebElement buttonBuscar = dr.findElement(By.cssSelector("input[type='submit'"));
        buttonBuscar.click();
    }

    @Then("devera existir um logradouro chamado {string}")
    public void devera_existir_um_logradouro_chamado(String string) {
        String codigoPagina = dr.getPageSource();
        assertTrue(dr.findElement(By.cssSelector("table.tmptabela")).getText().indexOf("Manoel Jovino Patr") > 0);
        dr.close();
    }
}
