package co.com.certification.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateDocument implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
            return actor.recall("status");
    }
    public static ValidateDocument validateDocument(){
        return new ValidateDocument();
    }
}
