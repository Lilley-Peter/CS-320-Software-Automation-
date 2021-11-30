//Peter Lilley
package Contact;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class TaskService {
	
	private List<Task> taskList = new ArrayList<>();
	
	private String newUniqueID() {
		return UUID.randomUUID().toString().substring(
				0, Math.min(toString().length(), 10));
		  }
	private Task searchTask(String ID) throws Exception{
		int index = 0;
		while (index < taskList.size()) {
			if(ID.equals(taskList.get(index).getTaskID())) {return taskList.get(index);}
			index++;
		} throw new Exception("Task does not exits.");}
	
	public void newTask() {
		Task task = new Task(newUniqueID());
		taskList.add(task);
	}
	
	//New Task Name
	public void newTask(String name) {
		Task task = new Task(newUniqueID(), name);
		taskList.add(task);
	}
	
	//New Task ID, Name, Description 
	public void newTask(String taskID, String name, String description) {
		Task task = new Task(newUniqueID(), name, description);
		taskList.add(task);
	}
	
	//Delete Task
	public void deleteTask(String ID) throws Exception {
		taskList.remove(searchTask(ID));
	}
	
	//Update Name
	public void updateName(String ID, String name) throws Exception {
		searchTask(ID).setName(name);
	}
	
	//Update Descritpion
	public void updateDescription(String ID, String description)throws Exception {
		searchTask(ID).setDescription(description);
		 }
}
