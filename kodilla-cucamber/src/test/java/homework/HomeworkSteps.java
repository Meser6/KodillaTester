package homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class HomeworkSteps implements En {

    int a;
    String answer;

    public HomeworkSteps() {
        Given("^I have number (.*)$", (String number) -> {
        a = Integer.parseInt(number);
        });

        When("I ask if it divisible by 3, 5, 15 or not?", () -> {
            NumberChecker numberChecker = new NumberChecker();
            answer = numberChecker.check(a);
        });

        Then("told <(.*)>", (String comment) -> {
            Assert.assertEquals(comment, answer);
        });
    }
}
