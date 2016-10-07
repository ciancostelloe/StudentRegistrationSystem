package costelloeCian.softEngAssignPartA;

import java.util.Arrays;
import org.joda.time.DateTime;

//A course programme class (Course Name (CS & IT or ECE, etc), List of modules, Academic Start date and End dates).
public class CourseProgramme {

	private String courseName;
	private DateTime strtDate;
	private DateTime endDate;
	
	public DateTime getStrtDate() {
		return strtDate;
	}
	public void setStrtDate(DateTime strtDate) {
		this.strtDate = strtDate;
	}
	public DateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public CourseProgramme (String courseName, DateTime strtDate, DateTime endDate) {
		this.courseName = courseName;
		this.strtDate = strtDate;
		this.endDate = endDate;
	}
	
	public void printCourseInfo(){
		
		String[] modNames = { "Software Engineering", "Data Mining", "Telecommunications" };
		System.out.println("Module names: " +Arrays.toString(modNames));
		
		System.out.println("Course name: " +getCourseName()+
				"\nAcademic Start Date: " +getStrtDate()+
				"\nAcademic End Date: " +getEndDate());
	}
	
}