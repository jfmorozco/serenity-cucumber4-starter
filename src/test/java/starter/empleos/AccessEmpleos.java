package starter.empleos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccessEmpleos implements Task{


    public static Performable withoutCredentials(){
        return instrumented(AccessEmpleos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainNavChoucair.EMPLEOS_BUTTON)
        );

    }
}
