package org.iesvdmProyectoMain;

public class Ubicaciones {
	

	    private int idUbicacion; 
	    private String ubicacionEvento; 
	    private String tipoUbicacion; 
	    private String direccionUbicacion; 
	    private String enlaceUbicacion; 

	    
	    public Ubicaciones() {
	    }

	    
	    public Ubicaciones(String ubicacionEvento, String tipoUbicacion, String direccionUbicacion, String enlaceUbicacion) {
	        this.ubicacionEvento = ubicacionEvento;
	        this.tipoUbicacion = tipoUbicacion;
	        this.direccionUbicacion = direccionUbicacion;
	        this.enlaceUbicacion = enlaceUbicacion;
	    }

	    
	    public Ubicaciones(int idUbicacion, String ubicacionEvento, String tipoUbicacion, String direccionUbicacion, String enlaceUbicacion) {
	        this.idUbicacion = idUbicacion;
	        this.ubicacionEvento = ubicacionEvento;
	        this.tipoUbicacion = tipoUbicacion;
	        this.direccionUbicacion = direccionUbicacion;
	        this.enlaceUbicacion = enlaceUbicacion;
	    }

	    

	    public int getIdUbicacion() {
	        return idUbicacion;
	    }

	    public void setIdUbicacion(int idUbicacion) {
	        this.idUbicacion = idUbicacion;
	    }

	    public String getUbicacionEvento() {
	        return ubicacionEvento;
	    }

	    public void setUbicacionEvento(String ubicacionEvento) {
	        this.ubicacionEvento = ubicacionEvento;
	    }

	    public String getTipoUbicacion() {
	        return tipoUbicacion;
	    }

	    public void setTipoUbicacion(String tipoUbicacion) {
	        this.tipoUbicacion = tipoUbicacion;
	    }

	    public String getDireccionUbicacion() {
	        return direccionUbicacion;
	    }

	    public void setDireccionUbicacion(String direccionUbicacion) {
	        this.direccionUbicacion = direccionUbicacion;
	    }

	    public String getEnlaceUbicacion() {
	        return enlaceUbicacion;
	    }

	    public void setEnlaceUbicacion(String enlaceUbicacion) {
	        this.enlaceUbicacion = enlaceUbicacion;
	    }

	    @Override
	    public String toString() {
	        return "Ubicaciones{" +
	               "idUbicacion=" + idUbicacion +
	               ", ubicacionEvento='" + ubicacionEvento + '\'' +
	               ", tipoUbicacion='" + tipoUbicacion + '\'' +
	               ", direccionUbicacion='" + direccionUbicacion + '\'' +
	               ", enlaceUbicacion='" + enlaceUbicacion + '\'' +
	               '}';
	    }
	}
