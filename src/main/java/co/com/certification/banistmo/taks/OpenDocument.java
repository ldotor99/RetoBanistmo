package co.com.certification.banistmo.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certification.banistmo.userinterfaces.AboutUsPage.*;
import static co.com.certification.banistmo.userinterfaces.HomePage.*;
import static co.com.certification.banistmo.userinterfaces.SuppliersPage.*;

public class OpenDocument implements Task {

    public boolean status=false;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_UNDERSTOOD),
                Click.on(ABOUT_US),
                Click.on(CORPORATE_INF),
                Click.on(SUPPLIERS),
                WaitUntil.the(HEADER_PAGE, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                Scroll.to(BTN_KNOW_MORE),
                Click.on(BTN_KNOW_MORE)
        );
        status =(TITLE_POPUP_SCREEN.isVisibleFor(actor));
        actor.remember("status",status);

    }

    public static OpenDocument openDocument(){
        return Tasks.instrumented(OpenDocument.class);
    }
}
