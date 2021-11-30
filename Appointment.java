//Peter Lilley

package Contact;
import java.util.Date;

public class Appointment {
	private byte aptIDLength= 10;
	private byte aptDescriptionLength = 51;
	private String aptID;
	private Date aptDate;
	private String description;
	
	//Constructor 
	Appointment(){
		Date today = new Date();
		aptID = "NONE";
		aptDate = today;
		description = "NONE";
	}
	
	//ID
	Appointment(String ID){
		Date today = new Date();
		updateAptID(ID);
		aptDate = today;
		description = "NONE";
	}
	
	//Date
	Appointment(String ID, Date date){
		updateAptID(ID);
		updateDate(date);
		description = "NONE";
	}
	
	//Description 
	Appointment(String ID, Date date, String description){
		updateAptID(ID);
		updateDate(date);
		updateDescription(description);
	}
	
	public String getAptID() {return aptID;}
	public Date getAptDate() {return aptDate;}
	public String getDescription() {return description;}
	
	
	//Update Apt ID
	public void updateAptID(String ID) {
		 if (ID == null) {
		    throw new IllegalArgumentException("You must have an appointment ID, it can not be null.");
		  } else if (ID.length() > aptIDLength) {
		    throw new IllegalArgumentException("Appointment ID cannot exceed 10 characters this includes spaces.");
		  } else {
		    this.aptID = ID;}
	}

	
	//Update Date
	public void updateDate(Date date) {
		 if (date == null) {
		    throw new IllegalArgumentException("You must have a date, it can not be null.");
		  } else if (date.before(new Date())) {
		    throw new IllegalArgumentException("We can not time travel to the past.");
		  } else {
		    this.aptDate = date;}
	}
	
	
	//Update Apt Date
	public void updateDescription(String description) {
		 if (description == null) {
		    throw new IllegalArgumentException("You must have a description, it can not be null.");
		  } else if (description.length() > aptDescriptionLength) {
		    throw new IllegalArgumentException("description cannot exceed 50 characters this includes spaces.");
		  } else {
		    this.description = description;}
	}
	
}
