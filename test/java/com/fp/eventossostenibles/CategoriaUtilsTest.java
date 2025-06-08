package org.iesvdmProyectoTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.iesvdmProyectoMain.Categoria;
import org.iesvdmProyectoMain.CategoriaUtils;
import org.junit.Test;

public class CategoriaUtilsTest {
	 @Test
	    void testBuscarCategoriaPorId_CategoriaEncontrada() {
	        
	        List<Categoria> categorias = new ArrayList<>();
	        categorias.add(new Categoria(1, "Deporte"));
	        categorias.add(new Categoria(2, "Música"));
	        categorias.add(new Categoria(3, "Arte"));

	       
	        Optional<Categoria> foundCategoria = CategoriaUtils.buscarCategoriaPorId(categorias, 2);

	        
	        assertTrue(foundCategoria.isPresent());
	        assertEquals(2, foundCategoria.get().getIdCategoria());
	        assertEquals("Música", foundCategoria.get().getNombreCategoria());
	    }

	    @Test
	    void testBuscarCategoriaPorId_CategoriaNoEncontrada() {
	        
	        List<Categoria> categorias = new ArrayList<>();
	        categorias.add(new Categoria(1, "Deporte"));
	        categorias.add(new Categoria(2, "Música"));

	        
	        Optional<Categoria> foundCategoria = CategoriaUtils.buscarCategoriaPorId(categorias, 99);

	       
	        assertFalse(foundCategoria.isPresent());
	    }

}
