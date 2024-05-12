package co.com.certification.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SuppliersPage {
    public static final Target HEADER_PAGE = Target.the("Supplier Page Header").locatedBy("//div[@class='encabezado titulo-contenido']");

    public static final Target BTN_KNOW_MORE = Target.the("Botón conoce más del aviso convocatoria para fideicomiso").locatedBy("(//div/a/button[@class='btn btn-primary'])[1]");

    public static final Target TITLE_POPUP_SCREEN = Target.the("popup screen title").locatedBy("//div[@id='inline1']/div/h4[contains (text(), 'Aviso de Convocatoria')]");

    public static final Target BTN_DOWNLOAD= Target.the("Boton descargar").locatedBy("//div[@id='inline1']/div/a/button");

}
