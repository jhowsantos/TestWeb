package pages;

import support.DriverQA;

public class Usuarios {
    private DriverQA driver;

    public Usuarios(DriverQA stepDriver){
        driver = stepDriver;
    }

    public boolean verificarDados(String valor) {
        return driver.elementExists("p:contains('"+valor+"')");
    }

}
