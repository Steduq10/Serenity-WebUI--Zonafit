package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Pedido extends PageObject {

    public static final Target DESCRIPCIONPRODUCTO = Target
            .the("DESCRIPCIONPRODUCTO")
            .located(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[1]/section/table/tbody/tr[1]/td[1]"));

    public static final Target PRECIOPRODUCTO = Target
            .the("PRECIOPRODUCTO")
            .located(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[1]/section/table/tbody/tr[1]/td[2]"));

    public static final Target SUBTOTAL = Target
            .the("SUBTOTAL")
            .located(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[1]/section/table/tfoot/tr[1]/th"));

    public static final Target SUBTOTALVALOR = Target
            .the("SUBTOTALVALOR")
            .located(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[1]/section/table/tfoot/tr[1]/td/span"));

    public static final Target DESCUENTO = Target
            .the("DESCUENTO")
            .located(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[1]/section/table/tfoot/tr[2]/th"));

    public static final Target DESCUENTOVALOR = Target
            .the("DESCUENTOVALOR")
            .located(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[1]/section/table/tfoot/tr[2]/td/span"));

    public static final Target ENVIO = Target
            .the("ENVIO")
            .located(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[1]/section/table/tfoot/tr[3]/th"));

    public static final Target ENVIOVALOR = Target
            .the("ENVIOVALOR")
            .located(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[1]/section/table/tfoot/tr[3]/td"));

    public static final Target METODOPAGO = Target
            .the("METODOPAGO")
            .located(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[1]/section/table/tfoot/tr[4]/th"));

    public static final Target METODOPAGOVALOR = Target
            .the("METODOPAGOVALOR")
            .located(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[1]/section/table/tfoot/tr[4]/td"));

    public static final Target TOTAL = Target
            .the("TOTAL")
            .located(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[1]/section/table/tfoot/tr[5]/th"));

    public static final Target TOTALVALOR = Target
            .the("TOTALVALOR")
            .located(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div[1]/section/table/tfoot/tr[5]/td/span"));
}
