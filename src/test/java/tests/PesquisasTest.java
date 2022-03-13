package tests;

import core.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PesquisasTest extends Driver {

    public WebDriver navegador = creatChrome();

    @Test
    public void fazerPesquisaComValorValido() {
        clicarNoIconeDePesquisa();
        digitarNoCampoDePesquisa("evento");
        submeterAPesquisa();
        resultadoDaPesquisaValida("evento");
        fecharNavegador();
    }


    @Test
    public void fazerPesquisaComValorInvalido() {
        clicarNoIconeDePesquisa();
        digitarNoCampoDePesquisa("#$%&");
        submeterAPesquisa();
        resultadoDaPesquisaInvalida();
        fecharNavegador();
    }

    private void clicarNoIconeDePesquisa() {
        navegador.findElement(By.id("search-open")).click();
    }

    private void digitarNoCampoDePesquisa(String pesquisa) {
        navegador.findElement(By.className("search-field")).sendKeys(pesquisa);
    }

    public void submeterAPesquisa() {
        navegador.findElement(By.className("search-submit")).submit();
    }

    public void resultadoDaPesquisaValida(String pesquisa) {
        navegador.findElement(By.xpath("//span[contains(.,'" + pesquisa + "')]"));
    }

    public void resultadoDaPesquisaInvalida() {
        navegador.findElement(By.xpath("//h1[contains(.,'Nenhum resultado')]"));
    }

    public void fecharNavegador() {
        navegador.quit();
    }

}
