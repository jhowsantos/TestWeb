package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.*;
import support.BaseSteps;

public class ProcessoSteps extends BaseSteps {

    private static Home home = new Home(driver);
    private static ListaProcessos listaProcessos = new ListaProcessos(driver);
    private static NovoProcesso novoProcesso = new NovoProcesso(driver);
    private static CadastroProcessoComSucesso processoComSucesso = new CadastroProcessoComSucesso(driver);

    @Dado("^que o usuário está na página Agapito Software Testing$")
    public void queOUsuárioEstáNaPáginaAgapitoSoftwareTesting() {
        home.openPage();
    }

    @E("^clica na opção Processos no menu$")
    public void oUsuarioClicarNoMenu() throws Throwable {
        home.clickProcessosMenu();
    }

    @E("^o usuário clicar no botão novo processo$")
    public void oUsuarioClicarNoBotaoNovoProcesso() {
        listaProcessos.clickNovoProcesso();
    }

    @E("^o usuário digitar no campo \"([^\"]*)\" o valor \"([^\"]*)\"$")
    public void oUsuarioDigitarNoCampoOValor(String campo, String valor) throws Throwable {
        novoProcesso.preencherCampo(campo, valor);
    }

    @E("^o usuário seleciona no campo urgencia o valor \"([^\"]*)\"$")
    public void oUsuárioSelecionaNoCampoOValor(String valor) throws Throwable {
        novoProcesso.selecionarUrgencia(valor);
    }

    @E("^o usuário clica no campo arbitramento com o valor Sim$")
    public void oUsuárioClicaNoCampoArbitramentoComOValorSim() {
        novoProcesso.clicarArbitramentoSim();
    }

    @Quando("^o usuário clicar no botão \"(.*)\" na página de inclusão de processos$")
    public void oUsuarioClicarNoBotaoSalvar(String botao) {
        novoProcesso.clicarSalvar(botao);
    }

    @Então("^o usuário deveria visualizar a mensagem \"([^\"]*)\"$")
    public void oUsuarioDeveriaVisualizarAMensagem(String message) throws Throwable {
        Assert.assertEquals(message, processoComSucesso.recuperarMensagemDeSucesso());
    }

}
