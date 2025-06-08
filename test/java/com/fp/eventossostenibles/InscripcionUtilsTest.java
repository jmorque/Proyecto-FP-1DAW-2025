package org.iesvdmProyectoTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.iesvdmProyectoMain.Inscripciones;
import org.iesvdmProyectoMain.buscarInscripcionPorUsuarioYEvento;
import org.junit.Test;

public class InscripcionUtilsTest {
	@Test
    void testCancelarInscripcion_ActivaACancelada() {
        
        Inscripciones inscripcion = new Inscripciones(1, 101, LocalDate.now());
        assertEquals(Inscripciones.EstadoInscripcion.ACTIVA, inscripcion.getEstadoInscripcion());

        
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        
        boolean result = buscarInscripcionPorUsuarioYEvento.cancelarInscripcion(inscripcion);

        
        assertTrue(result);
        assertEquals(Inscripciones.EstadoInscripcion.CANCELADA, inscripcion.getEstadoInscripcion());
        assertTrue(outContent.toString().contains("ha sido cancelada."));

        
        System.setOut(System.out);
    }

    @Test
    void testCancelarInscripcion_YaCancelada() {
        
        Inscripciones inscripcion = new Inscripciones(2, 102, LocalDate.now(), Inscripciones.EstadoInscripcion.CANCELADA);
        assertEquals(Inscripciones.EstadoInscripcion.CANCELADA, inscripcion.getEstadoInscripcion());

        
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        
        boolean result = buscarInscripcionPorUsuarioYEvento.cancelarInscripcion(inscripcion);

        
        assertFalse(result); 
        assertEquals(Inscripciones.EstadoInscripcion.CANCELADA, inscripcion.getEstadoInscripcion()); 
        assertTrue(outContent.toString().contains("ya estaba cancelada."));

        
        System.setOut(System.out);
    }
}
