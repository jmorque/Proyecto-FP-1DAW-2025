package org.iesvdmProyectoMain;

import java.util.List;
import java.util.Optional;

public class buscarOrganizadorPorCorreo {
	  public static Optional<Organizadores> buscarOrganizadorPorCorreo(List<Organizadores> organizadores, String correoElectronico) {
	        for (Organizadores organizador : organizadores) {
	            if (organizador.getCorreoOrganizador() != null && organizador.getCorreoOrganizador().equalsIgnoreCase(correoElectronico)) {
	                return Optional.of(organizador);
	            }
	        }
	        return Optional.empty();
         }
}