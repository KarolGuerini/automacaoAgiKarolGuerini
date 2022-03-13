package tests;

import core.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PesquisasTest extends Driver {

    public WebDriver navegador = creatChrome();

    @Test
    public void fazerPesquisaComValorValido(){
        navegador.findElement(By.id("search-open")).click();
        navegador.findElement(By.className("search-field")).sendKeys("evento");
        navegador.findElement(By.className("search-submit")).submit();
        navegador.findElement(By.xpath("//span[contains(.,'evento')]"));

    }

    @Test
    public void fazerPesquisaComValorInvalido(){
        navegador.findElement(By.id("search-open")).click();
        navegador.findElement(By.className("search-field")).sendKeys("@#$%");
        navegador.findElement(By.className("search-submit")).submit();
        navegador.findElement(By.xpath("//h1[contains(.,'Nenhum resultado')]"));

    }


}
