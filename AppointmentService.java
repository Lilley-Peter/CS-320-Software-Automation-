//Peter Lilley
package Contact;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class AppointmentService {

	private List<Appointment> aptList = new ArrayList<>();
	
	//Unique ID from github
	private String newUniqueID() {return UUID.randomUUID().toString().substring(0, Math.min(toString().length(),10));}
	
	//New Apt
	public void newAppointment() {
		Appointment apt = new Appointment(newUniqueID());
		aptList.add(apt);
	}
	
	//New Date
	public void newAppointment(Date date) {
		Appointment apt = new Appointment(newUniqueID(), date);
		aptList.add(apt);
	}
	
	//New description 
	public void newAppointment(Date date, String description) {
		Appointment apt = new Appointment(newUniqueID(), date, description);
		aptList.add(apt);
	}
	
	
	//delete appointment 
	public void deleteAppointment(String ID)throws Exception {
		aptList.remove(searchForApt(ID));
	}	
	
	protected List<Appointment> getAptList() {return aptList;}
	
	private Appointment searchForApt(String ID)throws Exception{
		int index = 0;
		while(index <aptList.size()) {
			if(ID.equals(aptList.get(index).getAptID())) {return aptList.get(index);}
			index++;
		}
		throw new Exception("Your appointment is invalid.");
	}
}
