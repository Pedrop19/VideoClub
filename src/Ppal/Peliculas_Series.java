package Ppal;


public class Peliculas_Series {
	
	private int idPel_Ser;
	private String titulo;
	private String nombre_director;
	private Categoria categoria;
	
	public Peliculas_Series(int idPel_Ser, String titulo, String nombre_director, Categoria categoria) {
		this.idPel_Ser = idPel_Ser;
		this.titulo = titulo;
		this.nombre_director = nombre_director;
		this.categoria = categoria;
	}

	public int getIdPel_Ser() {
		return idPel_Ser;
	}

	public void setIdPel_Ser(int idPel_Ser) {
		this.idPel_Ser = idPel_Ser;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombre_director() {
		return nombre_director;
	}

	public void setNombre_director(String nombre_director) {
		this.nombre_director = nombre_director;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public boolean equals(Object obj) {
		  boolean result = false;
	      Peliculas_Series p = (Peliculas_Series) obj;
	      if(this.idPel_Ser == p.getIdPel_Ser	())
	    	  result = true;
	      return result;
	}

	@Override
	public String toString() {
		return "Pelicula/Serie[id: " + idPel_Ser + "; "
        		+ "titulo: " + this.titulo + "; "
        		+ "Director: " + this.nombre_director + "; "
        		+ "Categoria: " + this.categoria + "]";
	}
	
	
}
