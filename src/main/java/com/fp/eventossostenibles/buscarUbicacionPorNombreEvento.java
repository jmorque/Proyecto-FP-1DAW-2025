package org.iesvdmProyectoMain;

import java.util.List;
import java.util.Optional;

public class buscarUbicacionPorNombreEvento {
	public static Optional<Ubicaciones> buscarUbicacionPorNombreEvento(List<Ubicaciones> ubicaciones, String nombreEvento) {
        for (Ubicaciones ubicacion : ubicaciones) {
            if (ubicacion.getUbicacionEvento() != null && ubicacion.getUbicacionEvento().equalsIgnoreCase(nombreEvento)) {
                return Optional.of(ubicacion);
            }
        }
        return Optional.empty();
}
}