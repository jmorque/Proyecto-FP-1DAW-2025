package org.iesvdmProyectoTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.iesvdmProyectoMain.Ubicaciones;
import org.iesvdmProyectoMain.buscarUbicacionPorNombreEvento;
import org.junit.Test;

public class UbicacionUtilsTest {
	@Test
    void testBuscarUbicacionPorNombreEvento_UbicacionEncontrada() {
        
        List<Ubicaciones> ubicaciones = new ArrayList<>();
        ubicaciones.add(new Ubicaciones(1, "Concierto Rock", "Auditorio", "Calle Falsa 123", "http://concierto.com"));
        ubicaciones.add(new Ubicaciones(2, "Feria del Libro", "Recinto Ferial", "Avenida Siempre Viva", "http://feria.org"));
        ubicaciones.add(new Ubicaciones(3, "Taller de Programación", "Sala de Conferencias", "Plaza Mayor", "http://taller.dev"));

        
        Optional<Ubicaciones> foundUbicacion = buscarUbicacionPorNombreEvento.buscarUbicacionPorNombreEvento(ubicaciones, "feria del libro"); 

        
        assertTrue(foundUbicacion.isPresent());
        assertEquals(2, foundUbicacion.get().getIdUbicacion());
        assertEquals("Feria del Libro", foundUbicacion.get().getUbicacionEvento());
    }

    @Test
    void testBuscarUbicacionPorNombreEvento_UbicacionNoEncontrada() {
        
        List<Ubicaciones> ubicaciones = new ArrayList<>();
        ubicaciones.add(new Ubicaciones(1, "Concierto Rock", "Auditorio", "Calle Falsa 123", "http://concierto.com"));

       
        Optional<Ubicaciones> foundUbicacion = buscarUbicacionPorNombreEvento.buscarUbicacionPorNombreEvento(ubicaciones, "Evento Inexistente");

        
        assertFalse(foundUbicacion.isPresent());
    }
}
