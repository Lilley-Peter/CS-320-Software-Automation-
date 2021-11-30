package Contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskServiceTest {

	//Test Delete Contact
	@Test
	void testDeleteTask() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task(null, null, null);});}
	
	//Test Search Contact
	@Test
	void testSearchTask() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("01", null, null);});}

	//Test New ID
	@Test
	void testNewTask() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("01", null, null);});}
	
	//Test new ID and Name
	@Test
	void testNewNameID() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("02", "Neo", null);});}
	
	//Test New Name
	@Test
	void testUpdateName() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("00", "Jack", null);});}
	
	//Test New Description 
	@Test
	void testUpdateDescription() {
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("00", null, "Fun");});}
	
}
