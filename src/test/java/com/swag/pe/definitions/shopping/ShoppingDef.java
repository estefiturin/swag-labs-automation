package com.swag.pe.definitions.shopping;

import com.swag.pe.steps.login.LoginStep;
import com.swag.pe.steps.products.SelectProductStep;
import com.swag.pe.steps.shopping.ShoppingCartStep;
import com.swag.pe.steps.validation.ValidationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class ShoppingDef {

    @Steps(shared = true)
    SelectProductStep selectProduct;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validate;

    @Steps(shared = true)
    ShoppingCartStep shoppingCart;

    @And("agrega productos al carrito de compras")
    public void userAddProducts() {
        selectProduct.addProducts(3);
    }

    @And("da click en el icono del carrito")
    public void userClickShoppingCartIcon() {
        selectProduct.clickShoppingCartIcon();
    }

    @Then("el sistema deberia de listar los productos agregados en el carrito de compras")
    public void systemListProducts() {
        Assert.assertTrue(validate.productsAreDisplayed());
    }

    @Then("el sistema deberia de mostrar la cesta sin productos")
    public void systemShowEmptyShoppingCart() {
        Assert.assertTrue(validate.shoppingCartIsEmpty());
    }

    @When("completa todo el registro de la orden")
    public void userCompleteOrder() {
        shoppingCart.clickCheckoutButton();
        shoppingCart.typeFirstName("Estefania");
        shoppingCart.typeLastName("Turin");
        shoppingCart.typePostal("5000");
        shoppingCart.clickContinue();
        shoppingCart.clickFinish();
    }
    @Then("el sistema deberia procesar la compra")
    public void systemProcessShoppingCart() {
        Assert.assertTrue(validate.orderTextIsDisplayed());
    }


}
