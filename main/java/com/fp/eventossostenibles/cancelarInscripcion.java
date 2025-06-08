package org.iesvdmProyectoMain;

public class cancelarInscripcion {
	
	public static boolean cancelarInscripcion(Inscripciones inscripcion) {
        if (inscripcion != null && inscripcion.getEstadoInscripcion() != Inscripciones.EstadoInscripcion.CANCELADA) {
            inscripcion.setEstadoInscripcion(Inscripciones.EstadoInscripcion.CANCELADA);
            System.out.println("Inscripción del usuario " + inscripcion.getIdUsuario() + " para el evento " + inscripcion.getIdEvento() + " ha sido cancelada.");
            return true;
        } else if (inscripcion != null && inscripcion.getEstadoInscripcion() == Inscripciones.EstadoInscripcion.CANCELADA) {
            System.out.println("La inscripción ya estaba cancelada.");
            return false;
        }
        return false; 
    }
}
