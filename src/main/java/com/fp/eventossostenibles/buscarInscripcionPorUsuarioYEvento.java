package org.iesvdmProyectoMain;

import java.util.List;
import java.util.Optional;

public class buscarInscripcionPorUsuarioYEvento {
	
	 public static Optional<Inscripciones> buscarInscripcionPorUsuarioYEvento(List<Inscripciones> inscripciones, int idUsuario, int idEvento) {
	        for (Inscripciones inscripcion : inscripciones) {
	            if (inscripcion.getIdUsuario() == idUsuario && inscripcion.getIdEvento() == idEvento) {
	                return Optional.of(inscripcion);
	            }
	        }
	        return Optional.empty();
	    }

	public static boolean cancelarInscripcion(Inscripciones inscripcion) {
		// TODO Auto-generated method stub
		return false;
	}
}
