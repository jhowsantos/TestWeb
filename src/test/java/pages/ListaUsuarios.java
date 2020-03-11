package pages;

import support.DriverQA;

public class ListaUsuarios {
    private DriverQA driver;

    public ListaUsuarios(DriverQA stepDriver){
        driver = stepDriver;
    }

    public void clickNovoUsuario(){
        driver.click("btn-new", "id");
    }

    public void clickBotaoApagar(String botao) throws InterruptedException {
        driver.click(botao, "id");
        driver.ChooseOkOnNextConfirmation();
        Thread.sleep(10000);
    }

    public void clickBotaoMostrar(String botao) throws InterruptedException {
        driver.click(botao, "id");
    }

    public String getId(String login){
        String loginName = driver.getId("//td[contains(text(),'"+login+"')]", "xpath");
        String [] array = loginName.split("_");

        return array[1];
    }

    public boolean getNomeCompleto(String nome){
        return  driver.elementExists("//td[contains(text(), '"+nome+"')]");
    }
}
