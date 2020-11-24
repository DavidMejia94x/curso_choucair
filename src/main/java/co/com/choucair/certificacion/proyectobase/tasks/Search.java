package co.com.choucair.certificacion.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certificacion.proyectobase.userinterface.choucairSearchCoursePage.*;

public class Search implements Task {
    private String course;

    public Search(String course) {
        this.course = course;
    }

    public static Search the(String course) {
        return Tasks.instrumented (Search.class, course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(IMG_COURSES_AND_CERTIFICATIONS),
                Click.on(LST_COURSE.of(course)));
    }
}
