package Contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppointmentServiceTest {
  private String ID, description, tooLongDescription;
  private Date date, pastDate;

  @BeforeEach
  void variables() {
	    ID = "0123456789";
	    description = "The apt object sclass requires a description.";
	    date = new Date(1999, Calendar.AUGUST, 29);
	    tooLongDescription = "This this is a good example of a descritpion that is to long, it would throw an error.";
	    pastDate = new Date(0);
	  }

  @Test
  void testNewAppointment() {
	AppointmentService  service = new AppointmentService ();

    service.newAppointment();
    assertNotNull(service.getAptList().get(0).getAptID());
    assertNotNull(service.getAptList().get(0).getAptDate());
    assertNotNull(service.getAptList().get(0).getDescription());

    service.newAppointment(date);
    assertNotNull(service.getAptList().get(1).getAptID());
    assertEquals(date,service.getAptList().get(1).getAptDate());
    assertNotNull(service.getAptList().get(1).getDescription());

    service.newAppointment(date, description);
    assertNotNull(service.getAptList().get(2).getAptID());
    service.getAptList().get(2).getAptDate();
    assertEquals(description,service.getAptList().get(2).getDescription());

    assertNotEquals(service.getAptList().get(0).getAptID(),service.getAptList().get(1).getAptID());
    assertNotEquals(service.getAptList().get(0).getAptID(),service.getAptList().get(2).getAptID());
    assertNotEquals(service.getAptList().get(1).getAptID(),service.getAptList().get(2).getAptID());

    assertThrows(IllegalArgumentException.class,() -> service.newAppointment(pastDate));
    assertThrows(IllegalArgumentException.class,() -> service.newAppointment(date, tooLongDescription));
  }

  @Test
  void deleteAppointment() throws Exception {
    AppointmentService service = new AppointmentService();

    service.newAppointment();

    String firstID = service.getAptList().get(0).getAptID();

    assertThrows(Exception.class, () -> service.deleteAppointment(ID));

    service.deleteAppointment(firstID);
    assertThrows(Exception.class, () -> service.deleteAppointment(firstID));
  }
}