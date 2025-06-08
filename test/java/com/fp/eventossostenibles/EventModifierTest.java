package org.iesvdmProyectoTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.iesvdmProyectoMain.EventModifier;
import org.iesvdmProyectoMain.Eventos;
import org.junit.Test;

public class EventModifierTest {
	 @Test
	    void testRescheduleEvent_NullEvent() {
	        
	        Eventos nullEvent = null;
	        LocalDate newDate = LocalDate.of(2025, 8, 1);
	        double newDuration = 2.0;

	        
	        java.io.ByteArrayOutputStream errContent = new java.io.ByteArrayOutputStream();
	        System.setErr(new java.io.PrintStream(errContent));

	       
	        EventModifier.rescheduleEvent(nullEvent, newDate, newDuration);

	        
	        assertTrue(errContent.toString().contains("Error: No se puede reprogramar un evento nulo."));

	        
	        System.setErr(System.err);
	    }

}
