package costelloeCian.softEngAssign1PartB;

public class StudentDriver {
	
	private String name;
	private String id;
	private String moduleName;
	private String courseName;
	
	public StudentDriver(String name, String id, String moduleName, String courseName) {
		this.name = name;
		this.id = id;
		this.moduleName = moduleName;
		this.courseName = courseName;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void printStudent(){
		System.out.println(getName()+ " " +getId()+ " " +getModuleName()+ " " +getCourseName());
	}
	public static void main(String args[]){
		
		StudentDriver sd1 = new StudentDriver("Cian Costelloe", "13395741", "CT417", "ECE");
		StudentDriver sd2 = new StudentDriver("Sean Bolton", "13395742", "CT417", "ECE");
		StudentDriver sd3 = new StudentDriver("Colin Crowley", "13395743", "EE452", "EEE");
		StudentDriver sd4 = new StudentDriver("Jamie Clifford", "13395744", "EE473", "Energy");
		StudentDriver sd5 = new StudentDriver("Adam Wynne", "13395745", "EE343", "MechEng");
		StudentDriver sd6 = new StudentDriver("Aidan Kinneen", "13395746", "CT417", "ECE");
		StudentDriver sd7 = new StudentDriver("Joe Devereux", "13395747", "AA357", "Arts");
		StudentDriver sd8 = new StudentDriver("Alex Chadfield", "13395748", "CC295", "Commerce");
		
		sd1.printStudent();
		sd2.printStudent();
		sd3.printStudent();
		sd4.printStudent();
		sd5.printStudent();
		sd6.printStudent();
		sd7.printStudent();
		sd8.printStudent();

	}

}
