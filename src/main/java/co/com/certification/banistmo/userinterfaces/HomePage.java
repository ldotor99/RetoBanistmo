package co.com.certification.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target BTN_UNDERSTOOD = Target.the("Button understands the privacy notice").located(By.id("btn-aceptar-cookies"));

    public static final Target ABOUT_US = Target.the("Option about us from the top").locatedBy("(//div/nav[@id='menu-top']/div/ul/li)[4]");
}
