package tests;

import core.Base;
import core.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PesquisasTest extends Base {


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

}
