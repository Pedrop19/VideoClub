package Ppal;

import java.time.LocalDate;
import java.util.Date;

public class Alquiler {
	private int id_alquiler;
	private Persona persona;
	private LocalDate fecha_inicio;
	private Date fecha_fin;
	private Peliculas_Series pel_ser;
	
	public Alquiler(int id_alquiler, Persona persona, LocalDate fecha_inicio, Date fecha_fin, Peliculas_Series pel_ser) {
		
		this.id_alquiler = id_alquiler;
		this.persona = persona;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.pel_ser = pel_ser;
		
	}

	
	public int getId_alquiler() {
		return id_alquiler;
	}


	public void setId_alquiler(int id_alquiler) {
		this.id_alquiler = id_alquiler;
	}


	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public LocalDate getFecha_inicio() {
		return fecha_inicio;
	}


	public void setFecha_inicio(LocalDate fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}


	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public Peliculas_Series getPel_ser() {
		return pel_ser;
	}

	public void setPel_ser(Peliculas_Series pel_ser) {
		this.pel_ser = pel_ser;
	}

	@Override
	public boolean equals(Object obj) {
		  boolean result = false;
	      Alquiler a = (Alquiler) obj;
	      if(this.id_alquiler == a.getId_alquiler())
	    	  result = true;
	      return result;
	}

	@Override
	public String toString() {
		return "Alquiler[id: " + id_alquiler + "; "
        		+ "Persona: " + this.persona + "; "
        		+ "Fecha de Inicio: " + this.fecha_inicio + "; "
        		+ "Fecha a Devolver: " + this.fecha_fin + ";" 
        		+ "Pelicula/Serie Alquilada: " + this.pel_ser + "]";
	}
	
	
}
