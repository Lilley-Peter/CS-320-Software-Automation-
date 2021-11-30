package Contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {

	@Test
	void testTask() {
		
			Task Task = new Task("00", "Peter", "Younge") ;
			assertTrue(Task.getTaskID().equals("00"));
			assertTrue(Task.getName().equals("Peter"));
			assertTrue(Task.getDescription().equals("Younge"));
	}  
	
	//Test if parameters are to long 
	@Test
	void testTaskToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("01234567890", "Peter Peter Peter Peter", "Younge Younge Younge Younge Younge Younge Younge Younge");});}
	
	//Test if parameters are null
	@Test
	void testTaskNull() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task(null, null, null );});}
	
	//Test if we changed paramiters 
	@Test
	void testTaskUpdate() {
		Task Task = new Task("01", "John", "Black Smith") ;
		assertTrue(Task.getTaskID().equals("01"));
		assertTrue(Task.getName().equals("John"));
		assertTrue(Task.getDescription().equals("Black Smith"));
}

}
