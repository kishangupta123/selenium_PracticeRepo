package dummy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Github {
 @Test
 public void addMessage() {
	 Reporter.log("Welcome to GitHub", true);
 }
}
