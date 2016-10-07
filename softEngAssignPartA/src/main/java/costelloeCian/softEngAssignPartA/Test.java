package costelloeCian.softEngAssignPartA;

import org.joda.time.DateTime;

public class Test {
	//A student class should contain information such as (Name, Age, DOB, ID, username etc)
	public static void main(String[] args) {
		
		Student s1 = new Student ("Cian", "22", "05/09/94", 13395741,"c.costelloe1@nuigalway.ie", "Engineering");
		Module m1 = new Module ("Software Eng", "CT417");
		
		DateTime strtDate = new DateTime(2013, 9, 5, 0, 0);
		DateTime endDate = new DateTime(2017, 5, 20, 0, 0);
		CourseProgramme c1 = new CourseProgramme ("ECE", strtDate, endDate);
		
		s1.printInfo();	
		m1.printModInfo();
		c1.printCourseInfo();
	}
}