package tests;

import core.Base;
import org.junit.Test;

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
