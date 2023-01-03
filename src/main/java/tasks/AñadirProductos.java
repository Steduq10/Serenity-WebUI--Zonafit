package tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.By;

import java.util.List;

public class AñadirProductos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> productos =
                BrowseTheWeb
                .as(actor)
                        .findAll(By.xpath("//div[@class='add-to-cart-button']/a[contains(text(),'Añadir al carrito')]"));
        productos.stream().limit(4).forEach(x->{
                    Scroll.to(x);
                    x.click();
                });
    }

    public static AñadirProductos añadirProductos(){
        return new AñadirProductos();
    }
}
