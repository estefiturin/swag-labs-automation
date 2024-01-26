package com.swag.pe.steps.validation;

import com.swag.pe.pages.validation.ValidationPage;
import io.cucumber.java.AfterStep;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {
    @Step("Validar visualizacion del modulo de productos")
    public Boolean titleIsVisible() {
        return lbl_product.isDisplayed();
    }

    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed() {
        return lbl_errorMessage.isDisplayed();

    }


}
