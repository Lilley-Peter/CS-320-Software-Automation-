//Peter Lilley
package Contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	//Test Proper peramiters
	@Test
	void testContact() {
		Contact Contact = new Contact("01", "Peter", "Lilley", "0123456789", "123 Fake Street");
		assertTrue(Contact.getContactID().equals("01"));
		assertTrue(Contact.getFirstName().equals("Peter"));
		assertTrue(Contact.getLastName().equals("Lilley"));
		assertTrue(Contact.getNumber().equals("0123456789"));
		assertTrue(Contact.getAddress().equals("123 Fake Street"));
	}
	
	//Test to long peramiters 
	@Test
	void testContactToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("01", "Peter Peter", "Lilley Lilley", "0123456789 0123456789", "123 Fake Street 123 Fake Street");});}
	
	//Test Null Peramiters 
	@Test
	void testContactNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact(null, null, null, null, null);});}
	
	//Test updated information
	@Test
	void testContactUpdate() {
			Contact Contact = new Contact("02", "John", "Smith", "9876543210", "456 Real Lane");
			assertTrue(Contact.getContactID().equals("02"));
			assertTrue(Contact.getFirstName().equals("John"));
			assertTrue(Contact.getLastName().equals("Smith"));
			assertTrue(Contact.getNumber().equals("9876543210"));
			assertTrue(Contact.getAddress().equals("456 Real Lane"));
	}

}
