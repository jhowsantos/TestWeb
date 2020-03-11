package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.*;
import org.junit.Assert;
import pages.*;
import support.BaseSteps;

public class CrudUsuarioSteps extends BaseSteps {

    private static Home home = new Home(driver);
    private static ListaUsuarios listaUsuarios = new ListaUsuarios(driver);
    private static NovoUsuario novoUsuario = new NovoUsuario(driver);
    private static CadastroUsuarioComSucesso cadastroUsuarioComSucesso = new CadastroUsuarioComSucesso(driver);
    private static Usuarios usuarios = new Usuarios(driver);

    private String idLogin;

    @Dado("^que o usuário acessa a home da aplicação$")
    public void queoUsuarioAcessaAHomeDaAplicacao() throws Throwable {
        home.openPage();
    }

    @E("^clica na opção Usuários no menu$")
    public void clicaNaOpcaoUsuariosNoMenu() throws Throwable {
        home.clickUsuarioMenu();
    }

    @E("^clica no botão Novo Usuário$")
    public void clicaNoBotaoNovoUsuario() throws Throwable {
        listaUsuarios.clickNovoUsuario();
    }

    @E("^preencher o login com \"([^\"]*)\"$")
    public void preencherOLoginCom(String login) throws Throwable {
        novoUsuario.fillLoginXpath(login);
    }

    @E("^preencher o nome completo com \"([^\"]*)\"$")
    public void preencherONomeCompletoCom(String nome) throws Throwable {
        novoUsuario.fillNomeXpath(nome);
    }

    @E("^preencher o email com \"([^\"]*)\"$")
    public void preencherOEmailCom(String email) throws Throwable {
        novoUsuario.fillEmailXpath(email);
    }

    @E("^preencher a idade com (\\d+)$")
    public void preencherAIdadeCom(String idade) throws Throwable {
        novoUsuario.fillIdadeXpath(idade);
    }

    @Quando("^clicar no botão \"([^\"]*)\"$")
    public void clicarNoBotao(String botao) throws Throwable {
        novoUsuario.clickBotao(botao);
    }

    @Quando("^clicar no botão Salvar$")
    public void clicarNoBotao() throws Throwable {
        novoUsuario.clickBotaoSalvar();
    }

    @Então("^o usuário deve ver a mensagem \"([^\"]*)\"$")
    public void oUsuarioDeveVerAMensagem(String text) throws Throwable {
        Assert.assertEquals(text, cadastroUsuarioComSucesso.getResult());
    }

    @E("^ver o nome completo \"([^\"]*)\"$")
    public void verONomeCompleto(String login) throws Throwable {
       idLogin = listaUsuarios.getId(login);
    }

    @Quando("^clicar em \"([^\"]*)\"$")
    public void clicarEm(String btn) throws Throwable {
        String botao = (btn+"_"+idLogin);
        listaUsuarios.clickBotaoApagar(botao);
    }

    @Quando("^clicar no \"([^\"]*)\"$")
    public void clicarNo(String btn) throws Throwable {
        String botao = (btn+"_"+idLogin);
        listaUsuarios.clickBotaoMostrar(botao);
    }

    @Então("^o nome completo \"([^\"]*)\" não deve ser exibido$")
    public void oNomeCompletoNaoDeveSerExibido(String nomeCompleto){
        boolean elementExists = listaUsuarios.getNomeCompleto(nomeCompleto);
        Assert.assertFalse(elementExists);
    }

    @Então("^deve visualizar o \"([^\"]*)\" com \"([^\"]*)\"$")
    public void deveVisualizarOCom(String campo, String valor){
        boolean elementExists = usuarios.verificarDados(valor);
        Assert.assertTrue(elementExists);
    }

    @Então("^o usuário deve ver a mensagem de erro \"([^\"]*)\"$")
    public void oUsuárioDeveVerAMensagemDeErro(String mensagem) throws Throwable {
        Assert.assertEquals(mensagem, novoUsuario.recuperarMensagemDeErro());
    }
}
