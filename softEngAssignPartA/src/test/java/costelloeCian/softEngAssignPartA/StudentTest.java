package costelloeCian.softEngAssignPartA;

import org.junit.Test;

import static org.junit.Assert.*;
import costelloeCian.softEngAssignPartA.*;

public class StudentTest {
	
	protected String nameTest, ageTest;
	
	protected void setUp(){
		
		nameTest = "CianCostelloe";
		ageTest = "22";
	}
	@Test
	public void getUsername(){
		Student s1 = new Student("SeanBolton", "21", "050994", 20, "s.Bolton1", "Eng");
		
		String result = s1.getUsername();
		assertEquals(result, "SeanBolton21");
	}
}