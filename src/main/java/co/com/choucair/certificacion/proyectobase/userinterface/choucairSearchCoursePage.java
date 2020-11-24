package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class choucairSearchCoursePage extends PageObject {
    public static final Target IMG_COURSES_AND_CERTIFICATIONS =
            Target.the("IMAGE FOR CHOICE OF COURSE AND CERTIFICATION").located(By.xpath("//*[@id='certificaciones']/a/img"));
    public static final Target LST_COURSE =
            Target.the("LIST OF COURSES AND CERTIFICATIONS").locatedBy ("//div[@class='course-title']//h4[contains(text(),'{0}')]");
    public static final Target TXT_COURSES_AND_CERTIFICATIONS =
            Target.the("NAME OF COURSES OR CERTIFICATIONS").located(By.xpath("//h3[@class='coursename']//a[1]"));

}
