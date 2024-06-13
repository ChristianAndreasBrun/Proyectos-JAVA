package christian.brun.domain;

import java.util.ArrayList;
import java.util.Iterator;

public class Usuario {

	// - Atributos
	private String nombre;
	private String apellido;
	private String dni;
	private ArrayList<Libro> libros;

	
	
	// - Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	
	
	// - Cadena String - Usuarios
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", libros=" + libros + "]";
	}

	
	
	// - METODOS -
	//prestamo de un libro
	public void prestarLibro(Libro libro) {

		libros.add(libro);
	}

	//devolucion de un libro
	public void devolverLibroInterador(Libro libro) {

		Iterator<Libro> iteradorLibros = libros.iterator();

		while (iteradorLibros.hasNext()) 
		{
			Libro i = iteradorLibros.next();
			if (i.getIsbn().equals(libro.getIsbn())) {
				libros.remove(i);
				break;
			}
		}
	}
	
	//consultar informacion
	public String getInformacion() {

		return this.toString();
	}

}
