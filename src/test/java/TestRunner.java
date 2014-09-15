import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
        format = { "pretty", "json:target/test-reports/cucumber.json", "html:target/cucumber-html-report" }
//       , features = { "/src/main/resources/features"}
        , tags = { "@test" }
)
public class TestRunner {
    public static void main(String[] args) throws Throwable
        {
        new TestRunner();
        }


}



