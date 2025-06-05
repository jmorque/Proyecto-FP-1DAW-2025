package org.iesvdmProyectoMain;

public class imprimirDetallesCategoria {
	
	public static void imprimirDetallesCategoria(Categoria categoria) {
        if (categoria != null) {
            System.out.println("Detalles de la Categoría:");
            System.out.println("ID: " + categoria.getIdCategoria());
            System.out.println("Nombre: " + categoria.getNombreCategoria());
        } else {
            System.out.println("La categoría proporcionada es nula y no se pueden mostrar los detalles.");
        }
    }
}
