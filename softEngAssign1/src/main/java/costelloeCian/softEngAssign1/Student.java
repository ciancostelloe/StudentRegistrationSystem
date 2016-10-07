package costelloeCian.softEngAssign1;

//A student class should contain information such as (Name, Age, DOB, ID, username etc)

public class Student{
	private String name;
	private String age;
	private String dob;
	private int id;
	private String username;
	private String email;
	private String faculty;
	
	public Student(String name, String age, String dob, int id, String email, String faculty) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.id = id;
		this.username = this.getUsername();
		this.email = email;
		this.faculty = faculty;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getUsername() {
		return (name + age);
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public void printInfo(){
		System.out.println("Welcome " +getName()+ 
				"\nAge: " +getAge()+ 
				"\nDOB: " +getDob()+
				"\nStudent number: " +getId()+ 
				"\nUsername: " +getUsername()+
				"\nEmail address: " +getEmail()+
				"\nDepatment: " +getFaculty());
	}

}