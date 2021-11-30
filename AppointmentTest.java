//Peter Lilley
package Contact;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppointmentTest {

  private String ID, description, tooLongId, tooLongDescription;
  private Date date, pastDate;
  
  @BeforeEach
  void setUp() {
    ID = "0123456789";
    description = "The apt object sclass requires a description.";
    date = new Date(1999, Calendar.AUGUST, 29);
    tooLongId = "012345678901234567890123456789";
    tooLongDescription = "This this is a good example of a descritpion that is to long, it would throw an error.";
    pastDate = new Date(0);
  }

  //Test Update ID
  @Test
  void testUpdateAppointmentId() {
    Appointment apt = new Appointment();
    assertThrows(IllegalArgumentException.class,() -> apt.updateAptID(null));
    assertThrows(IllegalArgumentException.class,() -> apt.updateAptID(tooLongId));
    apt.updateAptID(ID);
    assertEquals(ID, apt.getAptID());
  }
  
  //Test Get appointmnet ID
  @Test
  void testGetAppointmentID() {
    Appointment apt = new Appointment(ID);
    assertNotNull(apt.getAptID());
    assertEquals(apt.getAptID().length(), 10);
    assertEquals(ID, apt.getAptID());
  }
  
  //Test update date
  @Test
  void testUpdateDate() {
    Appointment apt = new Appointment();
    assertThrows(IllegalArgumentException.class, () -> apt.updateDate(null));
    assertThrows(IllegalArgumentException.class,() -> apt.updateDate(pastDate));
    apt.updateDate(date);
    assertEquals(date, apt.getAptDate());
  }

  //Get Appointment
  @Test
  void testGetAppointmentDate() {
    Appointment apt = new Appointment(ID, date);
    assertNotNull(apt.getAptDate());
    assertEquals(date, apt.getAptDate());
  }

  //Update Description
  @Test
  void testUpdateDescription() {
    Appointment apt = new Appointment();
    assertThrows(IllegalArgumentException.class,() -> apt.updateDescription(null));
    assertThrows(IllegalArgumentException.class,() -> apt.updateDescription(tooLongDescription));
    apt.updateDescription(description);
    assertEquals(description, apt.getDescription());
  }

  //Get Description
  @Test
  void testGetDescription() {
	 Appointment apt = new Appointment(ID, date, description);
    assertNotNull(apt.getDescription());
    //assertTrue(apt.getDescription().length() <= 50);
    assertEquals(description, apt.getDescription());
  }
}