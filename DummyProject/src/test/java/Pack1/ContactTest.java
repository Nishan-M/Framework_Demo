package Pack1;

import org.testng.annotations.Test;

public class ContactTest {
@Test(groups = "SmokeTest")
public void createcontactTest() {
	System.out.println("Execute CreateContactTest");
}
@Test(groups="RegressionTest")
public void ModifycontactTest() {
	System.out.println("Execute ModifyContactTest");
}
@Test
public void DeleteContactTest() {
	System.out.println("Execute Delete ContactTest");
}


}
