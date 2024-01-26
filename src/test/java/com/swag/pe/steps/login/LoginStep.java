package com.swag.pe.steps.login;

import com.swag.pe.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

// interacciones con el sitio web
public class LoginStep extends LoginPage {

    @Step("Ingresar usuario")
    public void typeUsername(String username){
        txt_username.sendKeys(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password) {
        txt_password.sendKeys(password);
    }

    @Step("Click en el boton login")
    public void clickLogin() {
        btn_login.click();
    }



}
