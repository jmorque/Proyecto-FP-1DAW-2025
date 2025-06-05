package org.iesvdmProyectoMain;

import java.net.URL;

public class esEnlaceUbicacionValido {
	 public static boolean esEnlaceUbicacionValido(Ubicaciones ubicacion) {
	        if (ubicacion == null || ubicacion.getEnlaceUbicacion() == null || ubicacion.getEnlaceUbicacion().trim().isEmpty()) {
	            return false;
	        }
	        try {
	            new URL(ubicacion.getEnlaceUbicacion());
	            return true;
	        } catch (java.net.MalformedURLException e) {
	            return false;
	        }
}
}