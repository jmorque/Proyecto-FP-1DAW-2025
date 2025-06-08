package org.iesvdmProyectoMain;

public class esContrasenaValida {
	 public static boolean esContrasenaValida(String contrasena) {
	        return contrasena != null && contrasena.length() >= 8;
	    }
}
