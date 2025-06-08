package org.iesvdmProyectoMain;


	import java.time.LocalDate; 

	public class Eventos {

	    private int idEvento; 
	    private int idCategoria; 
	    private int idUbicacion; 
	    private String nombreEvento; 
	    private double duracionEvento; 
	    private LocalDate fechaEvento; 

	   
	    public Eventos() {
	    }

	    
	    public Eventos(int idCategoria, int idUbicacion, String nombreEvento, double duracionEvento, LocalDate fechaEvento) {
	        this.idCategoria = idCategoria;
	        this.idUbicacion = idUbicacion;
	        this.nombreEvento = nombreEvento;
	        this.duracionEvento = duracionEvento;
	        this.fechaEvento = fechaEvento;
	    }

	    
	    public Eventos(int idEvento, int idCategoria, int idUbicacion, String nombreEvento, double duracionEvento, LocalDate fechaEvento) {
	        this.idEvento = idEvento;
	        this.idCategoria = idCategoria;
	        this.idUbicacion = idUbicacion;
	        this.nombreEvento = nombreEvento;
	        this.duracionEvento = duracionEvento;
	        this.fechaEvento = fechaEvento;
	    }

	    

	    public int getIdEvento() {
	        return idEvento;
	    }

	    public void setIdEvento(int idEvento) {
	        this.idEvento = idEvento;
	    }

	    public int getIdCategoria() {
	        return idCategoria;
	    }

	    public void setIdCategoria(int idCategoria) {
	        this.idCategoria = idCategoria;
	    }

	    public int getIdUbicacion() {
	        return idUbicacion;
	    }

	    public void setIdUbicacion(int idUbicacion) {
	        this.idUbicacion = idUbicacion;
	    }

	    public String getNombreEvento() {
	        return nombreEvento;
	    }

	    public void setNombreEvento(String nombreEvento) {
	        this.nombreEvento = nombreEvento;
	    }

	    public double getDuracionEvento() {
	        return duracionEvento;
	    }

	    public void setDuracionEvento(double duracionEvento) {
	        this.duracionEvento = duracionEvento;
	    }

	    public LocalDate getFechaEvento() {
	        return fechaEvento;
	    }

	    public void setFechaEvento(LocalDate fechaEvento) {
	        this.fechaEvento = fechaEvento;
	    }

	    @Override
	    public String toString() {
	        return "Evento{" +
	               "idEvento=" + idEvento +
	               ", idCategoria=" + idCategoria +
	               ", idUbicacion=" + idUbicacion +
	               ", nombreEvento='" + nombreEvento + '\'' +
	               ", duracionEvento=" + duracionEvento +
	               ", fechaEvento=" + fechaEvento +
	               '}';
	    }
	}