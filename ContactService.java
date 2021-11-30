//Peter Lilley
package Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



public class ContactService {
	
	private String uniqueID;
	private List<Contact> contactList = new ArrayList<>();
	
	/*getting a unique ID calls the UUID library 
	reference 
	https://www.javatpoint.com/java-uuid#:~:text=UUID%20stands%20for%20Universally%20Unique%20Identifier.&text=It%20is%20also%20known%20as,unique%20to%20all%20practical%20purpose.
	*/
	{setUniqueID(UUID.randomUUID().toString().substring(0, Math.min(toString().length(),  10)));}
	
	
	//Adding unique ID
	public void newContact(String uniqueID) {
		Contact contact = new Contact(newUniqueID());
		contactList.add(contact);
	}
	
	//Adding a first name
	public void newContact(String uniqueID, String firstName) {
		Contact contact = new Contact(newUniqueID(), firstName);
		contactList.add(contact);
	}
	
	//Adding a last name
	public void newContact(String uniqueID, String firstName, String lastName) {
		Contact contact = new Contact(newUniqueID(), firstName, lastName);
		contactList.add(contact);
	}
	
	//Adding Number
	public void newContact(String uniqueID, String firstName, String lastName, String Number) {
		Contact contact = new Contact(newUniqueID(), firstName, lastName, Number);
		contactList.add(contact);
	}
	
	//Adding Address
	public void newContact(String uniqueID, String firstName, String lastName, String Number, String Address) {
		Contact contact = new Contact(newUniqueID(), firstName, lastName, Number, Address);
		contactList.add(contact);
	}

	//Auto Generate Method for uniqueID
	private String newUniqueID() {return setUniqueID(UUID.randomUUID().toString().substring(
	               0, Math.min(toString().length(), 10)));}
	
	//Deleting a contact
	public void deleteContact(String ID) throws Exception {contactList.remove(searchForContact(ID));}
	
	//update Contact ID
	public void updateContactID(String ID) throws Exception {searchForContact(ID).updateContactID(ID);}
	
	//update a First Name
	public void updateFirstName(String ID, String firstName) throws Exception {searchForContact(ID).updateFirstName(firstName);}
	
	//update last name
	public void updateLastName(String ID, String lastName) throws Exception {searchForContact(ID).updateLastName(lastName);}
	
	//update number
	public void updateNumber(String ID, String Number)throws Exception {searchForContact(ID).updateNumber(Number);}
	
	//update address
	public void updateAddress(String ID, String Address) throws Exception {searchForContact(ID).updateAddress(Address);}
	
	protected List<Contact> getContactList() {return contactList;}
	
	

	//Method for deleting unique ID
	private Contact searchForContact(String ID) throws Exception {
		int index = 0;
    
		while (index < contactList.size()) {
			if (ID.equals(contactList.get(index).getContactID())) {
				return contactList.get(index);
			}
			index++;
		}
		throw new Exception("Can not complete request.");
    }

	public String getUniqueID() {
		return uniqueID;
	}

	public String setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
		return uniqueID;
	}
  }

