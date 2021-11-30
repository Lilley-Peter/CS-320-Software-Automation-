//Peter Lilley
package Contact;

public class Contact {
	private String firstName;
	private String lastName;
	private String Number;
	private String Address;
	private String contactID;
	
	public Contact(String contactID, String firstName, String lastName, String Number, String Address) {
		
		//Check unique ID
		if(contactID == null) {throw new IllegalArgumentException("contactID can not be null");}
		
		//Fist name check
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		//Last name check
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		//Number check
		if(Number == null || Number.length() != 10) {
			throw new IllegalArgumentException("Invalid number");
		}
		
		//Addresds check
		if(Address == null || Address.length()>31) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.Number = Number;
		this.Address = Address;
	}
	

	//Auto generated constructor 
	Contact(String contactID) {}
	
	//Auto Generated constructor
	Contact(String contactID, String firstName) {}
	
	//Auto Generated constructor 
	Contact(String contactID, String firstName, String lastName) {}
	
	//Auto generated constructor
	Contact(String contactID, String firstName, String lastName, String Number) {}
	
	public String getContactID() {return contactID;}

	public String getFirstName() {return firstName;}
	
	public String getLastName() {return lastName;}
	
	public String getNumber() {return Number;}
	
	public String getAddress() {return Address;}

	//Auto Generated Method + code from above
	public void updateFirstName(String firstName) {
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = firstName;
	}

	//Auto Generated method+ code from above
	public void updateLastName(String lastName) {
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = lastName;
	}

	//Auto Generated Method + code from above
	public void updateNumber(String Number) {
		if(Number == null || Number.length() != 10) {
			throw new IllegalArgumentException("Invalid number");
		}
		this.Number = Number;
	}


	public void updateAddress(String Address) {
		if(Address == null || Address.length()>31) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.Address = Address;
	}


	public void updateContactID(String iD) {
		if(iD == null || Address.length()>31) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.Address = Address;
		
	}
}
