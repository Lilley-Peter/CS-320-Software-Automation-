package Contact;

public class Task {
	  private String taskID;
	  private String name;
	  private String description;
	  
	  //Constructor
	  Task(){
		  taskID = "00";
		  name = "NONE";
		  description = "NONE";
	  }
	  Task(String taskID) {
		    checkTaskID(taskID);
		    name = "NONE";
		    description = "NONE";
		  }

	  Task(String taskID, String name) {
		    checkTaskID(taskID);
		    setName(name);
		    description = "NONE";
		  }

	  Task(String taskId, String name, String description) {
		    checkTaskID(taskId);
		    setName(name);
		    setDescription(description);
		  } 
	  
	  //Methods
	  public  String getTaskID() { return taskID; }

	  public  String getName() { return name; }
	  
	  public String getDescription() {return description;}
	  
	  //Check Name
	  void setName(String name) {
		    if (name == null || name.length() > 20) {
		      throw new IllegalArgumentException("Name is not valid. Please make sure it is less than 20 characters (including spaces).");
		    } else {
		      this.name = name;}
		  }
	   
	  //Check Descritpion
	   void setDescription(String description) {
		    if (description == null || description.length() > 50) {
		      throw new IllegalArgumentException("Description is not valid. Please make sure it is less than 50 characters (including spaces).");
		    } else {
		      this.description = description;}
		  }
	   
	   //Check Task ID
	   void checkTaskID(String taskID) {
		    if (taskID == null || taskID.length() > 10) {
		      throw new IllegalArgumentException("Error: The task ID was not valid, please make sure it is 10 characters or less");
		    } else {
		      this.taskID = taskID;}
		  }
}
