package org.iesvdmProyectoTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.iesvdmProyectoMain.Usuarios;
import org.iesvdmProyectoMain.buscarUsuarioPorCorreo;
import org.junit.Test;

public class UsuarioUtilsTest {
	  @Test
	    void testBuscarUsuarioPorCorreo_UsuarioEncontrado() {
	        
	        List<Usuarios> usuarios = new ArrayList<>();
	        usuarios.add(new Usuarios(1, "Usuario Uno", "uno@mail.com", "pass123"));
	        usuarios.add(new Usuarios(2, "Usuario Dos", "dos@mail.com", "pass456"));
	        usuarios.add(new Usuarios(3, "Usuario Tres", "tres@mail.com", "pass789"));

	       
	        Optional<Usuarios> foundUsuario = buscarUsuarioPorCorreo.buscarUsuarioPorCorreo(usuarios, "dOS@mail.com"); // Case insensitive

	        
	        assertTrue(foundUsuario.isPresent());
	        assertEquals(2, foundUsuario.get().getIdUsuario());
	        assertEquals("Usuario Dos", foundUsuario.get().getNombre());
	    }

	    @Test
	    void testBuscarUsuarioPorCorreo_UsuarioNoEncontrado() {
	        
	        List<Usuarios> usuarios = new ArrayList<>();
	        usuarios.add(new Usuarios(1, "Usuario Uno", "uno@mail.com", "pass123"));

	        
	        Optional<Usuarios> foundUsuario = buscarUsuarioPorCorreo.buscarUsuarioPorCorreo(usuarios, "nonexistent@mail.com");

	        
	        assertFalse(foundUsuario.isPresent());
	    }
}
