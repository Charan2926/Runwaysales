package testScripts;

import org.testng.annotations.Test;

public class CreateTest {
	
	@Test(groups="smoke")
	public void createcampMand() {
		System.out.println("-----create-Using mandatory fields");
	}
	
	@Test(groups="regression")
	public void createcamp() {
		System.out.println("--------create-using all fields----------");
	}

}
