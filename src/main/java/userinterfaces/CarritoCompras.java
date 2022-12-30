package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoCompras extends PageObject {

    public static final Target OFERTAS = Target
            .the("OFERTAS")
            .located(By.xpath("//a[@href=\"https://zonafit.co/categoria-producto/ofertas/\"]"));

    public static final Target PRODUCTO_01 = Target
            .the("Mass Tech Extreme 20 lb + Creatine Drive 300 gr + Obsequio")
            .located(By.xpath("//a[@href=\"/categoria-producto/ofertas/?add-to-cart=254992\"]"));

    public static final Target PRODUCTO_02 = Target
            .the("Mass Tech Extreme 6 lb + Creatine Drive 300 gr + Obsequio")
            .located(By.xpath("//a[@href=\"/categoria-producto/ofertas/?add-to-cart=254990\"]"));

    public static final Target PRODUCTO_03 = Target
            .the("Megaplex Creatine Power 10 lb + 2 lb + Creatine Pum 120 caps + Tribulus Extreme 100 caps")
            .located(By.xpath("//a[@href=\"/categoria-producto/ofertas/?add-to-cart=196145\"]"));

    public static final Target PRODUCTO_04 = Target
            .the("100% Whey Premium -5 lb Nutrex")
            .located(By.xpath("//a[@href=\"?add-to-cart=254614\"]"));

    public static final Target CLOSEBUTTON = Target
            .the("Close button")
            .located(By.xpath("//button[@title=\"Close (Esc)\"]"));
}
