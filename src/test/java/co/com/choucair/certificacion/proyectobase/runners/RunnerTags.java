package co.com.choucair.certificacion.proyectobase.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features ="src/test/resources/co.com.choucair.certificacion.proyectobase/features/academy_choucair.feature",
        tags = {"@stories"},
        snippets = SnippetType.CAMELCASE,
        glue = {"co.com.choucair.certificacion.proyectobase.stepdefinitions"},
        plugin = {"json:target/cucumber_json/cucumber.json"}
)
public class RunnerTags {
}
