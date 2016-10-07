package costelloeCian.softEngAssign1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//A module class, which should contain information such as (Module Name, ID (CT417), List of students).

public class Module {
	
	private String modName;
	private String modId;
	public String getModName() {
		return modName;
	}
	public void setModName(String modName) {
		this.modName = modName;
	}
	public String getModId() {
		return modId;
	}
	public void setModId(String modId) {
		this.modId = modId;
	}
	
	public Module (String modName, String modId) {
		this.modName = modName;
		this.modId = modId;
	}
	
	
	public void printModInfo(){
		
		String[] stuNames = { "Cian", "Sean", "Aidan" };
		System.out.println("Student names: " +Arrays.toString(stuNames));
		
		System.out.println("Module name: " +getModName()+
				"\nModule ID: " +getModId());
	}

}
