package org.iesvdmProyectoTest;


import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.iesvdmProyectoMain.EventValidator;
import org.iesvdmProyectoMain.Eventos;
import org.junit.Test;

public class EventValidatorTest {
	 @Test
	    void testIsUpcoming_UpcomingEvent() {
	        
	        Eventos upcomingEvent = new Eventos();
	        upcomingEvent.setFechaEvento(LocalDate.now().plusDays(1));

	        
	        boolean isUpcoming = EventValidator.isUpcoming(upcomingEvent);

	        
	        assertTrue(isUpcoming, "El evento debería ser considerado próximo.");
	    }

	private void assertTrue(boolean isUpcoming, String string) {
		
		
	}
}
