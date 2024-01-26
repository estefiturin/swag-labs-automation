Feature: CP-02 - Validar carritos de compra

  Background: Realizar 3 validaciones en el carrito de compras
    Given el usuario navega al sitio web
    When ingresa credenciales válidas

    Scenario: 1 - Listar los productos en el carrito de compras
      And agrega productos al carrito de compras
      And da click en el icono del carrito
      Then el sistema deberia de listar los productos agregados en el carrito de compras

    Scenario: 2 - Cuando la cesta este vacia de productos, no procesar la compra
      And da click en el icono del carrito
      Then el sistema deberia de mostrar la cesta sin productos

    Scenario: 3 - Cuando se quiera procesar la compra se mostrara un mensaje de compra exitosa
