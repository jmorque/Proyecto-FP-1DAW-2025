package org.iesvdmProyectoMain;
import java.time.LocalDate;
public class EventValidator {

	public static boolean isUpcoming(Eventos evento) {
	        if (evento == null || evento.getFechaEvento() == null) {
	            System.err.println("Advertencia: El evento o su fecha son nulos al verificar si es próximo.");
	            return false;
	        }
	        return evento.getFechaEvento().isAfter(LocalDate.now());
	    }
	  }