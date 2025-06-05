package org.iesvdmProyectoMain;
import java.time.LocalDate;
public class EventModifier {
	    public static void rescheduleEvent(Eventos evento, LocalDate newDate, double newDuration) {
	        if (evento == null) {
	            System.err.println("Error: No se puede reprogramar un evento nulo.");
	            return;
	        }
	        if (newDate == null) {
	            System.err.println("Error: La nueva fecha no puede ser nula para el evento '" + evento.getNombreEvento() + "'.");
	            return;
	        }

	        evento.setFechaEvento(newDate);
	        evento.setDuracionEvento(newDuration);
	        System.out.println("El evento '" + evento.getNombreEvento() + "' ha sido reprogramado para el " + newDate + " con una duración de " + newDuration + " unidades.");
	    }
	}
