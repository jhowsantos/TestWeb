package pages;

import support.DriverQA;

public class CadastroProcessoComSucesso {

    private DriverQA driver;

    public CadastroProcessoComSucesso(DriverQA stepDriver){
        driver = stepDriver;
    }

    public String recuperarMensagemDeSucesso(){
        return driver.getText("notice");
    }
}

