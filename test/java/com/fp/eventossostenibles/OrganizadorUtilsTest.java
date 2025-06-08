package org.iesvdmProyectoTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.iesvdmProyectoMain.Organizadores;
import org.iesvdmProyectoMain.buscarOrganizadorPorCorreo;
import org.junit.Test;

public class OrganizadorUtilsTest {
	@Test
    void testBuscarOrganizadorPorCorreo_OrganizadorEncontrado() {
        
        List<Organizadores> organizadores = new ArrayList<>();
        organizadores.add(new Organizadores(1, "Organizador A", "111", "a@example.com"));
        organizadores.add(new Organizadores(2, "Organizador B", "222", "b@example.com"));
        organizadores.add(new Organizadores(3, "Organizador C", "333", "c@example.com"));

        
        Optional<Organizadores> foundOrganizador = buscarOrganizadorPorCorreo.buscarOrganizadorPorCorreo(organizadores, "B@example.com"); 

        
        assertTrue(foundOrganizador.isPresent());
        assertEquals(2, foundOrganizador.get().getIdOrganizador());
        assertEquals("Organizador B", foundOrganizador.get().getNombreOrganizador());
    }

    @Test
    void testBuscarOrganizadorPorCorreo_OrganizadorNoEncontrado() {
        
        List<Organizadores> organizadores = new ArrayList<>();
        organizadores.add(new Organizadores(1, "Organizador A", "111", "a@example.com"));

       
        Optional<Organizadores> foundOrganizador = buscarOrganizadorPorCorreo.buscarOrganizadorPorCorreo(organizadores, "nonexistent@example.com");

        
        assertFalse(foundOrganizador.isPresent());
    }
}
