package org.iesvdmProyectoMain;

import java.util.List;
import java.util.Optional;

public class buscarUsuarioPorCorreo {
	  public static Optional<Usuarios> buscarUsuarioPorCorreo(List<Usuarios> usuarios, String correoElectronico) {
	        for (Usuarios usuario : usuarios) {
	            if (usuario.getCorreoElectronico() != null && usuario.getCorreoElectronico().equalsIgnoreCase(correoElectronico)) {
	                return Optional.of(usuario);
	            }
	        }
	        return Optional.empty();
}
}