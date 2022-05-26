package testscript;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pom.SkillraryLogin;
import pom.Skillrarylogo;

public class Login extends BaseClass {
	@Test
	public void testLogin() {
		SkillraryLogin s=new SkillraryLogin(driver);
		s.un("admin");
		s.pw("admin");
		s.ln();		
	
	Skillrarylogo s1=new Skillrarylogo(driver);
	web.mouseHover(driver, s1.getLogo());
	s1.getLogo();
}
}