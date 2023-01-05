package userinterfaces;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class CarritoCompras extends PageObject {





    public static String numero(int index){
        List<String> productos = new ArrayList<>();

        for (int i =1; i < 17; i ++){
            String numero = String.valueOf(i);
            productos.add(numero);

        }
        Collections.shuffle(productos);
        System.out.println("El tamaño de la lista es: " + productos.size());

       // List<String> productos = Arrays.asList("1","2","3","4");

        String xpathArticulo = "(//a[contains(text(),'Añadir al carrito')])[%s]";
        xpathArticulo = String.format(xpathArticulo, productos.get(index));
        System.out.println(xpathArticulo);
        System.out.println(productos.get(index));
        return xpathArticulo;
    }
    public static final Target ACERCADE = Target
            .the("ACERCADE")
            .located(By.id("nav_menu-3"));


    public static final Target OFERTAS = Target
            .the("OFERTAS")
            .located(By.xpath("//a[@href=\"https://zonafit.co/categoria-producto/ofertas/\"]"));

    @FindBy(xpath = "//div[@class='add-to-cart-button']/a[contains(text(),'Añadir al carrito')]")
    private static List<Target> productos;



    public static  Target PRODUCTO_01 = Target
            .the("Mass Tech Extreme 20 lb + Creatine Drive 300 gr + Obsequio")
            //.located(By.xpath("(//a[contains(text(),'Añadir al carrito')])[1]"));
            .located(By.xpath(numero(0)));
    public static  Target PRODUCTO_02 =
            Target
            .the("Mass Tech Extreme 6 lb + Creatine Drive 300 gr + Obsequio")
                    //.located(By.xpath("(//a[contains(text(),'Añadir al carrito')])[2]"));
                    .located(By.xpath(numero(1)));

    public static  Target PRODUCTO_03 = Target
            .the("Megaplex Creatine Power 10 lb + 2 lb + Creatine Pum 120 caps + Tribulus Extreme 100 caps")
            //.located(By.xpath("(//a[contains(text(),'Añadir al carrito')])[3]"));
            .located(By.xpath(numero(2)));

    public static  Target PRODUCTO_04 = Target
            .the("100% Whey Premium -5 lb Nutrex")
            //.located(By.xpath("(//a[contains(text(),'Añadir al carrito')])[4]"));
            .located(By.xpath(numero(3)));

    public static final Target CLOSEBUTTON = Target
            .the("Close button")
            .located(By.xpath("//button[@title=\"Close (Esc)\"]"));

    public static final Target CARRITO = Target
            .the("VER CARRITO")
            .located(By.xpath("//a[@href=\"https://zonafit.co/cart/\"]"));

    public static final Target PRODUCTO_01_VALIDACION = Target
            .the("Mass Tech Extreme 20 lb + Creatine Drive 300 gr + Obsequio")
            .located(By.xpath("//a[@href=\"https://zonafit.co/shop/mass-tech-extreme-20-lb-creatine-drive-300-gr-obsequio/?bundle_quantity_6005=1&bundle_quantity_6003=1&bundle_quantity_6004=1\"]"));

    public static final Target PRODUCTO_02_VALIDACION = Target
            .the("Mass Tech Extreme 6 lb + Creatine Drive 300 gr + Obsequio")
            .located(By.xpath("//a[@href=\"https://zonafit.co/shop/mass-tech-extreme-6-lb-creatine-drive-300-gr-obsequio/?bundle_quantity_5999=1&bundle_quantity_6000=1&bundle_quantity_6001=1\"]"));

    public static final Target PRODUCTO_03_VALIDACION = Target
            .the("Megaplex Creatine Power 10 lb + 2 lb + Creatine Pum 120 caps + Tribulus Extreme 100 caps")
            .located(By.xpath("//a[@href=\"https://zonafit.co/shop/oferta-megaplex-10lb/?bundle_quantity_401=1&bundle_quantity_5900=1&bundle_quantity_5052=1&bundle_quantity_5901=1\"]"));

    public static final Target PRODUCTO_04_VALIDACION = Target
            .the("100% Whey Premium -5 lb Nutrex")
            .located(By.xpath("//a[@href=\"https://zonafit.co/shop/100-whey-premium-%c2%b7-5-lb-nutrex/\"]"));








}
