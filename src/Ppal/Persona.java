package Ppal;

import java.util.LinkedList;

public class Persona {
    //1. Atributos
    private String dni;
    private String nombre;
    private String apellidos;
    private int telefono;
    private String email;
    private String direccion;
    
    //2. Métodos
    //2.1 Constructor/es  
    
    public Persona(String dni, String nombre, String apellidos, int telefono, String email, String direccion){
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }
    
    //2.2 Otros


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
    public int getTelefono() {
		return telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


    @Override
    public String toString() {
        return "Persona[dni: " + dni + "; "
        		+ "Nombre: " + this.nombre + "; "
        		+ "Apellidos: " + this.apellidos + "; "
        		+ "Teléfono: " + this.telefono + ";"
        		+ "Email: " + this.email + ";"
        		+ "Dirección: " + this.direccion + "]";
    }

    @Override
    public boolean equals(Object obj) {
        boolean iguales = false;
        Persona per = (Persona) obj;
        if(this.dni.equals(per.getDni())){
            iguales = true;
        }
        return iguales;
    }
}
