package testScripts;

import org.testng.annotations.Test;

public class ModifyTest {
	
	@Test(groups = "smoke")
	public void modifycampMand() {
		System.out.println("------modify-Using mandatory fields");
	}
	
	@Test(groups = "regression")
	public void modifycamp() {
		System.out.println("--------modify-using all fields----------");
	}

}
