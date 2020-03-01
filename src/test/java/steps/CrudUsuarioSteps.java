package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Então;
import org.junit.Assert;
import pages.Home;
import support.BaseSteps;

public class CrudUsuarioSteps extends BaseSteps {

    private static Home home = new Home(driver);

    @Dado("^que o usuário acessa a home da aplicação$")
    public void queoUsuarioAcessaAHomeDaAplicacao() throws Throwable {
        home.openPage();
    }

    @Dado("^clica na opção Usuários no menu$")
    public void clicaNaOpcaoUsuariosNoMenu() throws Throwable {
        home.clickUsuarioMenu();
    }
//
//    Dado("^clica no botão \"([^\"]*)\"$", (String arg1) -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    Dado("^preencher o login com \"([^\"]*)\"$", (String arg1) -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    Dado("^preencher o nome completo com \"([^\"]*)\"$", (String arg1) -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    Dado("^preencher o email com \"([^\"]*)\"$", (String arg1) -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    Dado("^preencher a idade com (\\d+)$", (Integer arg1) -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    Quando("^clicar em \"([^\"]*)\"$", (String arg1) -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    Então("^o usuário deve ver a mensagem \"([^\"]*)\"$", (String arg1) -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });

}
