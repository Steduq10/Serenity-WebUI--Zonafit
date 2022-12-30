package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetallesPago extends PageObject {

    //Este modulo debe de ser independiente, para ello vamos a crear un proceso a parte:
    /*
    1. Escogemos un producto de la tienda y lo agregamos al carrito
    2. En el carrito le damos en finalizar compra para que nos redireccione a el formulario de envio
    3. Diligenciamos el formulario de envio
    4. Ponemos pago por baloto para no tener que especificar con los detalles del pago
     */

    public static final Target DOCUMENTO = Target
            .the("NÚMERO DOCUMENTO")
            .located(By.id("billing_myfield12"));

    public static final Target EMAIL = Target
            .the("EMAIL")
            .located(By.id("billing_email"));

    public static final Target NOMBRE = Target
            .the("NOMBRE")
            .located(By.id("billing_first_name"));

    public static final Target APELLIDO = Target
            .the("APELLIDO")
            .located(By.id("billing_last_name"));

    public static final Target DEPARTAMENTO = Target
            .the("DEPARTAMENTO")
            .located(By.id("select2-billing_state-container"));

    public static final Target MUNICIPIO = Target
            .the("MUNICIPIO")
            .located(By.id("select2-billing_city-container"));

    public static final Target DIRECCION1 = Target
            .the("DIRECCION1")
            .located(By.id("billing_address_1"));

    public static final Target DIRECCION2 = Target
            .the("DIRECCION2")
            .located(By.id("billing_address_2"));

    public static final Target CELULAR = Target
            .the("CELULAR")
            .located(By.id("billing_phone"));

    public static final Target NOTAS = Target
            .the("NOTAS")
            .located(By.id("order_comments"));

    public static final Target PAGOBALOTO = Target
            .the("BALOTO")
            .located(By.id("payment_method_bank_transfer_1"));

    public static final Target TERMINOS = Target
            .the("TERMINOS")
            .located(By.id("terms"));

    public static final Target ORDEN = Target
            .the("ORDEN")
            .located(By.id("place_order"));
}
