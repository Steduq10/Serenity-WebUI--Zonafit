package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DetallesPago extends PageObject {


    public static final Target OFERTAS = Target
            .the("OFERTAS")
            .located(By.xpath("//a[@href=\"https://zonafit.co/categoria-producto/ofertas/\"]"));

    public static final Target PRODUCTO_01 = Target
            .the("Mass Tech Extreme 20 lb + Creatine Drive 300 gr + Obsequio")
            .located(By.xpath("//a[@href=\"/categoria-producto/ofertas/?add-to-cart=254992\"]"));

    public static final Target FINALIZAR = Target
            .the("FINALIZAR")
            .located(By.xpath("//a[@href=\"https://zonafit.co/checkout/\"]"));
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

    public static final Target OPCIONDEPARTAMENTO = Target
            .the("OPCIONDEPARTAMENTO")
            .located(By.xpath("//*[@id=\"billing_state_field\"]/span/span"));
    public static final Target DEPARTAMENTO = Target
            .the("DEPARTAMENTO")
            .located(By.xpath("//input[@class=\"select2-search__field\"]"));


    public static final Target CORRECTODEPARTAMENTO = Target
            .the("CORRECTODEPARTAMENTO")
            .located(By.xpath("//li[@class=\"select2-results__option select2-results__option--highlighted\"]"));

    public static final Target OPCIONMUNICIPIO = Target
            .the("OPCIONMUNICIPIO")
            .located(By.xpath("//*[@id=\"billing_city_field\"]/span"));

    public static final Target MUNICIPIO = Target
            .the("MUNICIPIO")
            .located(By.xpath("//input[@class=\"select2-search__field\"]"));


    public static final Target CORRECTOMUNICIPIO = Target
            .the("CORRECTOMUNICIPIO")
            .located(By.xpath("//li[@class=\"select2-results__option select2-results__option--highlighted\"]"));

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
            //.located(By.xpath("//input[@name=\"terms-field\"]"));
    public static final Target ORDEN = Target
            .the("ORDEN")
            .located(By.id("place_order"));
            //.located(By.xpath("button[@id=\"place_order\"]"));


    public static final Target MENSAJEALERTA = Target
            .the("MENSAJEALERTA")
            .located(By.xpath("//div[@class=\"message-container container alert-color medium-text-center\"]"));

}
