package starter.titles;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class TitlesData {
    public static Question<String> firstTitle(){
        return actor -> TextContent.of(TitlesOverview.SER_CHOUCAIR_TITLE).viewedBy(actor).asString().trim();
    }

    public static Question<String> secondTitle(){
        return actor -> TextContent.of(TitlesOverview.CONVOCATORIAS_TITLE).viewedBy(actor).asString().trim();
    }

    public static Question<String> thirdTitle(){
        return actor -> TextContent.of(TitlesOverview.PREPARARSE_PARA_APLICAR_TITLE).viewedBy(actor).asString().trim();
    }
}
