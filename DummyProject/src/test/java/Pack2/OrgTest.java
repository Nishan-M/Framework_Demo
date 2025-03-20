package Pack2;

import java.lang.reflect.Method;

import org.testng.annotations.Test;



public class OrgTest {
	@Test(groups = "SmokeTest")
	public void createOrgTest() {
		System.out.println("Execute createOrgTest");
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser","Chrome");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
	@Test(groups="RegressionTest")
	public void ModifyOrgTest(Method mtd) {
		System.out.println(mtd.getName()+ "Test Start");
		System.out.println("Execute ModifyOrgTest");
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser","Chrome");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}

}
