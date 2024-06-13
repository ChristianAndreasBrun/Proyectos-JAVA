package christian.brun.domain;

import java.time.LocalDate;

public class Libro {

	// - Atributos
	private String titulo;
	private String autor;
	private String isbn;
	private String editorial;
	private short numeroPaginas;
	private EstadoLibro estado;
	private LocalDate fechaEstado;
	
	
	
	// - Getters y Setters
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public short getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(short numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public EstadoLibro getEstado() {
		return estado;
	}
	public void setEstado(EstadoLibro estado) {
		this.estado = estado;
	}
	public LocalDate getFechaEstado() {
		return fechaEstado;
	}
	public void setFechaEstado(LocalDate fechaEstado) {
		this.fechaEstado = fechaEstado;
	}
	
	
	
	// - Cadena String - Libros
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", editorial=" + editorial
				+ ", numeroPaginas=" + numeroPaginas + ", estado=" + estado + ", fechaEstado=" + fechaEstado + "]";
	}
	
	
	
	// - METODOS -
	//prestar un libro
	public void prestar() {
		
		this.estado = EstadoLibro.PRESTADO;
		this.fechaEstado = LocalDate.now();
	}
	
	//devolver un libro
	public void devolver() {
		
		this.estado = EstadoLibro.DISPONIBLE;
		this.fechaEstado = LocalDate.now();
	}
	
	//consultar informacion
	public String getInformacion() {
		
		return this.toString();	
	}
	
}
