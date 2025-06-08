package org.iesvdmProyectoMain;


	import java.time.LocalDate; 

	public class Inscripciones {
	  
	    public enum EstadoInscripcion {
	        ACTIVA,
	        CANCELADA
	    }

	    private int idUsuario; 
	    private int idEvento;  
	    private LocalDate fechaInscripcion; 
	    private EstadoInscripcion estadoInscripcion; 

	    
	    public Inscripciones() {
	        
	        this.estadoInscripcion = EstadoInscripcion.ACTIVA;
	    }

	    
	    public Inscripciones(int idUsuario, int idEvento, LocalDate fechaInscripcion) {
	        this.idUsuario = idUsuario;
	        this.idEvento = idEvento;
	        this.fechaInscripcion = fechaInscripcion;
	        this.estadoInscripcion = EstadoInscripcion.ACTIVA; 
	    }

	    
	    public Inscripciones(int idUsuario, int idEvento, LocalDate fechaInscripcion, EstadoInscripcion estadoInscripcion) {
	        this.idUsuario = idUsuario;
	        this.idEvento = idEvento;
	        this.fechaInscripcion = fechaInscripcion;
	        this.estadoInscripcion = estadoInscripcion;
	    }

	    

	    public int getIdUsuario() {
	        return idUsuario;
	    }

	    public void setIdUsuario(int idUsuario) {
	        this.idUsuario = idUsuario;
	    }

	    public int getIdEvento() {
	        return idEvento;
	    }

	    public void setIdEvento(int idEvento) {
	        this.idEvento = idEvento;
	    }

	    public LocalDate getFechaInscripcion() {
	        return fechaInscripcion;
	    }

	    public void setFechaInscripcion(LocalDate fechaInscripcion) {
	        this.fechaInscripcion = fechaInscripcion;
	    }

	    public EstadoInscripcion getEstadoInscripcion() {
	        return estadoInscripcion;
	    }

	    public void setEstadoInscripcion(EstadoInscripcion estadoInscripcion) {
	        this.estadoInscripcion = estadoInscripcion;
	    }

	    @Override
	    public String toString() {
	        return "Inscripciones{" +
	               "idUsuario=" + idUsuario +
	               ", idEvento=" + idEvento +
	               ", fechaInscripcion=" + fechaInscripcion +
	               ", estadoInscripcion=" + estadoInscripcion +
	               '}';
	    }
	}
