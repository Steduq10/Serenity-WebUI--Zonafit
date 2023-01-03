package userinterfaces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras extends PageObject {




    public static final Target OFERTAS = Target
            .the("OFERTAS")
            .located(By.xpath("//a[@href=\"https://zonafit.co/categoria-producto/ofertas/\"]"));

    @FindBy(xpath = "//div[@class='add-to-cart-button']/a[contains(text(),'Añadir al carrito')]")
    private static List<Target> productos;

    public static List<Target> getListOfTargetElements() {
        int sizeOfOptions = Target.the("Lista Productos").located(By.xpath("//div[@class='add-to-cart-button']/a[contains(text(),'Añadir al carrito')]")).resolveAllFor(new Actor("Steven")).size();
        List<Target> listOfTarget = null;
        for (int i = 0; i < sizeOfOptions; i++) {
            listOfTarget.add(Target.the("element:" + i).locatedBy("div/eleme[" + i + "]"));
            System.out.println(listOfTarget.toString());
        }
        return listOfTarget;

    }

    private static List<Integer> productosSeleccionados = new ArrayList<>();

    public static List<Target> getProductos() {
        return productos;
    }

    private static List<Integer> productoAleatorio(List<Target> productos){


        for(int i = 0; i < 4; i ++ ){
            //int getIndiceAleatorio = (int)(Math.random()*(productos.size()-0) + 0);
            int getIndiceAleatorio = (int)(Math.random()*(getListOfTargetElements().size()-0) + 0);
            productosSeleccionados.add(getIndiceAleatorio);
        }
        return productosSeleccionados;
    }


    public static final Target PRODUCTO_01 = Target
            .the("Mass Tech Extreme 20 lb + Creatine Drive 300 gr + Obsequio")
            .located(By.xpath("//a[@href=\"/categoria-producto/ofertas/?add-to-cart=254992\"]"));

    public static final Target PRODUCTO_02 =
            Target
            .the("Mass Tech Extreme 6 lb + Creatine Drive 300 gr + Obsequio")
            .located(By.xpath("//a[@href=\"/categoria-producto/ofertas/?add-to-cart=254990\"]"));
            //getListOfTargetElements().get(productosSeleccionados.get(1));

    public static final Target PRODUCTO_03 = Target
            .the("Megaplex Creatine Power 10 lb + 2 lb + Creatine Pum 120 caps + Tribulus Extreme 100 caps")
            .located(By.xpath("//a[@href=\"/categoria-producto/ofertas/?add-to-cart=196145\"]"));
            //getListOfTargetElements().get(productosSeleccionados.get(2));

    public static final Target PRODUCTO_04 = Target
            .the("100% Whey Premium -5 lb Nutrex")
            .located(By.xpath("//a[@href=\"?add-to-cart=254614\"]"));
            //getListOfTargetElements().get(productosSeleccionados.get(3));

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
