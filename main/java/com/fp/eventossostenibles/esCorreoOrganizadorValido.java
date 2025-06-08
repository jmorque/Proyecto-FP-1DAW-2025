package org.iesvdmProyectoMain;

import java.util.regex.Matcher;

public class esCorreoOrganizadorValido {
	public static boolean esCorreoOrganizadorValido(Organizadores organizador) {
	    if (organizador == null || organizador.getCorreoOrganizador() == null) {
	        return false;
	    }
	    String correo = organizador.getCorreoOrganizador();
	    return correo.contains("@") && correo.contains(".") && correo.indexOf("@") < correo.lastIndexOf(".");
	}
}

