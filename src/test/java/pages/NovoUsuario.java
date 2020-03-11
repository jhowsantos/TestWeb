package pages;

import support.DriverQA;

public class NovoUsuario {

    private DriverQA driver;

    public NovoUsuario(DriverQA stepDriver){
        driver = stepDriver;
    }

    public void fillLoginXpath(String value) {
        driver.sendKeys(value,"//*[@id=\"user_login\"]", "xpath");
    }

    public void fillNomeXpath(String value) {
        driver.sendKeys(value,"//*[@id=\"user_full_name\"]", "xpath");
    }

    public void fillEmailXpath(String value) {
        driver.sendKeys(value,"//*[@id=\"user_email\"]", "xpath");
    }

    public void fillIdadeXpath(String value) {
        driver.sendKeys(value,"//*[@id=\"user_age\"]", "xpath");
    }

    public void clickBotaoSalvar(){
        driver.click("btn-save", "id");
    }

    public void clickBotao(String botao){
        driver.click("//a[contains(text(), '"+botao+"')]", "xpath");
    }

    public String recuperarMensagemDeErro(){
        return driver.getText("p[role='alert']", "css");
    }

}

