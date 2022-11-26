package POJO_Classes;

public class UserLibrary {
	
	//Rule 1 : Declare all the variables as global
	String name;
	String job;
	
	/**
	 * @param name
	 * @param job
	 */
	 //Rule 2 : Create parameterized constructor to initialize the variables
	public UserLibrary(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	// Rule 3: Provide Getters and Setters to access these variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	
	
     
}
