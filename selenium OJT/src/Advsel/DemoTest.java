package Advsel;
import org.testng.Assert;
import org.testng.annotations.Test;
public class DemoTest {
	@Test(groups="login")
	public void login1() {
		System.out.println("login1");
		Assert.assertTrue(false);
	}
@Test(groups="regression")
public void login2() {
	System.out.println("login2");
}
@Test(groups="login")
public void dash() {
	System.out.println("dash");
}
@Test(groups="regression")
public void user() {
	System.out.println("user");
}
}
