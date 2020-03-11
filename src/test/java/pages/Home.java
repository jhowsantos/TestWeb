package pages;

import support.DriverQA;

public class Home {

    private DriverQA driver;

    public Home(DriverQA stepDriver){
        driver = stepDriver;
    }

    public void openPage() {
        String url = "http://agapito-server.herokuapp.com/";
        driver.openURL(url);
    }

    public void clickUsuarioMenu(){
        driver.click("users", "id");
    }

    public void clickProcessosMenu(){
        driver.click("processos", "id");
    }

}
