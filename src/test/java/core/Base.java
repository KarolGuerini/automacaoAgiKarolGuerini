package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import suport.Generator;
import suport.Screenshot;

public class Base extends Driver{
    public WebDriver navegador = creatChrome();

    public void clicarNoIconeDePesquisa() {
        navegador.findElement(By.id("search-open")).click();
    }
    public void digitarNoCampoDePesquisa(String pesquisa) {
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

    public void gerarScreenshot() {
        String screenshotArquivo = "src/test/java/report/" + Generator.dataHoraParaArquivo() + ".png";
        Screenshot.tirarScreenshot(navegador, screenshotArquivo);
    }

}
