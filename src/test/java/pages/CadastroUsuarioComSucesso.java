package pages;

import support.DriverQA;

public class CadastroUsuarioComSucesso {

    private DriverQA driver;

    public CadastroUsuarioComSucesso(DriverQA stepDriver){
        driver = stepDriver;
    }

    public String getResult(){
        return driver.getText("notice");
    }
}

