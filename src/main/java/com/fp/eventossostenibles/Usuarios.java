package org.iesvdmProyectoMain;

public class Usuarios {

	    private int idUsuario; 
	    private String nombre; 
	    private String correoElectronico; 
	    private String contrasena; 

	    
	    public Usuarios() {
	    }

	   
	    public  Usuarios(String nombre, String correoElectronico, String contrasena) {
	        this.nombre = nombre;
	        this.correoElectronico = correoElectronico;
	        this.contrasena = contrasena;
	    }

	    
	    public Usuarios(int idUsuario, String nombre, String correoElectronico, String contrasena) {
	        this.idUsuario = idUsuario;
	        this.nombre = nombre;
	        this.correoElectronico = correoElectronico;
	        this.contrasena = contrasena;
	    }

	    // Getters y Setters

	    public int getIdUsuario() {
	        return idUsuario;
	    }

	    public void setIdUsuario(int idUsuario) {
	        this.idUsuario = idUsuario;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getCorreoElectronico() {
	        return correoElectronico;
	    }

	    public void setCorreoElectronico(String correoElectronico) {
	        this.correoElectronico = correoElectronico;
	    }

	    public String getContrasena() {
	        return contrasena;
	    }

	    public void setContrasena(String contrasena) {
	        this.contrasena = contrasena;
	    }

	    @Override
	    public String toString() {
	        return "Usuarios{" +
	               "idUsuario=" + idUsuario +
	               ", nombre='" + nombre + '\'' +
	               ", correoElectronico='" + correoElectronico + '\'' +
	               '}';
	    }
	}
