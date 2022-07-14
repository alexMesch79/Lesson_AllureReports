import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnnotatedStepsSelenideTest {

    private final String REPOSITORY = "eroshenkoam/allure-example";
    private final Integer ISSUE_NUMBER = 74;

    @Test
    @DisplayName("Шаги с аннотацией @Step")
    public void testWithAnnotatedSteps(){
        WebSteps steps = new WebSteps();

        steps.openMainPage();
        steps.searchRepository(REPOSITORY);
        steps.openRepository(REPOSITORY);
        steps.openTabRepository();
        steps.shouldSeeIssueWithNumber(ISSUE_NUMBER);
    }
}
