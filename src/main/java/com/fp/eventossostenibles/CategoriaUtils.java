package org.iesvdmProyectoMain;

import java.util.List;
import java.util.Optional;

public class CategoriaUtils {
	
    public static Optional<Categoria> buscarCategoriaPorId(List<Categoria> categorias, int id) {
        for (Categoria categoria : categorias) {
            if (categoria.getIdCategoria() == id) {
                return Optional.of(categoria);
            }
        }
        return Optional.empty();
    }
}
