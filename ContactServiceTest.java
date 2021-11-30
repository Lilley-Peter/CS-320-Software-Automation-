//Peter Lilley
package Contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	//Test Delete Contact
	@Test
	void testdeleteContact() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("01", null, null, null, null);});}

	
	//Test ContactID
	@Test
	void testContactID() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("02",  null, null, null, null);});}

	
	//Test Contact First Name
	@Test
	void testFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("02",  "Adam" , null, null, null);});}
	
	//Test Contact Last Name
	@Test
	void testLastName() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("02",  "Adam" , "Jack" , null, null);});}
	
	//Test Contact Number
	@Test
	void testNumber() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("02",  "Adam" , "Jack" , "6547891230" , null);});}
	
	//Test Contact Address
	@Test
	void testAddress() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("02",  "Adam" , "Jack" , "6547891230" , null);});}
	
	//Test Update ContactID
	@Test
	void testUpdateContactID() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("0", null, null, null, null);});}
	
	//Test Update Fist Name
	@Test
	void testUpdateFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact(null, "Tim", null, null, null);});}
	
	//Test Update Last Name
	@Test
	void testUpdateLastName() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact(null, null, "Smith", null, null);});}
	
	//Test Update Number
	@Test
	void testUpdateNumber() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact(null, null, null, "9876543210", null);});}
	
	//Test Update Address
	@Test
	void testUpdateAddress() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact(null, null, null, null, "456 Real Lane");});}

}
