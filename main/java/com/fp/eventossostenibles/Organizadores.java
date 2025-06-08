package org.iesvdmProyectoMain;

public class Organizadores {

	    private int idOrganizador; 
	    private String nombreOrganizador; 
	    private String telefonoOrganizador; 
	    private String correoOrganizador; 

	   
	    public Organizadores() {
	    }

	    
	    public Organizadores(String nombreOrganizador, String telefonoOrganizador, String correoOrganizador) {
	        this.nombreOrganizador = nombreOrganizador;
	        this.telefonoOrganizador = telefonoOrganizador;
	        this.correoOrganizador = correoOrganizador;
	    }

	    
	    public Organizadores(int idOrganizador, String nombreOrganizador, String telefonoOrganizador, String correoOrganizador) {
	        this.idOrganizador = idOrganizador;
	        this.nombreOrganizador = nombreOrganizador;
	        this.telefonoOrganizador = telefonoOrganizador;
	        this.correoOrganizador = correoOrganizador;
	    }

	    

	    public int getIdOrganizador() {
	        return idOrganizador;
	    }

	    public void setIdOrganizador(int idOrganizador) {
	        this.idOrganizador = idOrganizador;
	    }

	    public String getNombreOrganizador() {
	        return nombreOrganizador;
	    }

	    public void setNombreOrganizador(String nombreOrganizador) {
	        this.nombreOrganizador = nombreOrganizador;
	    }

	    public String getTelefonoOrganizador() {
	        return telefonoOrganizador;
	    }

	    public void setTelefonoOrganizador(String telefonoOrganizador) {
	        this.telefonoOrganizador = telefonoOrganizador;
	    }

	    public String getCorreoOrganizador() {
	        return correoOrganizador;
	    }

	    public void setCorreoOrganizador(String correoOrganizador) {
	        this.correoOrganizador = correoOrganizador;
	    }

	    @Override
	    public String toString() {
	        return "Organizadores{" +
	               "idOrganizador=" + idOrganizador +
	               ", nombreOrganizador='" + nombreOrganizador + '\'' +
	               ", telefonoOrganizador='" + telefonoOrganizador + '\'' +
	               ", correoOrganizador='" + correoOrganizador + '\'' +
	               '}';
	    }
	}

