package co.com.certification.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AboutUsPage {
    public static final Target CORPORATE_INF = Target.the("Corporate information option").locatedBy("//div[@id='navbar-collapse-grid']/ul/li/a[contains (text(), 'Corporativa')]");

    public static final Target SUPPLIERS = Target.the("Suppliers option").locatedBy("//div[@class='col-sm-12 submenu']/ul/li/a[contains (text(), 'Proveedores')]");
}
